package score;

public class Student {
	private String name;  // 학생 이름
    private int[] scores; // 학생의 5과목 점수 배열

    // 생성자: 학생 이름과 점수를 받아 초기화
    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // 평균 점수를 계산하는 메서드
    public double averageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;  // 평균 계산
    }

    // 학생 이름을 반환하는 메서드
    public String getName() {
        return name;
    }
}

    

