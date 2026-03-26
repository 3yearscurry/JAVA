class CircleArray {
    int radius;
    
    CircleArray(int radius) {
        this.radius = radius;
    }

    double getArea(){
        return 3.14 * radius * radius;
    }
}

    public class CircleArray2{
    
    public static void main(String[] args){
        CircleArray[] c = new CircleArray[5];

        for(int i = 0; i < c.length; i++){
            c[i] = new CircleArray(i);
        }
        for(int i = 0; i < c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}