package deloitte;

import java.util.ArrayList;

public class CustomArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("123");
		list.add("43");
		list.add("a");
		for(String str: list) {
			if(str.matches("[a-z]")) {
				System.out.println(str);
			}
		}
	}
}
