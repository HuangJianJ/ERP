package Kaoshi;
/**
 * 图书类
 * @author jianjun
 *@date2017年5月17日 下午3:41:24
 */
public class Book {
	private int bookId; 		//图书编号
	private	String bookName; 	//图书名称
	private	double price;		//图书单价
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
	
	 
   }
