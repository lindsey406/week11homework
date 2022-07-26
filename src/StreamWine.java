import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWine {


public static void main(String[] args) {
		
	Stream<Wine> streamWine = Wine.getWines().stream();
	// A stream of List of object "Wine", called strWine is set equal to specific list of object Wine 
	// "wines" calling the stream method.
	
	Stream<String> ssWine = streamWine.map(y -> y.toString());
	// A stream of List of String called ssWine is set equal to the stream streamWine calling the method
	// map, which is set to map each Wine object to a String.
	
	Stream<String> sorted = ssWine.sorted();
	
	// A sorted version (natural order) of that list with the String version of the Wine object 
	// is now set equal to a stream of List of String called sorted.
	
	System.out.println(sorted.collect(Collectors.joining(", ")));
	
}
}