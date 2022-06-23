package arrayspackage;

public class arraysum {

	public static void main(String[] args) {
		java.util.Scanner s1=new java.util.Scanner(System.in);
		System.out.println("enter the size");
		int size=s1.nextInt();
		int c=1;
		int sum=0;
		int numbers[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter "+c+"element");
			numbers[i]=s1.nextInt();
			c++;
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+numbers[i];
		}
		System.out.print("sum of array elements:"+sum);
	}

}
