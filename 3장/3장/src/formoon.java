public class formoon {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.print(i);           
        }
        System.out.print("\n");

        int sum = 0;
        for(int j = 0; j <= 100; j++){           
            sum += j;           
        }
        System.out.println(sum);
        
        int sum1 = 0;
        for(int k = 1; k <= 10; k++){ // 1에서 10까지 더한 값
            sum1 += k;
            System.out.print(k);

            if(k < 10){ // 9까지 각 수와 +를 표시
            System.out.print("+");
            }
            else{ // 10부터는 =과 덧셈 결과를 표시
                System.out.print("=" + sum1);
            }
        }
    }
}