import java.util.Scanner;
public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		for(int i=0;i<=a;i+=2)
		{
			System.out.println(i);
		}

	}

}
