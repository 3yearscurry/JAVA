import java.util.*;

public class switchPractice {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0~100): ");

        int score = scanner.nextInt();
        char result;

        switch(score/10){
            // case(10) : score = 100
            case(9) : result = 'A'; break;
            case(8) : result = 'B'; break;
            case(7) : result = 'C'; break;
            case(6) : result = 'D'; break;
            default : result = 'F';
        }
        System.out.println("학점은 " + result + "입니다.");
        scanner.close();
    }
}