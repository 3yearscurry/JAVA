import java.util.*;

public class Clock {

    public static void main(String[] args) {
        System.out.print("정수를 입력하세요: ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int hour = 0;
        int minute = 0;
        int second = 0;

        hour = number / (60 * 60);
        int remain = number % (60 * 60);
        minute = remain / 60;
        second = number % 60;

        System.out.println(number + "초는 " + hour + "시간 " + minute + "분 " + second + 
        "초 입니다.");

        scanner.close();
    }
}