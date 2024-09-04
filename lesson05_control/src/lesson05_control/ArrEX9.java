package lesson05_control;

import java.util.Arrays;

public class ArrEX9 {
	public static void main(String[]args){
//		String[] strs = new String[0];
//		System.out.println("첫번째 값:" + args[0]);
//		System.out.println("두번째 값:"+ args[1]);
		int[] arr = new int [3];
		
		// 객체 : object 변수
		String str = "abcd";
		int[] arr1 = {1,2,3,4};
		System.out.println(arr);
		int[] arr2 = new int[arr.length * 2]; //new 어느 특정위치에 새로운걸 만드는 문자열(주소저장)
		System.out.println(arr2);
		//{1,2,3,4,5}
		//{0,0,0,0,0,0,0,0,0}
		//{1,2,3,4,5,0,0,0,0}
		
		for (int i = 0; i< arr1.length; i++) {
			arr2[i] = arr1[i];
		}
			
			arr1 = arr2;
			System.out.println(Arrays.toString(arr2));
			System.out.println(Arrays.toString(arr1));
		}
		
	
		
	}

