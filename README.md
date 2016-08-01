# AIDLDemo
自己写的一个简单AIDL进程间通信实例，包括client和server，方便以后用到的话可以直接参考用 
需要注意的几点
	aidl包名和bean类的包名得一致
	aidl中有除了基本数据类型、String、CharSequence的，其他的都要导包 即使是在同一个包下的文件，还需要传入tag
	aidl使用实现了Parcelable类的Bean类 需要声明 parcelable Bean;
	android studio Parcelable模板生成的类的对象只支持为 in 的定向 tag，想要实现 out/inout 的话 需要自己写read方法
	android studio 中Gradle默认将文件路径设置在java文件夹下，所以 需要设置一下build中的sourceSets 