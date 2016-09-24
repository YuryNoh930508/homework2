import java.util.*;

class B04 {
	int korScore;
	int engScore;
	int mathScore;

	public void init() {
		input();
		print();
	}

	public void input() {
		Scanner s = new Scanner(System.in);

		System.out.println("국어점수를 입력하세요: ");
		this.korScore = s.nextInt();
		
                System.out.println("국어점수를 입력하세요: ");
                this.engScore = s.nextInt();
		
                System.out.println("국어점수를 입력하세요: ");
                this.mathScore = s.nextInt();
	}

	public void print() {
		int sum = this.korScore + this.engScore + this.mathScore;
		double avg = sum/3.0;

		System.out.println("입력하신 점수의 총점은 " + sum + " 입니다.");
		System.out.printf("평균은 %.1f 입니다. \n", avg);
		if(this.korScore >= 90)
			System.out.println("국어점수가 우수합니다.");
                if(this.engScore >= 90)
                        System.out.println("영어점수가 우수합니다.");
                if(this.mathScore >= 90)
                        System.out.println("수학점수가 우수합니다.");
	}

	public static void main(String args[]) {
		new B04().init();
	}
}
