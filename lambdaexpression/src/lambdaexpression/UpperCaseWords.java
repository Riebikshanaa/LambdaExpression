package lambdaexpression;
import java.util.function.UnaryOperator;
import java.util.ArrayList;
import java.util.List;

public class UpperCaseWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("jeep");
        words.add("mango");
        words.add("car");
        words.add("dog");

        UnaryOperator<String> toUpperCase = String::toUpperCase;
        words.replaceAll(toUpperCase);

        System.out.println("Uppercase words: " + words);
    }
}

