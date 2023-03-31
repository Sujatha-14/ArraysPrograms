package Array;

public class Arraycircular {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9};
		int temp=array[0];
		int temp1=array[1];
		for(int i=0;i<array.length-1;i++) {
			if(array.length==i+2)
			{
				array[i]=temp;
				array[i+1]=temp1;
			}else {
				array[i]=array[i+2];
			}
		}
for(int a:array) {
	System.out.print(a+" ");
}
	}

}
