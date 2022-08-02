
//java的快速入门；演示java的开发步骤
//对代码的相关说明
//1.public class Hello 表示Hello是一个类，是一个public公有的类
//2.Hello{ }表示一个类的开始和结束
//3.public static void main(String[] args)表示一个主方法，即我们程序的入口
//4.main(){}表示方法的开始和结束
//5.System.out.println("hello,world~")；表示输出"hello，world~"到屏幕
//6. ；表示语句结束

public class Hello {

	//编写一个main方法
	public static void main(String[] args) {
		System.out.println("王洪 is studying java");
	}
}
//一个源文件中最多只能有一个pubilc类。其他类的个数不限
//Dog是一个类，编译后，每一个类生成一个.class文件
class Dog{
	public static void main(String[] args) {
		System.out.println("hello 小狗狗");
    }
}
//错误记录：
//1.第一次做程序时没有注意大小写：String写成了string
//2.由于变动了java JDK8位置，导致程序不能运行，报错:Error: could not open `D:\Java JDK8\lib\amd64\jvm.cfg'
//3.符号之间的空格没注意，分号用成了中文分号
//没有把文件编码设置成GBK

