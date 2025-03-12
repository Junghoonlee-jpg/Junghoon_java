package score;

import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // 학생의 수를 입력 받음
        System.out.print("학생의 수를 입력하세요: ");
        int studentCount = scanner.nextInt();
        scanner.nextLine(); // 개행 문자를 처리하기 위해 필요

        Student[] students = new Student[studentCount];

        // 여러 명의 학생 객체 생성
        for (int i = 0; i < studentCount; i++) {
            System.out.print("학생 " + (i + 1) + "의 이름을 입력하세요: ");
            String name = scanner.nextLine();

            int[] scores = new int[5];
            System.out.println(name + "의 성적을 입력하세요: ");
            for (int j = 0; j < 5; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores[j] = scanner.nextInt();
            }
            scanner.nextLine(); // 개행 문자를 처리하기 위해 필요

            students[i] = new Student(name, scores);  // 학생 객체를 배열에 저장
        }

        // 모든 학생의 평균 점수를 출력
        System.out.println("\n모든 학생의 평균 점수:");
        for (Student student : students) {
            System.out.printf("%s의 평균 점수: %.2f\n", student.getName(), student.averageScore());
        }

        scanner.close();

	}
	
}
