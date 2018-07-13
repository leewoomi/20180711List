package datastructure;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(44);

		Comparator<Integer> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Integer first = (Integer) o1;
				Integer second = (Integer) o2;
				return first - second;
			}
		};
		al.sort(comp);
		// List는 toString 재정의 되어 있어서 인스턴스를 출력하면
		// 데이터가 순서대로 toString을 호출합니다.

		System.out.println(al);

		LinkedList<String> list = new LinkedList<>();
		list.add("아이린");
		list.add("사나");
		list.add("아이유");

		Comparator<String> comp1 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String first = (String) o1;
				String second = (String) o2;
				return first.compareTo(second);
			}
		};
		list.sort(comp1);
		System.out.println(list);
	}

}
