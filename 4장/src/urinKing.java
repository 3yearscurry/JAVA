public class urinKing {
    public String name;
    public String littlePrince;
    public String loveStory;
    public String title;
    public String author;

    public urinKing(String x, String y) {
        title = x;
        author = y;
    }

    public urinKing(String x){
        title = x;
        author = "작자미상";
    }


    public static void main(String[] args) {
        urinKing littlePrince = new urinKing("어린왕자", "생텍쥐페리");
        urinKing loveStory = new urinKing("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}