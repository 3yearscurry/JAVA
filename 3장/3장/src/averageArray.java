import java.util.*;

public class averageArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("5개의 정수를 입력하세요: ");

        int number[] = new int[5];
        int sum = 0;
        int i = 0;

        while(i < 5){
            try{
            number[i] = scanner.nextInt();
            sum += number[i];
            i++;
            }
        
    

    catch(InputMismatchException e){
        System.out.println("정수를 입력하세요!!");
        System.out.print("5개의 정수를 입력하세요: ");
        scanner.next();
    }
}
      
        System.out.print("평균은 " + (double)sum / number.length);
        scanner.close();
    }
}