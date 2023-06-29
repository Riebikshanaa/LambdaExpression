package lambdaexpression;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesExamples {
    public static void main(String[] args) {
        // Supplier: Provides a result without taking any input
        Supplier<String> supplier = () -> "Hi , Riebi!";
        System.out.println(supplier.get());

        // Consumer: Accepts a single input and performs an action
        Consumer<String> consumer = message -> System.out.println("Consumer: " + message);
        consumer.accept("This is a message");

        // Predicate: Tests a condition on the input and returns a boolean
        Predicate<Integer> predicate = number -> number > 0;
        System.out.println("Is positive: " + predicate.test(5));

        // Function: Takes an input, performs a transformation, and returns a result
        Function<Integer, String> function = number -> "Result: " + (number * 2);
        System.out.println(function.apply(5));
    }
}


