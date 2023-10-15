import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator<String> it = l.listIterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.equals("venki")) {
				it.set("Venkatesh");
				it.add("Victory");
			}
		}
		System.out.println(l);

	}

}
