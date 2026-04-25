import java.util.*;

public class Main {
	private static String noRepeatWords(String s) {
		String[]		words;
		StringBuilder	sb;
		Set<String>		seen = new HashSet<>();

		if (s == null)
			return "";

		words = s.split("\\s+");
		sb = new StringBuilder();

		for (String word: words) {
			if (!seen.contains(word.toLowerCase())) {
				seen.add(word.toLowerCase());
				sb.append(word).append(" ");
			}
		}
		sb.deleteCharAt(sb.length() - 1);

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(noRepeatWords("Goodbye bye bye world world world"));
		System.out.println(noRepeatWords("Sam went went to to to his business"));
		System.out.println(noRepeatWords("Reya is is the the best player in eye eye game"));
		System.out.println(noRepeatWords("in inthe"));
		System.out.println(noRepeatWords("Hello hello Ab aB"));
	}
}
