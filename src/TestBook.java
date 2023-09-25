
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book bok1 = new Book();
        Book bok2 = new Book();
        System.out.println("JACOOB WISNIEWSKI");
        System.out.print("enter title --> ");
        bok1.setTitle(input.nextLine());

        System.out.print("enter title2 --> ");
        bok2.setTitle(input.nextLine());
        System.out.print("enter author --> ");
        bok1.setAuthor(input.nextLine());
        System.out.print("enter author2 --> ");
        bok2.setAuthor(input.nextLine());
        System.out.print("enter Page Count --> ");
        bok1.setPagecount(input.nextInt());
        System.out.print("enter Page Count2 --> ");
        bok2.setPagecount(input.nextInt());
        System.out.print("enter Price --> ");
        bok1.setPrice(input.nextDouble());
        System.out.print("enter Price2 --> ");
        bok1.setPrice(input.nextDouble());




    printbook(bok1);
    printbook(bok2);





    }
    public static void printbook(Book bok1){
        System.out.println("Title: " + bok1.getTitle());
        System.out.println("Author: " + bok1.getAuthor());
        System.out.println("Page Count: " + bok1.getPagecount());
        System.out.println("Price: " + bok1.getPrice());
    }
}
