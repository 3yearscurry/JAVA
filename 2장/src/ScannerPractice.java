import java.util.*;

public class ScannerPractice {
    
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); // 문자열 읽기
        String city = scanner.next();
        int age = scanner.nextInt();
        double kg = scanner.nextDouble();
        boolean single = scanner.nextBoolean();

        System.out.println("이름은 " + name + "도시는 " + city + "나이는 " + age + "체중은 " + kg
            + "독신 여부는 " + single + "입니다.");

        scanner.close();
    }
}