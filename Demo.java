class Demo 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		new StaticCodeDemo;
		new StaticCodeDemo;
	}
}

class StaticCodeDemo
{
	static 
	{
		System.out.println("this is static code");
	}
}
/*
Person p = new Person("zhangsan",20);

这句话都做了什么事？
1.因为new用到了Person.class，所以会先找到Person.class文件并加载到内存中。
2.执行该类中的static代码块，如果有的话，给Person.class类进行初始化。
3.在堆内存中开辟空间，分配内存地址。
4.在堆内存中建立对象的特有属性，并进行默认初始化。
5.对属性进行显示初始化。
6.对属性进行构造代码块初始化。
7.对对象进行对应的构造函数初始化。
8.将内存地址赋给栈内存中的p变量。
*/