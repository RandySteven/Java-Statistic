package SL;

public class Main {

	public static void main(String[] args) {
		BookList list = new BookList();
		list.insertBook(1, "Jual Beli Ayam", "Aviable", 190);
		list.insertBook(2, "Jual Beli Sapi", "Aviable", 190);
		list.insertBook(3, "Jual Beli Bebek", "Aviable", 190);
		list.insertBook(4, "Jual Beli Domba", "Aviable", 190);
		
		System.out.println("Display List : ");
		list.display();
	}
}
