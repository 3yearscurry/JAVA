import java.util.*;

public class exit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("exit를 입력하면 종료됩니다..: ");

        String text;

        while(true){
            System.out.print(">>");
            text = scanner.nextLine();

            if(text.equals("exit")) // "exit"이 입력되면 반복 종료
            break; // while 문을 벗어남
        }
        System.out.print("종료합니다..");
        scanner.close();
    }
}