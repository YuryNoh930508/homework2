import java.util.*;

class B06 {
	String name;
	int korScore;
	int mathScore;
	int engScore;
	public void run() {
		this.input();
		this.print();
	}
	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름 :");
		this.name = s.next();
		System.out.print("국어점수 입력: ");
		this.korScore = s.nextInt();
		System.out.print("수학점수 입력: ");
		this.mathScore = s.nextInt();
		System.out.print("영어점수 입력: ");
		this.engScore = s.nextInt();
	}
	public void print() {
		String gpa;
		double result = (korScore + mathScore + engScore)/3.0;
		System.out.println("[" + this.name + "]님은");
		System.out.printf("평균은 %.1f이고", result);
		if(result < 60)
			gpa = "F";
		else if(result < 65)
			gpa = "D";
		else if(result < 70)
			gpa = "D+";
		else if(result < 75)
			gpa = "C";
		else if(result < 80)
			gpa = "C+";
		else if(result < 85)
			gpa = "B";
		else if(result < 90)
			gpa = "B+";
		else if(result < 95)
			gpa = "A";
		else
			gpa = "A+";
		System.out.println("학점은" + gpa + "입니다.");
	}
	public static void main(String args[]) {
		new B06().run();
	}
}




