package literateprimes.refactor1;

public class NumberPrinter {

	private int pageNumber;
	private int pageOffset;
	private int rowOffset;
	private int column;
	private final int rowsPerPage = 50;
	private final int columnsToPrint = 4;
	private int[] numbers;
	private int numberOfNumbers;

	public void prettyPrint(int[] numbers) {
		this.numbers = numbers;
		pageNumber = 1;
		pageOffset = 1;
		numberOfNumbers = numbers.length - 1;
		paginateNumbers();

	}

	private void paginateNumbers() {
		while (pageOffset <= numberOfNumbers)
			printPage();
	}

	private void printPage() {
		System.out.println("The First " + numberOfNumbers + " Prime Numbers --- Page " + pageNumber);
		System.out.println("");
		printPageContent();
		System.out.println("\f");
		pageNumber++;
		pageOffset += rowsPerPage * columnsToPrint;
	}

	private void printPageContent() {
		for (rowOffset = pageOffset; rowOffset < pageOffset + rowsPerPage; rowOffset++)
			printRow();
	}

	private void printRow() {
		for (column = 0; column < columnsToPrint; column++)
			printNumber();
		System.out.println("");
	}

	private void printNumber() {
		if (rowOffset + column * rowsPerPage <= numberOfNumbers)
			System.out.format("%10d", numbers[rowOffset + column * rowsPerPage]);
	}

}
