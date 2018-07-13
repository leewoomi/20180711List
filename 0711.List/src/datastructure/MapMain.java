package datastructure;

import java.util.HashMap;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "이우미");
		map.put("age", 24);
		// 도일한 키로 다시저장하면 업데이트가 됩니다.
		map.put("age", 25);

		// company키의 값을 출력
		System.out.println(map.get("company"));
		// 없는 키의 으름을 사용하
		// System.out.println(map.get(position));

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
 
	}

}
