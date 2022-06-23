package arrayspackage;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,5,-15,20,-30};
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.print("largest number is "+max);
	}

}
