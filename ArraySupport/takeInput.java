 
package ArraySupport;
import java.util.Scanner;
public class takeInput
{
    public int[] inputInt(int a)
    {
	Scanner sc=new Scanner(System.in);
	int k[]=new int[a];
	for(int i=0;i<=a-1;i++)
	    {
		System.out.println("Enter val"+i);
		k[i]=sc.nextInt();
	    }
	return k;
    }
    public double[] inputDouble(int a)
    {
	Scanner sc=new Scanner(System.in);
	double k[]=new double[a];
	for(int i=0;i<=a-1;i++)
	    {
		System.out.println("Enter val"+i);
		k[i]=sc.nextDouble();
	    }
	return k;
	
    }
    public String[] inputString(int a)
    {	Scanner sc=new Scanner(System.in);
	String k[]=new String[a];
	for(int i=0;i<=a-1;i++)
	    {
		System.out.println("Enter val"+i);
		k[i]=sc.nextLine();
	    }
	return k;
    }
}