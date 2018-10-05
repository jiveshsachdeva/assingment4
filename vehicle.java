import java.util.*;

interface vehicle
{
	void speedup(int a);
	void applybreak(int a);
	void changegear();
}

class bicycle implements vehicle
{
	int speed=20;
	public void speedup(int a)
	{
		speed+=a;
		System.out.println(speed);
	}

	public void applybreak(int a)
	{
		speed-=a;
		System.out.println(speed);
	}

	public void changegear()
	{
		System.out.println("Overspeed");
	}
}

class bike implements vehicle
{
	int speed=50;
	public void speedup(int a)
	{
		speed+=a;
		System.out.println(speed);
	}

	public void applybreak(int a)
	{
		speed-=a;
		System.out.println(speed);
	}

	public void changegear()
	{
		System.out.println("Gear failure");
	}
}

class speed
{
	public static void main(String[] args) {
		vehicle ob=new bicycle();
		vehicle obj=new bike();
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter speed increase in bicycle : ");
		a=sc.nextInt();
		ob.speedup(a);
		System.out.print("Enter speed decrease in bicycle : ");
		b=sc.nextInt();
		ob.applybreak(b);
		ob.changegear();
		System.out.print("Enter speed increase in bike : ");
		c=sc.nextInt();
		obj.speedup(c);
		System.out.print("Enter speed decrease in bike : ");
		d=sc.nextInt();
		obj.applybreak(d);
		obj.changegear();
	}
}
