JHSDB工具:
java -cp .\sa-jdi.jar sun.jvm.hotspot.HSDB

tools->heap parameters可以查看GC eden\from\to\old的划分
常量池（方法区）
字符串常量池：
字符串--string：
1、安全；
2、hash唯一；
3、字符串常量池
