public class gugudan {
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){ // 구구단 앞 줄 출력
            for(int j = 1; j <= 9; j++){ // 구구단 뒷 줄 출력
                System.out.print(i + "*" + j + "=" + i * j);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}