package 图书管理系统;

import java.util.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 * 
 * @author jianjun
 * @date2017年5月18日 下午4:21:46
 */
public class OrderItem {
	private String bookName; // 图书名称
	private double price; // 图书单价
	private int num; // 客户输入买书数量
	int choice; // 客户输入买书编号
	private Book b; // 相当于他Book b=new Book();
	private Order order; // 相当于他Order order=new Order();
	// 用于记录循环三次就停下来
	int hao;
	int count;
	// 用于进行标记
	boolean bool1 = false;
	// 建立数组避免重复
	int[] arr = new int[3];
	Date date = new Date();
	Calendar cale = Calendar.getInstance();
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",
			Locale.ENGLISH);
	//数字格式化，保留小数点一位。
	DecimalFormat df = new DecimalFormat("0.0");
	Scanner input = new Scanner(System.in);
	// 创建一个集合
	ArrayList<OrderItem> list2 = new ArrayList<OrderItem>();

	public OrderItem(Order order, Book b) {
		this.order = order;
		this.b = b;
	}

	// 构造方法
	public OrderItem(String bookName, double price, int num) {
		this.bookName = bookName;
		this.price = price;
		this.num = num;
	}

	// 当成员变量有值的情况下，我们要取出成员变量的值的话，我们只能用get
	// 当成员变量没有被赋值的情况下，我们即使能取出值的话，也是没有具体的值。
	// 所以我们必须要先放入一个值然后才能用get取值。
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	// 购书
	public void gouShu() {
		b.showElement();
		print();
		hao++;
		//八大类型的转型的上下级问题
		//char a='你';
		//int b=5;
		///char c=(char) (a+b);
		order.setOrderId("000" + hao);
	}

	// 获取数据，放入集合
	public void addShu() {
		num = 0;
		OrderItem o1 = new OrderItem("Java教程", 30.6, num);
		list2.add(o1);
		num = 0;
		OrderItem o2 = new OrderItem("JSP指南", 42.1, num);
		list2.add(o2);
		num = 0;
		OrderItem o3 = new OrderItem("SSH架构", 47.3, num);
		list2.add(o3);
	}

	// 图书订单
	public void dingDan() {
		System.out.println("\t图书订单\t");
		System.out.print("图书订单号:");
		System.out.println(order.getOrderId());
		System.out.println("图书名称\t\t购买数量\t图书单价");
		System.out.println("--------------------------");
		for (int x = 0; x < list2.size(); x++) {
			System.out.println(list2.get(x).getBookName() + "\t\t"
					+ list2.get(x).getNum() + "\t" + list2.get(x).getPrice());
			order.total += list2.get(x).getPrice() * list2.get(x).getNum();
		}
		System.out.println("--------------------------");
		System.out.println("订单金额:\t\t\t" + df.format(order.total));
		System.out.println("日期:" + cale.getTime());
		System.out.println("日期:" + f.format(date));
	}

	// 循环三次取值
	public void print() {
		do {
			System.out.print("请输入图书编号选择图书:");
			choice = input.nextInt();
			if (choice <= 3 && choice > 0) {
				if (count == 0) {
					arr[0] = choice;
					System.out.print("请输入购买图书数量:");
					num = input.nextInt();
					System.out.println("请继续购买图书。");
					jiSuan(num);
					bool1 = true;
					count++;
				} else if (count == 1) {
					if (arr[0] == choice) {
						System.out.println("重新输入，已购买此书！");
						bool1 = true;
					} else {
						arr[1] = choice;
						System.out.print("请输入购买图书数量:");
						num = input.nextInt();
						System.out.println("请继续购买图书。");
						jiSuan(num);
						bool1 = true;
						count++;
					}
				} else if (count == 2) {
					if (arr[0] == choice || arr[1] == choice) {
						System.out.println("重新输入，已购买此书！");
						num = input.nextInt();
						bool1 = true;
					} else {
						arr[2] = choice;
						System.out.print("请输入购买图书数量:");
						num = input.nextInt();
						jiSuan(num);
						bool1 = false;
						count = 0;
						break;
					}
				}
			} else {
				System.out.println("请重新输入！");
				bool1 = true;
			}
		} while (bool1 == true);

	}

	// 用于记录库存的书的数量
	// 修改 choice 客户代表接受的键盘输入的编号 int num代表客户购买的数量
	public void jiSuan(int num) {
		for (int y = 0; y < b.list.size(); y++) {
			// 调用Book类里面的集合，在调用里面的编号
			if (choice == b.list.get(y).getBookId()) {
				int a = b.list.get(y).getStorage() - num;
				b.list.get(y).setStorage(a);
				list2.get(y).setNum(num);
				break;
			}
		}
	}
}
