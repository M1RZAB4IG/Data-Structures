//Mirza BAig
//CS2720

public class  Part1{
	
	    private Node head;

	    static class Node {
	        public int data;
	        public Node next;
	        public Node prev;
	    }
	    
	    //method to check if the linked list contains that number of not
	    public void Contain(int num){
	        int counter = 0;
	        if(head.data == num){
	            System.out.println("Node contains 8 at the index " + 1);
	        }
	        Node store = head.next;
	        while(store!= head){
	            counter += 1;
	            if(store.data == num){
	                System.out.println("\nNode contains 8 at the index " + counter);
	                return;
	            }
	            store = store.next;
	        }

	        System.out.println("The linked list do not contains any node with this value");

	    }

	    //method to add the node at the last
	    public void addElement(int val){
	        Node store = new Node();
	        store.data = val;
	        //check if the head is null
	        if(head == null){
	            store.next = store.prev = store;
	            head = store;
	        }else {
	            //if the linked list is not null
	            Node last = head.prev;
	            store.next = head;
	            head.prev = store;
	            store.prev = last;
	            last.next = store;

	        }
	    }
	    //method to get the specific node
	    public Node get(int val){
	        Node store = head;
	        while(store.next != head){
	            if(store.data == val)
	                return store;
	            else
	                store = store.next;
	        }
	        return null;
	    }
	    //method to get the size of the linked list
	    public int size(){
	        Node store = head.next;
	        int counter = 1;
	        while(store != head){
	            counter += 1;
	            store = store.next;
	        }
	        return counter;
	    }
	    //method to update the element value
	    public void update(int prev,int val){
	        Node store = head;
	        while(store.data != prev){
	        	store= store.next;
	        }

	        store.data = val;
	    }
	    //method to remove the node
	    public void remove(int val){
	        Node store = head;
	        while(store.next.data != val){
	        	store = store.next;
	        }
	        Node rk = store.next.next;
	        store.next = rk;
	        rk.prev = store;
	    }
	    public void print(){
	        Node store = head.next;
	        System.out.print("[");
	        System.out.print(head.data + ", ");
	        while(store != head){
	            System.out.print(store.data + ", ");
	            store = store.next;
	        }
	        System.out.print("]");
	    }

	}

// second partner file


public class  Part2{
	
	public static void main(String[] args) {
        
		Part1 node = new Part1();
        node.addElement(2);
        node.addElement(4);
        node.addElement(6);
        node.addElement(8);
        node.addElement(10);
        node.addElement(12);
        node.addElement(14);

        node.print();


        System.out.println("\n The size of the linked list is " + node.size());
        node.remove(6);
        node.print();
        node.Contain(8);
        node.Contain(11);

      }
}
