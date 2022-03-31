package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SampleMain {
	public static void main(String... args) {
		List<String> list = new ArrayList<>();
		list.add("stirng1");
		list.add("stirng2");
		list.add("stirng3");
		list.add("stirng4");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}

		Map<String, String> map = new HashMap<>();
		map.put("1", "java");
		map.put("2", "C");
		map.put("3", "python");
		map.put("4", "Ruby");

		Iterator<Map.Entry<String, String>> itr2 = map.entrySet().iterator();

		while (itr2.hasNext()) {
			Map.Entry<String, String> maps = itr2.next();
			System.out.println(maps.getKey() + ": " + maps.getValue());
		}

	}
}
