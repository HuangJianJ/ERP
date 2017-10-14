package 图书管理系统;

import java.util.*;

/**
 * 图书类
 * 
 * @author jianjun
 * @date2017年5月18日 下午4:19:27
 */
public class Book {
	private int bookId; // 图书编号
	private String bookName; // 图书名称
	private double price; // 图书单价
	private int storage; // 库存数量
	// 创建一个集合
	ArrayList<Book> list = new ArrayList<Book>();
	public Book() {
		// TODO 自动生成的构造函数存根
	}

	// 构造方法，把集合里面的值导入到构造函数里面
	public Book(int bookId, String bookName, double price, int storage) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.storage = storage;
	}


	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

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

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	// 添加 把需要的值导入到集合里面去
	public void addElement() {
		storage = 30;
		Book book1 = new Book(1, "Java教程", 30.6, 30);
		list.add(book1);
		storage = 40;
		Book book2 = new Book(2, "JSP指南", 42.1, 40);
		list.add(book2);
		storage = 15;
		Book book3 = new Book(3, "SSH架构", 47.3, 15);
		list.add(book3);
	}

	// 显示 购买图书名称和图书价格以及数量和总消费还有剩余库存。
	public void showElement() {
		System.out.println("\t图书列表 \t");
		System.out.println("图书编号\t图书名称\t\t图书单价\t库存数量");
		System.out.println("--------------------------------------");
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x).getBookId() + "\t"
					+ list.get(x).getBookName() + "\t\t"
					+ list.get(x).getPrice() + "\t" + list.get(x).getStorage());
		}
		System.out.println("--------------------------------------");
	}

}
