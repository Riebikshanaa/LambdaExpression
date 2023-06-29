package lambdaexpression;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NumberPrintingThread {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Consumer<Integer> numberPrinter = number -> System.out.println(Thread.currentThread().getName() + ": " + number);
		Thread thread = new Thread(() -> numbers.forEach(numberPrinter));
		thread.start();
		}
}
