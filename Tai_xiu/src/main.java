import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		double AccountBalance=1000000;
		Scanner sc=new Scanner(System.in);
		int chon=0;
		System.out.println("-------------Chào mừng đến với FB88-------------");
		do {
		System.out.println("   -------------Mời bạn lựa chọn-------------");
		System.out.println("Chọn 1 để chơi");
		System.out.println("Chọn 0 để thoát");
		chon=sc.nextInt();
		if(chon==1) {
			System.out.println("So du tai khoan: "+AccountBalance);
			double bet=0;
			do {
			System.out.println("Nhap vao so tien ban muon dat cuoc: ");
			bet=sc.nextDouble();
			}
				while(bet<=0 ||bet>AccountBalance);
			int taixiu=0;
			do {
				System.out.println("Chọn 1(Xỉu), 2(Tài):");
				taixiu=sc.nextInt();
				}
				while(taixiu!=1 && taixiu!=2);
			Random dice1= new Random();
			Random dice2= new Random();
			Random dice3= new Random();
			
			int num1=dice1.nextInt(5)+1;
			int num2=dice2.nextInt(5)+1;
			int num3=dice3.nextInt(5)+1;
			int sum=num1+num2+num3;
			System.out.println("Kết quả: "+num1+" - "+num2+" - "+num3);
			System.out.println("Tổng: "+sum);
			if(sum==3 || sum==18) {
				System.out.println("Bão ==>Nhà cái ăn hết, bạn đã thua");
				AccountBalance-=bet;
				System.out.println("Tài khoản của bạn còn: "+AccountBalance);
			}
			else if(sum>=4 && sum<=10) {
				System.out.println("=>Xỉu");
				if(taixiu==1) {
					System.out.println("Bạn đã thắng");
					AccountBalance+=(bet*1.5);
					System.out.println("Tài khoản của bạn còn: "+AccountBalance);
				}
				else {
					System.out.println("Bạn đã thua");
					AccountBalance-=(bet);
					System.out.println("Tài khoản của bạn còn: "+AccountBalance);
				}
			}
			else {
				System.out.println("=>Tài");
				if(taixiu==2) {
					System.out.println("Bạn đã thắng");
					AccountBalance+=(bet*1.5);
					System.out.println("Tài khoản của bạn còn: "+AccountBalance);
				}
				else {
					System.out.println("Bạn đã thua");
					AccountBalance-=(bet);
					System.out.println("Tài khoản của bạn còn: "+AccountBalance);
				}
			}
		}
		}
		while(chon==1);
	}
}
