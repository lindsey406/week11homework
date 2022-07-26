import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalBook {

	public static void main(String[] args) {
		
	Optional<Book> opBook = Optional.of(new Book("Lindsey's Book"));
	methodB(opBook);
	Optional<Book> opBook2 = Optional.empty();
	methodB(opBook2);
	
	}

	public static Book methodA(Optional<Book> oBook) {
		return oBook.orElseThrow(() -> new NoSuchElementException("oBook is null."));
		
//		if (oBook.isPresent()) {
//			return Optional.of(oBook.get());
//		} else
//			System.out.println("oBook is null.");
//			throw new NoSuchElementException();
	}

	public static void methodB(Optional<Book> b) {
		try {
			System.out.println(methodA(b));

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
}