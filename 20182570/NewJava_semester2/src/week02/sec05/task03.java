package week02.sec05;

public class task03 {

	public static void main(String[] args) {
		//주어진 원금 금액, 이자율 및 기간에 대한 단리와 복리 이자를 계산하는 java프로그램을 만듭니다. 모든 입력 값에 double을 사용하세요.
		int PV = 100000;
		double r = 0.02;
		int n = 3;
		double FV1 = PV*(1+r*n);
		double FV2 = PV*(1+r)*(1+r)*(1+r);
		//MathPOW((1+r),n);
		
		System.out.println("원금이 10만원, 이자율이 2퍼센트, 기간은 3개월 일때 단리 이자는 " + FV1 + "원 이고," + " 복리 이자는 " + FV2 + "원 입니다." );
		
	}

}
