package map;

import java.util.HashMap;
import java.util.Iterator;

public class MapagainTest {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("사과", 100);
		map.put("포도", 200);
		map.put("오렌지",5);
		//set으로 반복문을 동작시킬 수 없어요!
		//set데이터를 갖고 반복 실행시키려면 Iterator를 만들어야 합니다.
		Iterator<String> iter= map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int n = map.get(key);
			System.out.println(key +"===>" +n);
		}

	}

}
