package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimpleJava 
{	
	public static void pointerTest(int arr[])
	{
		arr[0] = -1;
		arr[1] = -1;
		arr[2] = -1;
		arr[3] = -1;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		String str = "hello world hello people java python";		
//		String arr[] = str.split("/s");
		
//		for(String a : arr)
//		  System.out.println(a);
		
		int arr[] = {2,-3,2,6};
		
		pointerTest(arr);		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
//		int sum = arr[0] - arr[1];
//		sum = -sum;		
//		System.out.println((Arrays.stream(arr).boxed().collect(Collectors.toSet())).size());
	
	}

}
