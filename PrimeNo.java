import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=2;i<=n;i++)
		{
			k=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=1;
				}
			}
			if(k!=1) {
				System.out.println(i);
			}
		}
	}

}
