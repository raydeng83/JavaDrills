import re
from operator import add
from pyspark import SparkConf, SparkContext
from pyspark.sql import SQLContext
conf = SparkConf().setMaster("local").setAppName("GN-Extract")
sc = SparkContext(conf=conf)
sqlContext=SQLContext(sc)
file_in=sc.textFile('sample.csv')

print('number of lines in file: %s' % file_in.count())

chars = file_in.map(lambda s: len(s)).reduce(add)
print('number of characters in file: %s' % chars)

words=file_in.flatMap(lambda line: re.split('\W+', line.lower().strip()))
words = words.filter(lambda x: len(x) > 3)
words = words.map(lambda w: (w,1))
words = words.reduceByKey(add)

print ('number of words in flie: %s' % words)
