import java.util.Arrays;
import java.util.List;

public class Wine {

	private String name;

	private static List<Wine> wines = Arrays.asList(new Wine("Merlot"), new Wine("Cabernet"), new Wine("Riesling"),
			new Wine("Rose"));

	public Wine(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Wine type: " + name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<Wine> getWines() {
		return wines;
	}

	public static void setWines(List<Wine> wines) {
		Wine.wines = wines;
	}

	public static int compare(Wine w1, Wine w2) {
		return w1.name.compareToIgnoreCase(w2.name);

	}
}
