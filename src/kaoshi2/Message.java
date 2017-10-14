package kaoshi2;

public class Message {
	private String username;// 留言人
	private int id;// 留言ID
	private String contents; // 留言内容
	private String title; // 留言标题
	private String createTime; // 留言时间

	public Message() {

	}

	public Message(String username, String createTime, String title,
			String contents) {
		this.username = username;
		this.createTime = createTime;
		this.title = title;
		this.contents = contents;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
