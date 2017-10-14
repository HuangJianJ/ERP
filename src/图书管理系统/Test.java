package 图书管理系统;
import java.util.*;
public class Test {
public static void main(String[] args) {	
	boolean bool=false;
	//接受键盘输入
	Scanner input2=new Scanner(System.in);
	
	//新建一个对象
	Book b=new Book();
	//新建一个对象
	Order o=new Order();
	//新建一个对象
	b.addElement();
	
	OrderItem oder=new OrderItem(o,b);
	oder.addShu();
	do{oder.gouShu();
	oder.dingDan();	
	System.out.println("继续输入:(y/n):");
	String s=input2.next();
	if(s.equals("y"))
	{
		bool=true;
	}
	else if(s.equals("n"))
	{
		System.out.println("谢谢使用，退出中！");
		System.exit(0);
		input2.close();
	}
	else
	{
		System.out.println("输入错误，请重新输入");
		bool=true;
	}
	}while(bool==true);
}

}
