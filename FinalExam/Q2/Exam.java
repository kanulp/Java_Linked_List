class Exam{

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        
        ll.add(2);
        ll.add("demo");
        ll.add(4.5);
        
        ll.append(55);
        ll.print();

        ll.append(55);
        ll.insertAfterNode(2,2.5);
        ll.print();

        ll.pop();
        ll.print();

        ll.popLast();
        ll.print();

        ll.deleteNode(2);
        ll.print();
    }
}