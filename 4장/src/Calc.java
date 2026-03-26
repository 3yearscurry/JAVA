class CalcEX {
    public static int abs(int a) { return a>0?a:-a;}
    public static int max(int a, int b) {return (a>b)?a:b;}
    public static int min(int a, int b) {return (a>b)?b:a;}
}

    public class Calc{
        public static void main(String[] args){
            System.out.println(CalcEX.abs(-5));
            System.out.println(CalcEX.max(10,8));
            System.out.println(CalcEX.min(-3, -8));
        }
}