class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
    }
}

class StackDemo{
    Node first;
    public void push(int data){
        Node n = new Node(data);
        if(first==null){
            first = n;
        }else{
            n.link = first;
            first = n;
        }
    }

    // public void push(int data){
    //     Node n = new Node(data);
    //     Node save = first;
    //     if(first==null){
    //         first = n;
    //     }else{
    //         while(save.link!=null){
    //             save = save.link;
    //         }
    //         save.link = n;
    //     }
    // }

    public int pop(){
        Node temp = null;
        if(first==null){
            System.out.println("Stack Underflow");
        }else{
            temp  = first;
            first = first.link;
        }
        return temp.data;
    }
    
    public void display(){
        if(first==null){
            System.out.println("Stack is empty");
        }
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
public class StackUsingLL {
    public static void main(String[] args) {
        StackDemo s1 = new StackDemo();
        s1.push(5);
        s1.push(10);
        s1.push(15);
        s1.push(20);
        int ans = s1.pop();
        System.out.println("Poped data  is : " +ans);
        s1.display();
    }
}
