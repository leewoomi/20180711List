package datastructure;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain2 {

	public static void main(String[] args) {
		// 정수를 저장하는 ArrayList와 LinkedList를 생성
		// 중간에 데이터 10만개를 삽입하는데 걸리는 시간을 측정

		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(4);

		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(4);

		// arrayList에 10만개를 중간에 넣고 시간 측정
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {
			// 1번째 자리에 2를 추가
			arrayList.add(1, 2);
		}
		long end = System.currentTimeMillis();

		System.out.println("arrayList : " + (end - start));

		// linkedList에 10만개를 중간에 넣고 시간 측정

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {
			// 1번째 자리에 2를 추가
			linkedList.add(1, 2);
		}
		end = System.currentTimeMillis();

		System.out.println("linkedList : " + (end - start));

		// 읽는 시간
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {
			arrayList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("arrayList : " + (end - start));
		// 읽는 시간
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {
			linkedList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("linkedList : " + (end - start));
	}

}
