public class LinkedList {

    private Node head;

    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteHead(){
        if(head == null){
            System.out.println("There is nothing to delete");
        }
        else{
            head = head.next;
        }
    }

    public void deleteTail(){
        if(head == null){
            head = null;
            System.out.println("There is nothing to delete");
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data +"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println("After inserting:");
        list.display();
        list.deleteHead();
        list.deleteHead();
        System.out.println("After deleting Head Node:");
        list.display();
        list.deleteTail();
        list.deleteTail();
        System.out.println("After deleting Tail Node:");
        list.display();
    }
}
