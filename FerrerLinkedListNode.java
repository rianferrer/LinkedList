public class FerrerLinkedListNode<T> {
	
	public T info;
	public FerrerLinkedListNode<T> next;
	
	public FerrerLinkedListNode() {
		next = null;
	}
	
	public FerrerLinkedListNode(T el) {
		info = el;
		next = null;
	}
	
	public FerrerLinkedListNode(T el, FerrerLinkedListNode<T> ptr) {
		info = el;
		next = ptr;
	}

}
