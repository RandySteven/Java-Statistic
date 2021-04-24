package SL;

public class Book {
	public int key;
	public String bookTitle;
	public String status;
	public int pages;
	public Book next;
	
	public Book(int key, String bookTitle, String status, int pages) {
		this.key = key;
		this.bookTitle = bookTitle;
		this.status = status;
		this.pages = pages;
	}
	
	public void display() {
		System.out.println("{ " + key + " : " + bookTitle + "}");
	}
}
