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

	    int totalSeconds = 256559;
	    int days = totalSeconds / (24 * 60 * 60);
	    int hours = (totalSeconds % (24 * 60 * 60)) / (60 * 60);
	    int minutes = (totalSeconds % (60 * 60)) / 60;
	    int seconds = totalSeconds % 60;
	    System.out.println("3.:" + totalSeconds + "秒為 " + days + "天 " + hours + "小時 " + minutes + "分 " + seconds + "秒\n");
		
//	    4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	    
        // 定義半徑
        double radius = 5;

        // 計算直徑
        double diameter = 2 * radius;

        // 定義圓周率
        final double PI = 3.1415;

        // 計算圓面積
        double area = radius * radius * PI;

        // 計算圓周長
        double circumference = diameter * PI;

        // 輸出結果
        System.out.printf("4.半徑為5的圓面積為：%.4f 平方單位\n", area);
        System.out.printf("  半徑為5的圓周長為：%.4f 單位長\n", circumference);
        System.out.println();
        
//      5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//        金加利息共有多少錢 (用複利計算,公式請自行google)
        
        // 初始本金
        double principal = 1500000;
        
        // 年利率
        double annualInterestRate = 0.02;
        
        // 計算10年後的本金加利息
        for (int i = 1; i <= 10; i++) {
            // 計算利息
            double interest = principal * annualInterestRate;
            
            // 加上利息到本金
            principal += interest;
        }
        
        // 輸出最後一年的本金加利息總額
        System.out.printf("5.第10年後，本金加利息總額為：%d\n", Math.round(principal));
        System.out.println();
        
//        6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//        	5 + 5
//        	5 + ‘5’
//        	5 + “5”
//        	並請用註解各別說明答案的產生原因
      
        // 運算式1：5 + 5
     	System.out.println("6."+5 + 5);  // 兩個5皆為數值，因此相加結果為10

        // 運算式2：5 + '5'
        System.out.println(5 + '5');  // 加上單引號的5被視為字元，其值為Unicode值，即53，然後與整數 5 相加，結果為整數 58

        // 運算式3：5 + "5"
        System.out.println(5 + "5");  // 數值 5 與字串 "5" 進行串接，結果為字串 "55"
        
	}
}
