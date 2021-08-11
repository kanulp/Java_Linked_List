class Exam{

    public static void main(String[] args){
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtHead(2);
        dl.insertAtHead(3);
        dl.insertAtHead(4);
        
        dl.add(5,1);
        System.out.println("Size is : "+dl.size());
        dl.remove(2);

        System.out.println("Size is : "+dl.size());

        dl.insertAtHead(10);
        dl.insertAtTail(11);

        System.out.println("Search by Index : "+dl.searchByIndex(3).data);

        System.out.println("Search by Value : "+dl.searchByValue(5).data);

        dl.deleteFromHead();
        dl.deleteFromTail();

        System.out.println("Size is : "+dl.size());

        System.out.println("Traverse :");
        dl.traverseForward();
    }
}