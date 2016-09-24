import java.util.*;

class B01 {
	int birthYear;
	int age;

	public void init() {
		input();
		print();
	}

	public void input() {
		Scanner s = new Scanner(System.in);

		System.out.println("태어난 년도를 입력하세요: ");
		this.birthYear = s.nextInt();

		this.age = (2014 - birthYear) + 1;
	}

	public void print() {
		if(age <= 20)
			System.out.println("미성년자 입니다.");
		else
			System.out.println("성인 입니다.");
	}

	public static void main(String args[]) {
		new B01().init();
	}
}
