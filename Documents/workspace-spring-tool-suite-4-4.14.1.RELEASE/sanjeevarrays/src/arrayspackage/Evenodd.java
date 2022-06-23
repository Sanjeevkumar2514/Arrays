package arrayspackage;

public class Evenodd {

	public static void main(String[] args) {
		java.util.Scanner s1=new java.util.Scanner(System.in);
		System.out.println("enter the size");
		int size=s1.nextInt();
		int c=1;
		int numbers[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter"+c+"number");
			numbers[i]=s1.nextInt();
			c++;
		}
		System.out.print("odd numbers:");
		for(int i=0;i<size;i++)
		{
			if(numbers[i]%2==1)
			{
				System.out.print(numbers[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Evennumbers:");
		for(int i=0;i<size;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.print(numbers[i]+" ");
			}
		}

	}

}
