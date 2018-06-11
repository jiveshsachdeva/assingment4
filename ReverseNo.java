import java.util.Scanner;
public class ReverseNo {

	public static int Reverse(int i)
	{
		int r=0,s=0;
		int j=i;
		while(j!=0)
		{
			r=j%10;
			s=r+s*10;
			j=j/10;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sum=Reverse(n);
		System.out.println("Reverse:-"+sum);
	}
}
