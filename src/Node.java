
public class Node {
	public Film info;
	public Node next;
	public Node prev;
	
	public Node() {
		info=null;
		next=null;
		prev=null;
	}
	
	public Node(Film i) {
		info=i;
		next=null;
		prev=null;
	}
	
	public Node(Film i, Node n, Node p) {
		info=i;
		next=n;
		prev=p;
	}
	
	public boolean isEqual(Film i) {
		return info.getZanr().equals(i.getZanr());
	}
	
	public Film getFilm() {
		return info;
	}
}
