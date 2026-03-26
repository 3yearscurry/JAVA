public class PizzaDonut {
    public int Pizza;
    public int Donut;
    public int radius;
    public String name;

    public PizzaDonut(){

    }

    public double getArea() {
        return 3.14 * radius * radius;
    }


    public static void main(String[] args) {

        PizzaDonut pizza = new PizzaDonut();
        pizza.radius = 10;
        pizza.name = "자바피자";

        PizzaDonut donut = new PizzaDonut();
        donut.radius = 2;
        donut.name = "자바도넛";

        System.out.println("자바피자의 면적은 " + pizza.getArea());
        System.out.println("자바도넛의 면적은 " + donut.getArea());
    }
}