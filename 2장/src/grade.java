import java.util.*;

public class grade {
    
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요(0~100): ");

        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        char grade;
        
        if(score >= 90){
            grade = 'A';
        }
        else if(score >= 80) {
            grade = 'B' ;
        }
        else if(score >= 70) {
            grade = 'C';
        }
        else{
            grade = 'D';
        }

        System.out.println("학점은 " + grade + "입니다.");
        scanner.close();
    }
}
