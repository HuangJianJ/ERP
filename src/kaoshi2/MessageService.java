package kaoshi2;
/**
 * 实现类
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageService implements MessageDao {
	Scanner scanner = new Scanner(System.in);
	List<Message> list = new ArrayList<Message>();// 用于存储留言信息
	
	public MessageService(){
		liuyan();
	}

	// 主界面
	public void zhujiemian() {
		System.out.println("——欢迎登陆留言版系统——");
		System.out.println("-----主菜单-----");
		System.out.println("1.查询留言");
		System.out.println("2.添加留言");
		System.out.println("3.退出系统");
	}

	// 给留言系统初始化。
	public void liuyan() {
		Message mg1 = new Message("黄建军", "2008-08-09", "2008年奥运开幕式",
				"开幕式非常精彩，大气磅礴，极富创意");
		Message mg2 = new Message("黄建军", "2007-01-12", "欢迎您", "欢迎您学习北大青鸟课程");
		Message mg3 = new Message("黄建军", "2017-05-25", "OP考试", "学海无涯苦作舟，学无止境");
		list.add(mg1);
		list.add(mg2);
		list.add(mg3);
	}

	// 添加留言信息
	public void tianjia() {
		String tianjia = null;
		do {
			System.out.println("请输入留言人姓名");
			String username = scanner.next();
			System.out.println("请输入留言时间");
			String createTime = scanner.next();
			System.out.println("请输入留言标题");
			String title = scanner.next();
			System.out.println("请输入留言内容");
			String contents = scanner.next();
			Message mg4 = new Message(username, createTime, title, contents);
			list.add(mg4);
			System.out.println("信息添加成功，是否继续添加?:y/n");
			tianjia = scanner.next();
			if (tianjia.equalsIgnoreCase("n")) {
				break;
			}
		} while (tianjia.equalsIgnoreCase("y"));
	}
	//显示留言内容
	public void xsliuyan(){
		System.out.println("留言人："+"\t留言时间："+"\t\t留言标题："+"\t\t留言内容：");
		for(int i=0;i<list.size();i++){
			dyliuyan(i);
		}
	}
	//打印留言信息
	public void dyliuyan(int i) {
		System.out.println(list.get(i).getUserName()+"\t"+list.get(i).getCreateTime()+"\t"
				+list.get(i).getTitle()+"\t"+list.get(i).getContents());
	}
	//菜单选择
	public void cdxuanze(int xuanze){
		switch (xuanze) {
		case 1:
			xsliuyan();
			break;
		case 2:
			//添加留言信息
			tianjia();
			break;
		case 3:
			System.out.println("=============================");
			System.out.println("===程序已退出，谢谢使用......===");
			System.out.println("=============================");
			scanner.close();
			System.exit(0);
			break;
	}
	}
}
