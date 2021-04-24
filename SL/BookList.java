package SL;

public class BookList {
	
	private Book first;
	
	public void insertBook(int key, String bookTitle, String status, int pages) {
		Book book = new Book(key, bookTitle, status, pages);
		book.next = first;
		first = book;
	}
	
	public Book deleteFirst() {
		Book book = first;
		first = book.next;
		return book;
	}
	
	public void display() {
		Book current = first;
		
		System.out.println("[");
		while(current != null) {
			current.display();
			current = current.next;
			System.out.println(" ");
		}
		System.out.println("]");
	}
	
	public Book find(int key) {
		Book book = first;
		
		if(book == null) {
			return null;
		}
		while(book.key != key) {
			if(book.next == null) {
				return null;
			}else {
				book = book.next;
			}
		}
		return book;
	}
	
	public Book delete(int key) {
		Book book = first;
		Book previous = null;
		if(book == null) {
			return null;
		}
		
		while(book != null) {
			if(book.key != key) {
				return null;
			}else {
				previous = book;
				book = book.next;
			}
		}
		
		if(book == first) {
			first = first.next;
		}else {
			previous.next = book.next;
		}
		return book;
	}
	
	public BookList() {
		first = null;
	}
	
}
