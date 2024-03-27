package MyClass;

public class CountOfCharacterFromString2 {
	public static void main(String args[]) {

		String s = "ashvini#$%&*123456";

		int CapitalLetter = 0;
		int SmallLetter = 0;
		int numbers = 0;
		int SpecialChar = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				CapitalLetter++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				SmallLetter++;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				numbers++;

			} else {
				SpecialChar++;
			}

		}
		System.out.println(CapitalLetter);
		System.out.println(SmallLetter);
		System.out.println(numbers);
		System.out.println(SpecialChar);

	}
}
