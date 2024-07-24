import java.util.Scanner;

class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
    }
}

class LinkedList{
    int count = 0;
    Node first;
    Node last;
    public void insertAtFirst(int data){
        Node n = new Node(data);
        if(first==null){
            first = n;
        }else{
            n.link = first;
            first = n;
        }
        count++;
    }

    public void insertAtLast(int data){
        Node n = new Node(data);
        Node save = first;
        if(first==null){
            first = n;
            last = n;
        }else{
            while(save.link!=null){
                save = save.link;
            }
            save.link = n;
            last = n;
        }
        count++;
    }

    public void deleteNode(int data){
        if(first==null){
            System.out.println("Linked List is empty");
        }else{
            Node save = first;
            Node temp = save;
            if(data==first.data){
                first = first.link;
                count--;
                return;
            }
            while((save.link!=null)&&(save.data!=data)){
                temp = save;
                save = save.link;
            }
            if((save.link==null)&&(save.data!=data)){
                System.out.println("Node not found !");
            }else{
                temp.link = save.link;
            }    
        }
        count--;
    }

    public void insertInOrder(int data){
        Node n = new Node(data);
        Node save = first;
        if(first==null){
            first = n;
            count++;
            return;
        }else if(data>=last.data){
            last.link = n;
            last = n;
            count++;
            return;
        }
        else{
           if(n.data<first.data){
            n.link = first;
            first = n;
           }else{
            while(save!=null && n.data>=save.link.data){
                save = save.link;
            }
            n.link = save.link;
            save.link = n;
           }
        }
        count++;
    }

    public int countNodes(){
        return count;
    }
    
    public LinkedList copyLinkedList(Node first,LinkedList l){
        LinkedList l1 = new LinkedList();
        Node save = first;
        while(save!=null){
            l1.insertAtLast(save.data);
            save = save.link;
        }
        return l1;
    }

    public LinkedList revrseLinkedList(Node first, LinkedList l){
        LinkedList l1 = new LinkedList();
        Node save = first;
        while(save!=null){
            l1.insertAtFirst(save.data);
            save = save.link;
        }
        return l1;
    }

    public void display(){
        if(first==null){
            System.out.println("Linked List is empty");
        }
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}

public class LinkedListOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = -1;
        LinkedList l1 = new LinkedList();
        while(n!=0){
            System.out.println("Enter 0 to quit , 1 to insert at first , 2 for insert at last , 3 for insert in order , 4 for delete ,  5 for copy linked list , 6 for getting total nodes , 7 for reverse linked list , 8 for diplay : ");
            n = sc.nextInt();
            int data = 0;
            switch (n) {
                case 0:
                    n = 0;
                    break;
                case 1:
                    System.out.println("enter data : ");
                    data = sc.nextInt();
                    l1.insertAtFirst(data);
                    break;
                case 2:
                    System.out.println("enter data : ");
                    data = sc.nextInt();
                    l1.insertAtLast(data);
                    break;
                case 3:
                    System.out.println("enter data : ");
                    data = sc.nextInt();
                    l1.insertInOrder(data);
                    l1.display();
                    break;
                case 4:
                    System.out.println("enter data : ");
                    data = sc.nextInt();
                    l1.deleteNode(data);
                    l1.display();
                    break;
                case 5:
                    LinkedList l2 = new LinkedList();
                    l2 = l1.copyLinkedList(l1.first ,l1);
                    l2.display();
                    break;
                case 6:
                    int ans = l1.countNodes();
                    System.out.println("Total nodes are : " + ans);
                    break;
                case 7:
                    l1 = l1.revrseLinkedList(l1.first, l1);
                    l1.display();
                    break;
                case 8:
                    l1.display();
                    break;        
                default:
                    break;
            }
        }
        sc.close();
    }
}
