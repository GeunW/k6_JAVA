package com.ruby.java.ch04배열;

public class Test32 {

	public static void main(String[] args) {
// 할당하고 각각 값을 지정
		int [] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = i*10+10;
			System.out.println("arr[" +i+"] = " +arr[i]);
		}	
// 할당하면서 값을 지정
// 할당 후에는 {}으로 값을 지정할수 없다 	
		int [] arr2 = new int[]{1,2,3,4,5,6};
		
		for(int j=0; j<arr2.length; j++) {
			
			System.out.println("arr[" +j+"] = " +arr2[j]);
		
		}
		
		String[] arr3 = new String[] {"n","i","c","e"," ","d","a","y"};
		for(int k=0; k<arr3.length; k++) {
			
			System.out.println("arr[" +k+"] = " +arr3[k]);
		
		}
//.length : 배열의 길이 값을 가진다.		
		System.out.println("arr의 length값 : "+arr.length);
		System.out.println("arr2의 length값 : "+arr2.length);
		System.out.println("arr3의 length값 : "+arr3.length);
		System.out.println("arr3의 length값 : "+arr3);
	}
}
