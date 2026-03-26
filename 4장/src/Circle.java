public class Circle {
    private int radius;
    public String name;

    public Circle() {
        radius = 7;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args){
        Circle circle = new Circle();

        System.out.print("반지름이 7인 원의 넓이는 " + circle.getArea());
    }
}