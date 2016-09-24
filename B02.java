import java.util.*;

class B02 {
	double inputDegree;
	String kind;

	public void init() {
		input();
		print();
	}

	public void input() {
		Scanner s = new Scanner(System.in);

		System.out.println("온도를 입력하세요: ");
		this.inputDegree = s.nextDouble();

		System.out.println("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요: ");
		this.kind = s.next();
	}

	public void print() {
		double result;
		if(this.kind.equals("F"))
			result = (inputDegree - 32)/1.8;
		else
			result = (inputDegree * 1.8) + 32;

		System.out.println("변환된 온도는 " + result + " 입니다.");
	}

	public static void main(String args[]) {
		new B02().init();
	}
}
