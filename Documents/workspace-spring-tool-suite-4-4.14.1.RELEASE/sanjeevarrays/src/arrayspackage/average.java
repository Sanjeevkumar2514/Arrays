package arrayspackage;

public class average {

	public static void main(String[] args) {
		java.util.Scanner s1=new java.util.Scanner(System.in);
		System.out.println("enter the size");
		int size=s1.nextInt();
		int c=0;
		int sum=0,avg;
		int numbers[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter No."+c+" element");
			numbers[i]=s1.nextInt();
			c++;
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+numbers[i];
		}
		avg=(int) ((float)sum/c);
		System.out.println("sum of array elements:"+sum);
		System.out.print("avg of array elements:"+avg);
	}

}
