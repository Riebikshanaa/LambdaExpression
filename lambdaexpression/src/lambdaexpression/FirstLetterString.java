package lambdaexpression;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FirstLetterString {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "honey", "carrot", "rose");

        StringBuilder result = new StringBuilder();
        Consumer<String> consumer = word -> result.append(word.charAt(0));

        words.forEach(consumer);

        System.out.println("Result: " + result.toString());
    }

}

