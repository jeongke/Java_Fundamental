package java_20210430;

public class IfDemo {
	public static void main(String[] args) {
		
		//Run Configurations => Arguments => Program arguments
		//int month = Integer.parseInt(args[0]);
		int month = 5;
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		}else if(month >= 3 && month == 5) {
			season = "봄";
		}else if(month == 6 || month == 7 || month == 8) {
			season = "여름";
		}else if(month == 9 || month == 10 || month == 11) {
			season = "겨울";
		}else {
			season = "없는 계절";
		}
		System.out.println(month + "월은" + season + "입니다.");
		
		
		int a = 125900;
		double d = 125234.789;
		String name = "정광의";
		//교재 p.36
		System.out.printf("a는 %,d 입니다.%n", a);
		System.out.printf("d는 %,.2f 입니다.%n", d);
		System.out.printf("저는 %s, %d, %f 입니다.%n", name, a, d);
		
		
		
		
		
	
	}
}