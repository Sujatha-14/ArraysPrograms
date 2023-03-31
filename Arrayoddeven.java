package Array;

public class Arrayoddeven {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int[] copyarray=new int[array.length];
		for(int i=0;i<copyarray.length;i++)
		{
			if(array[i]%2==0)
			{
				copyarray[i]=array[i];
			}
		
		}
		
		for(int a:copyarray)
		{
			if(a==0) {
				System.out.print("");
			}else {
			System.out.print("  "+a);
			}
		}
		System.out.println(" \n");
		
		for(int a:array) {
			System.out.print("  "+a);
		}
	}

}

