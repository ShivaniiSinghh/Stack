import java.util.Scanner;
class stack_with_ll {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push(Scanner s) {
        System.out.println("Enter Data : ");
        int data = s.nextInt();
        Node newnode = new Node(data);
        if (top == null) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }
    }
    boolean pop(){
        if(top==null){
            return true;
            //System.out.println("Stack is Empty");
        }
        else{
            return false;
            //top = top.next;
        }
    }
    void peek(){
        Node temp = top;
        if(!pop()){
            System.out.println(temp.data);
        }
    }
    void deleteStack(){
        top=null;
        System.out.println("Stack Deleted");
    }
    void display(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class StackByLinkedList {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        stack_with_ll sl = new stack_with_ll();
        int l;
        do{
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to peek");
            System.out.println("Press 4 to delete stack");
            System.out.println("Press 5 to display");
            System.out.print("Enter your choice : ");
            d=sc.nextInt();
            switch(d){
                case 1 :
                    sl.push(sc);
                    break;
                case 2 :
                    sl.pop();
                    break;
                case 3 :
                    sl.peek();
                    break;
                case 4 :
                    sl.deleteStack();
                    break;
                case 5 :
                    sl.display();
                    break;
            }
            System.out.println("Press 0 to go back to Main Menu");
            System.out.println("Press any key to exit");
            l = sc.nextInt();
        }
        while(l==0);
        System.out.println("Exit Successfully");
    }
}
/*TIME COMPLEXITIES
pop() :
BEST CASE : O(1) if we need to push on top
WORST CASE : O(1) if we need to add extra data , we can without having to copy stack anywhere because
linked list is og dynamic size
pop() :
BEST CASE : O(1) if we delete from top
WORST CASE : O(1) we can easily delete bottommost element using linked list
display() :
BEST CASE AND WORST CASE : O(n) because traversing till last element
*/