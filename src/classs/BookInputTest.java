package classs;
import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ggyy=new Scanner(System.in);
		Book myBook=new Book();
		System.out.print("Please enter the title of the book\n");
		myBook.title=ggyy.nextLine();
		
		System.out.print("Please enter the author name\n"+myBook.author);
		myBook.author=ggyy.nextLine();
		
		System.out.print("Please enter the number of pages\n"+myBook.numberOfPages);
		myBook.numberOfPages=ggyy.nextInt();
		System.out.println("The book title is:"+myBook.title);
		System.out.println("The book author is:"+myBook.author);
		System.out.println("The book has "+myBook.numberOfPages+ "pages");
		
		

	}

}
