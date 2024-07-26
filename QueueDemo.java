import java.util.Scanner;

class MyQueue{
    int front = -1;
    int rear = -1;
    int[] q;
    public MyQueue(int data){
        q = new int[data];
    }

    public void enqueueData(int data){
        if(rear==q.length-1){
            System.out.println("Queue Overflow !!");
        }else{
            rear++;
            q[rear] = data;
            if(front==-1){
                front++;
            }
        }
    }

    public void dequeue(){
        if(rear==-1){
            System.out.println("Queue underflow !!");
        }else{
            front++;
        }
    }

    public void display(){
        for (int i = rear; i >= front; i--) {
            System.out.print(q[i] + " ");
        }
        System.out.println(" ");
    }
}

public class QueueDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue : ");
        int size = sc.nextInt();
        MyQueue q1 = new MyQueue(size);
        int n = -1;
        int data;
        int count = 0; 
        while (n!=0) {
            System.out.println("Enter 0 to quit the program , 1 to enqueue data , 2 to dequeue data , 3 to display queue : ");
            n = sc.nextInt();
            switch (n) {
                case 0:
                    q1.display();
                    n = 0;
                    break;
                case 1:
                    System.out.println("Enter data you want to insert : ");
                    data = sc.nextInt();
                    q1.enqueueData(data);
                    count++;
                    break;
                case 2:
                    q1.dequeue();
                    break;
                case 3:
                    q1.display();
                    n=0;
                    break;        
                default:
                    break;
            }
            if(count==size){
                q1.display();
                System.out.println("Queue filled completely !!");
                break;
            }
        }
        sc.close();
    }
}