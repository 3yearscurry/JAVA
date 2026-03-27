class Point{
    private int x, y;
    public void set(int x, int y){
        this.x = x; this.y = y;
    }
    public void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }
}
// Point를 상속받은 ColorPoint 선언
class ColorPoint extends Point {
    private String color;
    public void setColor(String color){
        
    }
}

public class ColorPointEx {
    
}
