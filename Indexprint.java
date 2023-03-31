package Array;

import java.util.Scanner;

public class Indexprint {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the value of an array");
		int range=src.nextInt();
		int[] uservalue=new int[range];
		System.out.println("enter the value");
		for(int a=0;a<range;a++)
		{
			uservalue[a]=src.nextInt();
		}
		System.out.println("Enter your find value ");
		int duplicatevalue=src.nextInt();
	int index=0,count=0;
	for(int b:uservalue)
	{
//		System.out.println(b);
//		System.out.println(duplicatevalue);
	if(b==duplicatevalue)
		{
		System.out.println("the value is available");
			count+=1;
		}
		index++;
	}
if(count==0)
{
	System.out.println("the value is not in your list");
}
else
{
	System.out.println(index+" your number  "+duplicatevalue);
}
	}

}
