import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		String str = a.next();

		String[] array = Unique(str);

		for (String s : array) {
			System.out.println(s);
		}

	}

	public static String[] Unique(String str) {
		Set<String> set = new HashSet<>();

		int l = str.length();
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j <= l; j++) {
				set.add(str.substring(i, j));
			}
		}
		return set.toArray(new String[0]);
	}

}
