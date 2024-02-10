
import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		//Nhap vao ban phim
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten: ");
		String hoten=sc.nextLine();
		System.out.println("Nhap ma sinh vien: ");
		int ma=sc.nextInt();
		System.out.println("Nhap vao diem trung binh: ");
		float dtb=sc.nextFloat();
		System.out.println("----------------------");
		//Xuat thong tin ra mh
		System.out.println("Ho va ten: "+hoten);
		System.out.println("Ma: "+ma);
		System.out.println("Diem: "+dtb);
		int a=10,b=5;
		System.out.println("a= "+a+'\n'+"b= "+b);
		char c =(char)sc.next().charAt(0);//nhap xuat ki tu
		String a1 = sc.next();
		String b1 = sc.next();
//		if (a1.equals(b1)) {	//so sanh ten
//			System.out.println("two people have the same name");
//		} else {
//			System.out.println("two people don't have the same name");
//		}
		if(a1.compareTo(b1)==0)
            System.out.println("two people have the same name");
        else
            System.out.println("two people don't have the same name");
	}
}
