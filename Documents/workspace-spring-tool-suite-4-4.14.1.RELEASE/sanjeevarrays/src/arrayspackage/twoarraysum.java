package arrayspackage;

public class twoarraysum {

	public static void main(String[] args) {
		int array1[]= {10,20,30,40,50};
		int array2[]= {9,18,27,36,45};
		int array3[]=new int[array1.length];

		for(int i=0;i<=array1.length-1;i++)
		{
			array3=array1[i]+array2[i];
		}
		System.out.print("array3={");
		System.out.print(array3+",");
		System.out.print("}");
	}
}
