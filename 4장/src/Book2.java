import java.util.*;

class Book{
    String title, author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

public class Book2 {
    public static void main(String[] args){
        Book[] book = new Book[2]; // Book 배열 선언

        Scanner scanner = new Scanner(System.in, "UTF-8");
        for(int i = 0; i < 2; i++){
        System.out.println("제목>>");
        String title = scanner.nextLine();
        System.out.println("저자>>");
        String author = scanner.nextLine();
        book[i] = new Book(title, author); // 배열 원소 객체 생성
        }

        for(int i = 0; i < book.length; i++)
        System.out.print("(" + book[i].title + "," + book[i].author + ")");
        
        scanner.close();
    }
}