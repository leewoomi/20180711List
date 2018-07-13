package datastructure;
//import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList와 LinkedList는 사용법이 같음.
		//ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> List = new LinkedList<>();
		// 데이터를 삽입
		List.add("유리");
		List.add("아이유");
		List.add("아이린");
		List.add("슬기");

		// 데이터 개수
		System.out.println("데이터 개수 : " + List.size());

		for (String temp : List) {
			System.out.println(temp);
		}

		System.out.println("List.get(2) : " + List.get(2));

	}

}
