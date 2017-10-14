package kaoshi2;

import java.util.Scanner;

public class MessTese {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		MessageService mgs=new MessageService();
		boolean flg=false;
		do{
		mgs.zhujiemian();
		System.out.println("请选择");
		int xuanze=scanner.nextInt();
		mgs.cdxuanze(xuanze);
		if(xuanze==3){
			flg=true;
			break;
		}
		}while(flg!=true);
		scanner.close();
	}
}
