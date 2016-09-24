import java.util.*;

class B03 {
	int days;

	public void init() {
		input();
		print();
	}

	public void input() {
		Scanner s = new Scanner(System.in);

		System.out.println("날수를 입력하세요: ");
		this.days = s.nextInt();
	}

	public void print() {
		int seconds = days * 24* 60 * 60;
		int m_count = seconds / 1000000;

		System.out.println("날수에 해당되는 기간은 모두 " + seconds + " 초 입니다.");
		if(seconds >= 1000000)
			System.out.println("100만 초가 모두 " + m_count + "번이나 포함됩니다.");
	}

	public static void main(String args[]) {
		new B03().init();
	}
}
