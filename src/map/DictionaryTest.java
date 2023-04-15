package map;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("apple", "사과");
		map.put("orange", "오렌지");
		map.put("boy", "소년");
		Scanner sc = new Scanner(System.in);
		String eng, kor;
		System.out.println("영어 단어를 입력하세요");
		eng = sc.next();
		kor = map.get(eng);	//map 객체에서 eng(key)값을 불러들여온 값 =>value값을 kor 변수에 넣음
		if(kor != null) {
			System.out.println(kor);
		}else {
			System.out.println("해당 단어가 없습니다.");
		}
		
		
	}

}
