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

��仰������ʲô�£�
1.��Ϊnew�õ���Person.class�����Ի����ҵ�Person.class�ļ������ص��ڴ��С�
2.ִ�и����е�static����飬����еĻ�����Person.class����г�ʼ����
3.�ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ��
4.�ڶ��ڴ��н���������������ԣ�������Ĭ�ϳ�ʼ����
5.�����Խ�����ʾ��ʼ����
6.�����Խ��й��������ʼ����
7.�Զ�����ж�Ӧ�Ĺ��캯����ʼ����
8.���ڴ��ַ����ջ�ڴ��е�p������
*/