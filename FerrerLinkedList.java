import java.util.NoSuchElementException;
public class FerrerLinkedList<T> {
	public FerrerLinkedListNode<T> head, tail;
	
	//FerrerLinkedList<String> slist = new FerrerLinkedList<String>();
	
	public FerrerLinkedList() {
		head = tail = null;
	}
	
	// OPERATIONS
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public String toString()
	{
		FerrerLinkedListNode<T> p;
		String s = "";
		if (isEmpty())
		{
			throw new NoSuchElementException("List is empty.");
		}
		else
		{
		for (p = head; p != null; p = p.next)
			s = s + p.info.toString() + "";
		}
		return s;
	}
	
	public FerrerLinkedListNode<T> find(T el)
	{
		FerrerLinkedListNode<T> p = head;
		while ( p != null && p.info != el)
		{
			p = p.next;
		}
		return p;
	}

	
	public void addToHead(T el)
	{
		head = new FerrerLinkedListNode<T>(el, head);
		if (tail == null)
		{
			tail = head;
		}
	}
	
	public void addToTail(T el)
	{
		if (isEmpty())
		{
			head = tail = new FerrerLinkedListNode<T>(el);
		}
		else
		{
			tail.next = new FerrerLinkedListNode<T>(el);
			tail = tail.next;
		}
	}
	
	public T deleteFromHead() {
		if (isEmpty())
		{
			throw new NoSuchElementException("List is empty.");
			//return null;
		}
		T el = head.info;
		if (head == tail)
		{
			head = tail = null;
		}
		else
		{
			head = head.next;
		}
		System.out.print("Element that has been deleted: ");
		return el;
	}

	public T deleteFromTail()
	{
		if (isEmpty())
		{
			throw new NoSuchElementException("List is empty.");
			//return null;
		}
		T el = tail.info;
		if (head == tail)
		{
			head = tail = null;
		}
		else
		{	
			FerrerLinkedListNode<T> p = head;
			while (p.next != tail)
			{
				p = p.next;
			}
			tail = p;
			tail.next = null;
		}
		System.out.print("Element that has been deleted: ");
		return el;
	}
	
	public T delete(T el) {
		if (isEmpty())
		{
			throw new IndexOutOfBoundsException("List is empty.");
		}
		else if (el == head.info)
		{
			return deleteFromHead();
		}
		else if (el == tail.info) {
			return deleteFromTail();
		}
		FerrerLinkedListNode<T> pred = head;
		FerrerLinkedListNode<T> t = head.next;
		while (t != null && t.info != el)
		{
			pred = pred.next;
			t = t.next;
		}
		if (t == null)
		{
			throw new IndexOutOfBoundsException("List is empty.");
		}
		else
		{
			pred.next = t.next;
			//delete(t);
		}
		return el;
	}
	
	public void display()
    {
		
		if (isEmpty())
        {
            //System.out.print("The list is empty.");
            return;
        }
		else
		{
			System.out.print("\nCurrent list: ");
			System.out.print(head.info + " -> ");
	    	FerrerLinkedListNode node = head;
	        for(int i = 0; i <= countNodes(); i++)
	        {
	            head = head.next;
	            System.out.print(head);
	            if(head != null)
	            {
	                System.out.print(" -> ");
	            }
	        }
	        head = node;
            }
	        System.out.println();
		}
	
	public int countNodes()
    {
		int count = 1;
        if(head == null)
        {
            return 0;
        }
        else
        {
        	FerrerLinkedListNode<T> t = head;
          	while(t != null)
          	{
				count++;
				t = t.next;
			}
            return count;
        }
    }
}
