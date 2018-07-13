package datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class ListMain4 {

	public static void main(String[] args) {
		ArrayList<Woomi> list = new ArrayList<>();

		Woomi woomi = new Woomi();
		woomi.setName("이우미");
		woomi.setAge(24);
		list.add(woomi);

		woomi = new Woomi();
		woomi.setName("leewoomi");
		woomi.setAge(24);
		list.add(woomi);

		// 리스트의 모든 데이터 확인
		System.out.println(list);

		Comparator<Woomi> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Woomi first = (Woomi) o1;
				Woomi second = (Woomi) o2;
				return first.getName().compareTo(second.getName());
			}
		};
		list.sort(comp);
		// 각각의 데이터 확인
		for (Woomi temp : list) {
			System.out.println(temp);
		}

	}

}
