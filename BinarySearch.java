import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		int beg=0,end=n-1;
		int mid=(beg+end)/2;
		System.out.println("Element which need to be searched:");
		Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		sc.close();
		while(beg<=end)
		{
			if(search>arr[mid])
			{
				beg=mid+1;
			}
			else if(search == arr[mid])
			{
				System.out.println("Found at location:- "+(mid+1));
				break;
			}
			else
			{
				end=mid-1;
			}
			mid=(beg+end)/2;
		}
		if(beg>end)
		{
			System.out.println("Element not found");
		}
	}
}
