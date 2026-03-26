import java.util.*;

public class continueyangsu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 5개 입력하세요: ");

        int sum = 0;
        for(int i = 0; i < 5; i++){
            int number = scanner.nextInt();
            if(number <= 0)
                continue; // 양수가 아닌 경우 다음 반복으로 진행
            else
                sum += number; // 양수인 경우 덧셈
        }
        System.out.print("양수의 합은" + sum);
        scanner.close();
    }
}
