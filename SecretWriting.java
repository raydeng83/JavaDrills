import java.io.*;
import java.security.*;

import javax.crypto.*;

import sun.misc.*;

public class SecretWriting {
  public static void main(String[] args) throws Exception {
    // Check arguments.
    if (args.length < 2) {
      System.out.println("Usage: SecretWriting -e|-d text");
      return;
    }

    // Get or create key.
    Key key;
    try {
      ObjectInputStream in = new ObjectInputStream(
          new FileInputStream("SecretKey.ser"));
      key = (Key)in.readObject();
      in.close();
    }
    catch (FileNotFoundException fnfe) {
      KeyGenerator generator = KeyGenerator.getInstance("DES");
      generator.init(new SecureRandom());
      key = generator.generateKey();
      ObjectOutputStream out = new ObjectOutputStream(
          new FileOutputStream("SecretKey.ser"));
      out.writeObject(key);
      out.close();
    }

    // Get a cipher object.
    Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

    // Encrypt or decrypt the input string.
    if (args[0].indexOf("e") != -1) {
      cipher.init(Cipher.ENCRYPT_MODE, key);
      String amalgam = args[1];
      for (int i = 2; i < args.length; i++)
        amalgam += " " + args[i];
      byte[] stringBytes = amalgam.getBytes("UTF8");
      byte[] raw = cipher.doFinal(stringBytes);
      BASE64Encoder encoder = new BASE64Encoder();
      String base64 = encoder.encode(raw);
      System.out.println(base64);
    }
    else if (args[0].indexOf("d") != -1) {
      cipher.init(Cipher.DECRYPT_MODE, key);
      BASE64Decoder decoder = new BASE64Decoder();
      byte[] raw = decoder.decodeBuffer(args[1]);
      byte[] stringBytes = cipher.doFinal(raw);
      String result = new String(stringBytes, "UTF8");
      System.out.println(result);
    }
  }
}
