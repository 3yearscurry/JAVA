import java.util.*;

public class whilemoon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하고 마지막에 -1을 입력하세요: ");
        
        int number = scanner.nextInt();
        int sum = 0;
        int count = 0;

        while(number != -1){
            sum += number;
            count++;
            number = scanner.nextInt();
        }
        System.out.print("정수의 개수는 " + count + "개이며 평균은 " + sum/count + "입니다.");
        scanner.close();
    }
}