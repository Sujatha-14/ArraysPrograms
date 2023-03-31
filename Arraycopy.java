package Array;

public class Arraycopy {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9};
		int[] copyarray=new int[array.length];
		//same reverse order but different method
		for(int i=0;i<copyarray.length;i++)
		{
			copyarray[copyarray.length-(i+1)]=array[i];
		}
		
		//reverse order
//		for(int i=array.length-1;i>=0;i--) {
//		System.out.print("  "+array[i]);
//		}
		
		
		for(int a:copyarray)
		{
			System.out.print("  "+a);
		}
		System.out.println(" \n");
for(int a:array) {
	System.out.print("  "+a);
}
	}

}
