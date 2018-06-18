import java.util.scanner;

public class SIP
{
	public static void main(String args[])
	{
		float p,r,t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principal :");
		p = s.nextfloat();
		System.out.println("Enter the rate of interest");
		r= s.nextfloat();
		System.out.println("enter the time period");
		t= s.nextfloat();
		float si;
		
		si=(p*r*t) / 100;
		
		System.out.println("the simple interest is " + si);
	}