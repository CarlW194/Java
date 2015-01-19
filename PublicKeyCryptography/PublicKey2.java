package publicKey;

public class PublicKey {

	public static void main(String args[]) {
		long P = 24852977;
		long G = 2744;
		long GmodP = 8414508;
		long C1 = 15268076;
		long C2 = 743675;
		long x = 0;
		long result1 = 0;
		long result2 = 1;
		long PK = 0;
		while (result1 != result2) {
			x++;
			result1 = modPow(G, x, P);
			result2 = modPow(C1, P - 1 - x, P);
			if (result1 == result2) {
				PK = x;
				System.out.println("Private Key: " + PK);
				break;
			}
		}

		long result = modPow(C1, PK, P);
		long message = (result) * (C2 % P);
		System.out.println("The message is : " + message);

	}

	public static long modPow(long number, long power, long modulus) {
		if (power == 0)
			return 1;
		else if (power % 2 == 0) {
			long halfpower = modPow(number, power / 2, modulus);
			return modMult(halfpower, halfpower, modulus);
		} else {
			long halfpower = modPow(number, power / 2, modulus);
			long firstbit = modMult(halfpower, halfpower, modulus);
			return modMult(firstbit, number, modulus);
		}
	}

	public static long modMult(long first, long second, long modulus) {
		if (second == 0)
			return 0;
		else if (second % 2 == 0) {
			long half = modMult(first, second / 2, modulus);
			return (half + half) % modulus;
		} else {
			long half = modMult(first, second / 2, modulus);
			return (half + half + first) % modulus;
		}
	}
}
