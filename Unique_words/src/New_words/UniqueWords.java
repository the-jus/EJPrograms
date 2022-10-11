package New_words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student's Article");
		String sc = s.nextLine();
		String sh = sc.toLowerCase();
		StringBuilder str = new StringBuilder(sh);

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (Character.toString(ch).matches("[,:;.?!]")) {
				str.deleteCharAt(i);
			}
		}
		String art = str.toString();
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(art.split(" ")));
		System.out.println("Number of words " + arr.size());
		HashSet<String> hashSet = new HashSet<>(arr);
		System.out.println("Number of unique words " + hashSet.size());
		//System.out.println(str);
		//System.out.println(hashSet);
		List<String> list = new ArrayList<String>(hashSet); 
        Collections.sort(list); 
		System.out.println("The words are");
		Iterator<String> itr = list.iterator();
		int count = 1;
		while (itr.hasNext()) {
			System.out.println(count+". "+itr.next());
			count++;
		}
	}

}
