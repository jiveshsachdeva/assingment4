
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int k;
		k=n;
		int r;
		int count=0;
		while(k>0)
		{
			r=k%10;
			k=k/10;
			count++;
		}
		int sum=0;
		k=n;
		while(k>0)
		{
			r=k%10;
			sum=sum+pow(r,count);
			k=k/10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}

	private static int pow(int r, int count) {
		// TODO Auto-generated method stub
		int f=1;
		for(int i=1;i<=count;i++)
		{
			f=f*r;
		}
		return f;
	}

}
