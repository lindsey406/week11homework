public class SortWine {

	public static void main(String args[]) {

		SortWine sorter = new SortWine();
		sorter.lambdaCompare();
		for (Wine wine : Wine.getWines()) {
			System.out.println(wine);
		}

		sorter.methodCompare();
		for (Wine wine : Wine.getWines()) {
			System.out.println(wine);
		}
	}

	public void lambdaCompare() {
		Wine.getWines().sort((w1, w2) -> Wine.compare(w1, w2));
	}

//	From class Wine, take the wines list, sort it according to the following:
//	pass objects w1, w2 into the compare method of the Wine class.
//	
//	(Note: Wine can be inferred for w1, w2 but not for compare because it is a
//	static method. The non-static method must have an object to be called on. The
//	static method can be called any time through the class name. Another term for
//	static is 'class level'.)

	public void methodCompare() {
		Wine.getWines().sort(Wine::compare);
	}
}
//	From class Wine, take the wines list, sort it according to the following:
//	call the compare method directly from the class Wine
//
//	The double colon (::) operator, also known as method reference operator
//	is used to call a method by referring to it with the help of its class
//	directly.