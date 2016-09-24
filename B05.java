import java.util.*;

class B05 {
	int birthYear;
	int age;

	public void init() {
		input();
		print();
	}

	public void input() {
		Scanner s = new Scanner(System.in);

		System.out.println("태어난 년도를  입력하세요: ");
		this.birthYear = s.nextInt();

		this.age = (2012 - this.birthYear) + 1;
	}

	public void print() {
		String div = "";

		if(age < 7)
			div = "유아";
                else if(age < 13)
                        div = "어린이";
                else if(age < 20)
                        div = "청소년";
                else if(age < 30)
                        div = "청년";
                else if(age < 60)
                        div = "중년";
                else
                        div = "노년";
		
		System.out.println(div + "입니다.");
	}

	public static void main(String args[]) {
		new B05().init();
	}
}
