package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순서 알 수 없음.
		HashSet<String> song = new HashSet<>();
		// 크기 순서
		// TreeSet<String> song = new TreeSet<>();
		// 저자한 순서대로
		// LinkedHashSet<String> song = new LinkedHashSet<>();
		song.add("BAAM");
		song.add("빨간 맛");
		song.add("11:11");
		song.add("빨간 맛");
		song.add("장마");

		for (String temp : song) {
			System.out.println(temp);
		}

	}

}
