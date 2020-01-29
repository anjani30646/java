import java.util.*;
public class MyClass
{
	String sname,ssymbol;
	double pprice,cprice;
	MyClass(String na,String ss,double pp,double cp)
	{
		sname=na;
		ssymbol=ss;
		pprice=pp;
		cprice=cp;
	}
	public double getChangePercentage()
	{
		return (((cprice-pprice)/cprice)*100);
	}
	public static void main(String args[])
	{
		MyClass m=new MyClass("hai","+",20,30);
		System.out.println(m.getChangePercentage());
	}
}