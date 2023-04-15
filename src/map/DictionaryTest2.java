package map;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest2 {
	public static void insertWord(HashMap<String, String> map) {
		Scanner sc = new Scanner(System.in);
		String eng, kor;
		System.out.println("추가할 영어 단어를 입력하세요");
		eng = sc.next();
		eng = eng.toLowerCase();	//대문자가 섞여도 다 소문자로 인식함
		System.out.println("설명을 입력하세요");
		kor = sc.next();
		map.put(eng, kor);
		System.out.println("사전에 등록되었습니다.");
	}
	public static void searchWord(HashMap<String, String> map) {
		Scanner sc = new Scanner(System.in);
		String eng, kor;
		System.out.println("영어 단어를 입력하세요");
		eng = sc.next();
		eng = eng.toLowerCase();
		kor = map.get(eng);	//eng값을 불러들여와 hashmap에 대응하면 value값인 kor값 추출
		if(kor != null) {
			System.out.println(kor);
		}else {
			System.out.println("해당 단어가 없습니다.");
		}
	}
	public static void deleteWord(HashMap<String, String> map) {
		Scanner sc = new Scanner(System.in);
		String eng, kor;
		System.out.println("삭제할 영어 단어를 입력하세요");
		eng = sc.next();
		eng = eng.toLowerCase();
		kor = map.remove(eng);
		if(kor != null) {
			System.out.println("해당단어를 삭제했습니다.");
		}else {
			System.out.println("해당 단어가 없습니다.");
		}
	}

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("apple", "사과");
		map.put("orange", "오렌지");
		map.put("boy", "소년");
		Scanner sc = new Scanner(System.in);
		String eng, kor;
		
		int sel;
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.추가,2.검색,3.삭제,0.종료");
			sel = sc.nextInt();
			if(sel == 0) {
				break;
			}
			switch(sel) {
			case 1:insertWord(map);break;
			case 2:searchWord(map);break;
			case 3:deleteWord(map);break;
		
			}
		}
	}
}
