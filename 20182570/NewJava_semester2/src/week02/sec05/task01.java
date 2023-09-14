package week02.sec05;

public class task01 {

	public static void main(String[] args) {
		//섭씨 온도를 화씨 온도로 변환하는 java프로그램을 작성하세요. 섭씨 온도에는 'float'를 사용하고 화ㅏ씨온도에는 'double'을 사용합니다.
		float F1 = 75;
		double C1 = (F1-32)*5/9;
		System.out.println("화씨 온도가 25도 일때 섭씨온도는 " + C1 + "도 입니다");
		
		
		double C2 = 25;
		double F2 = (C2*9/5)+32;
		System.out.println("섭씨 온도가 25도 일때 화씨온도는 " + F2 + "도 입니다");
		
		
				

	}

}
