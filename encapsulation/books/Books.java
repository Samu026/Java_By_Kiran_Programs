package encapsulation.books;

public class Books {
	private int bookId;
	private String title;
	private String author;
	private double price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 100) {
			this.price = price;
		} else {
			System.out.println("Price sould be less than 100");
		}
	}
}
