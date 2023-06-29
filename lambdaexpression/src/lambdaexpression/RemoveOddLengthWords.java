package lambdaexpression;
import java.util.ArrayList;
import java.util.List;

public class RemoveOddLengthWords {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("car");
		words.add("TV");
		words.add("cycle");
		words.add("mobile");
		words.add("dog");
		words.removeIf(word -> word.length() % 2 != 0);
		System.out.println("Updated List: " + words);
		}
}

