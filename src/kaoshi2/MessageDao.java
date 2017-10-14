package kaoshi2;
/**
 * 接口类
 * @author jianjun
 *@date2017年5月25日 下午5:09:36
 */
public interface MessageDao {
	// 主界面
	void zhujiemian();
	// 给留言系统初始化。
	void liuyan();
	// 添加留言信息
	void tianjia();
	//显示留言内容
	void xsliuyan();
	//打印留言信息
	void dyliuyan(int i);
	//菜单选择
	void cdxuanze(int xuanze);
}
