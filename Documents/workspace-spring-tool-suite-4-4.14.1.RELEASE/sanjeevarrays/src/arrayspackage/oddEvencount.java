package arrayspackage;

public class oddEvencount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner s1=new java.util.Scanner(System.in);
		System.out.println("enter the size");
		int size=s1.nextInt();
		int c1=1,c2=0,c3=0;
		int numbers[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter"+c1+"number");
			numbers[i]=s1.nextInt();
			c1++;
		}
		for(int i=0;i<size;i++)
		{
			if(numbers[i]%2==0)
			{
				c2++;
			}
		}
		System.out.print("count of even numbers="+c2);
		System.out.println();
		for(int i=0;i<size;i++)
		{
			if(numbers[i]%2==1)
			{
				c3++;
			}
		}
		System.out.print("count of odd numbers="+c3);
	}

}
