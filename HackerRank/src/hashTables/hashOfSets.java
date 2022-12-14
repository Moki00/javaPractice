package hashTables;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class hashOfSets {

	public static void main(String[] args) throws IOException {
		System.out.println(check3(new Object[] {66, 101}, 66));
		System.out.println(check3(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
		System.out.println(check3(new Object[] {'t', 'e', 's', 't'}, 'e'));
		System.out.println(check3(new Object[] {"what", "a", "great", "kata"}, "kat"));
	}

	public static boolean check(Object[] a, Object x) {
		List<Object> list = Arrays.asList(a);
		return list.contains(x);
	}

	public static boolean check2(Object[] a, Object x) {
		for (Object obj : a) {
			if (Objects.equals(x, obj)) {
				return true;
			}
		}
		return false;
	}

	public static boolean check3(Object[] a, Object x) {
		for (int i=0; i<a.length; i++) {
			if (Objects.equals(x, a[i])) {
				return true;
			}
		}
		return false;
	}
	
}