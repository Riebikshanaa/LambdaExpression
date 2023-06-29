package lambdaexpression;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class MapToString {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		StringBuilder result = new StringBuilder();
		for (Map.Entry<String, String> entry : map.entrySet()) {
		result.append(entry.getKey())
		.append(": ")
		.append(entry.getValue())
		.append(", ");
		}
		if (result.length() > 0) {
		result.setLength(result.length() - 2); // Remove the trailing comma and space
		}
		System.out.println("Result: " + result.toString());
		}
}
