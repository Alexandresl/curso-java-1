
public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-"); // Original: -abcde FGHIJ ABC abc DEFG    -
		System.out.println("toLowerCase: -" + s01 + "-"); // toLowerCase: -abcde fghij abc abc defg    -
		System.out.println("toUpperCase: -" + s02 + "-"); // toUpperCase: -ABCDE FGHIJ ABC ABC DEFG    -
		System.out.println("trim: -" + s03 + "-"); // trim: -abcde FGHIJ ABC abc DEFG-
		System.out.println("substring(2): -" + s04 + "-"); // substring(2): -cde FGHIJ ABC abc DEFG    -
		System.out.println("substring(2, 9): -" + s05 + "-"); // substring(2, 9): -cde FGH-
		System.out.println("replace('a', 'x'): -" + s06 + "-"); // replace('a', 'x'): -xbcde FGHIJ ABC xbc DEFG    -
		System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-"); // replace("abc", "xy"): -xyde FGHIJ ABC xy DEFG    -
		System.out.println("indexOf(\"bc\"): " + i); // indexOf("bc"): 1
		System.out.println("lastIndexOf(\"bc\"): " + j); //lastIndexOf("bc"): 17

	}

}
