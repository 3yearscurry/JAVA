import java.util.*;

public class grade2 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();
        System.out.print("\n");

        System.out.print("학년을 입력하세요(1~4): ");
        int year = scanner.nextInt();

        String success = "";
        if(score >= 60){ // score가 60점 이상
            if(year != 4){ // 4학년이 아닐 경우 합격
                success = "합격";
            }
            else if(score >= 70){ // 4학년이 70점 이상일 경우 합격
                success = "합격";
            }
            else{ // 4학년이 70점 미만일 경우 불합격
                success = "불합격";
            }
        }
        else{ // 60점 미만 불합격
            success = "불합격";
        }
                
        System.out.println(success);
        scanner.close();
    }
}
