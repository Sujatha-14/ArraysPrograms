package Array;

public class Arrayshifiting {

	public static void main(String[] args) {
		int[] array= {10,20,30,40,50,60,70,80,90};
		for(int i=0;i<array.length-1;i++) {
			if(array.length==i+1) {
				array[i]=0;
				array[i]=0;
			}else {
			array[i]=array[i+1];
			}
				System.out.print(array[i]+" , ");
			}
		System.out.println(" ");
	for(int a:array)	
System.out.print(a+" , ");  
	}

}
