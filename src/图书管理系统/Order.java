package 图书管理系统;

/**
 * 订单类
 * 
 * @author jianjun
 * @date2017年5月18日 下午4:19:08
 */
public class Order {
	private String orderId; // 订单号
	double total; // 订单总额
	private int items; // 订单项列表

	public Order() {

	}

	// 构造方法
	public Order(String orderId, double total, int items) {
		this.orderId = orderId;
		this.total = total;
		this.items = items;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

}
