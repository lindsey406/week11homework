public class Book {

	private String title;
	
	
	@Override
	public String toString() {
		return "Book [title = " + title + "]";
	}

	public Book (String title) {
		this.setTitle(title);

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}