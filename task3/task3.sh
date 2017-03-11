#!/bin/bash
access=/usr/local/nginx/logs/access.log
#每个IP的访问次数
echo "访问次数"
cat access.log | awk  '{print $1}' |sort|uniq >ipnum.txt
for i in `cat ipnum.txt`
do 
ipCount=`cat access.log | grep $i | wc -l`
echo "ip地址 ${i} 的请求数  ${ipCount}"

#延迟时间小于600ms的
echo"小于600ms的"
cat ${access} | awk '{if($10<0.6) a=a+1}END{print a}'
#延迟时间大于800ms的
echo"大于800ms的"
cat ${access} | awk '{if($10>0.8) b=b+1}END{print b}'

done