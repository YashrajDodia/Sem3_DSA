class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
    }
}

class QueueDemo{
    Node first;
    // public void enque(int data){
    //     Node n = new Node(data);
    //     if(first==null){
    //         first = n;
    //     }else{
    //         n.link = first;
    //         first = n;
    //     }
    // }

    public void enque(int data){
        Node n = new Node(data);
        Node save = first;
        if(first==null){
            first = n;
        }else{
            while(save.link!=null){
                save = save.link;
            }
            save.link = n;
        }
    }

    public int deque(){
        Node save = first;
        int tdata = 0;
        if(first==null){
            System.out.println("Queue is empty");
        }else{
            tdata = first.data;
            first = first.link;
        }
        return tdata;
    }
    
    public void display(){
        if(first==null){
            System.out.println("Queue is empty");
        }
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
public class QueueUsingLL {
    public static void main(String[] args) {
       QueueDemo q1 = new QueueDemo();
       q1.enque(5);
       q1.enque(10); 
       q1.enque(15);
       q1.enque(20);
       q1.enque(25);
       q1.enque(30);
       int ans = q1.deque();
       System.out.println("Removed element from queue is : "+ans); 
       q1.display();
    }
}
