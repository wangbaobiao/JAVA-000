- 串行GC
	-XX:+UseSerialGC	
	STW时间较长，不适合在服务器使用
- 并行GC
	-XX:+UseParallelGC	
	多线程运作，相较于串行GC，总的暂停时间变短
- CMS	
    -XX:+UseConcMarkSweepGC	
    将耗时长的并发标记和并发清除操作和用户线程并行
- G1	
    -XX:+UseG1GC	
    可预测的停顿()允许程序通过参数约定垃圾收集的时间