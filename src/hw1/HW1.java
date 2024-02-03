package hw1;

public class HW1 {
	public static void main(String[]args) {
//		1.請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 6, b = 12;
		System.out.println("1.: 和為" + (a+b) + " ,積為" + (a*b)+ " 。");
		System.out.println();
		
//		2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200;
		System.out.println("2.: " + eggs/12 + "打" + eggs%12 + "顆");
		System.out.println();
		
//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		double second = 256559;
		double minutes = second/60;
		second = second%60;
		double hours = minutes/60;
		minutes = minutes%60;
		 days = hours/24;
		hours = hours%24;
		System.out.println("為" +days+"天");
		//
		
		
	}
}
