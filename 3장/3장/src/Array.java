import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("양수 5개를 입력하세요: ");

        int number[] = new int[5]; // 배열 생성
        int max = 0; // 현재 가장 큰 수

        for(int i = 0; i < 5; i++){
            number[i] = scanner.nextInt();
            if(number[i] > max)
                max = number[i];
        }
        System.out.print("가장 큰 수는 " + max + "입니다.");
        scanner.close();
    }
}