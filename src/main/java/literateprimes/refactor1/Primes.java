package literateprimes.refactor1;

public class Primes {

	private NumberPrinter numberPrinter = new NumberPrinter();
	private final int numberOfPrimes = 1000;
	private final int ORDMAX = 30;
	private int primes[] = new int[numberOfPrimes + 1];
	private int candidatePrime;
	private int primeIndex;
	private boolean candidateIsPrime;
	private int ORD;
	private int SQUARE;
	private int N;
	private int MULT[] = new int[ORDMAX + 1];

	public static void print() {
		new Primes().printPrimes();
	}

	private void printPrimes() {
		findPrimes();
		numberPrinter.prettyPrint(primes);
	}

	private void findPrimes() {
		candidatePrime = 1;
		primeIndex = 1;
		primes[1] = 2;
		ORD = 2;
		SQUARE = 9;
		while (primeIndex < numberOfPrimes)
			addNextPrime();
	}

	private void addNextPrime() {
		do {
			findNextPrime();
		} while (!candidateIsPrime);
		primeIndex++;
		primes[primeIndex] = candidatePrime;
	}

	private void findNextPrime() {
		candidatePrime += 2;
		if (candidatePrime == SQUARE)
			updateSquare();
		N = 2;
		candidateIsPrime = true;
		while (N < ORD && candidateIsPrime)
			checkCandidatePrimeStatus();
	}

	private void checkCandidatePrimeStatus() {
		while (MULT[N] < candidatePrime)
			MULT[N] += 2 * primes[N];
		if (MULT[N] == candidatePrime)
			candidateIsPrime = false;
		N = N + 1;
	}

	private void updateSquare() {
		ORD = ORD + 1;
		SQUARE = primes[ORD] * primes[ORD];
		MULT[ORD - 1] = candidatePrime;
	}

}
