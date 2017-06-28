package addressBook;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i;
		Book book = new Book();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input your book name!");
		i = keyboard.next();
		book.setName(i);
		System.out.println("Here is the book");
		System.out.println(book.getAuthor());
		System.out.println( book.getAddress() + book.getCountry());
		
	}

}
