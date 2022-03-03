import java.util.Scanner;

class stack_with_array{
    int size = 10;
    int top;
    int arr[] = new int[size];

    void push() {
        if (top == (size - 1)) {
            System.out.println("Overflow");
        } else {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Data : ");
            int i = s.nextInt();
            top = top + 1;
            arr[top] = i;
            System.out.println("Data Inserted");
        }
    }
    boolean pop() {
        if (top == -1) {
            return true;
           // System.out.println("Underflow");
        } else {
            return false;
//            top = top - 1;
//            System.out.println("Data Deleted");
        }
    }
    void peek(){
        if(!pop()){
            System.out.println("Topmost Element in Stack : " + arr[top]);
        }
    }
    void deleteStack(){
        arr = null;
        System.out.println("Stack Deleted");
    }
    void display() {
        System.out.println("Data inside array in top to bottom fashion is : ");
        for (int j = top; j >= 1; j--) {
            System.out.println(arr[j]);
        }
    }
}
public class StackByArray {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        stack_with_array sa = new stack_with_array();
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
                    sa.push();
                    break;
                case 2 :
                    sa.pop();
                    break;
                case 3 :
                    sa.peek();
                    break;
                case 4 :
                    sa.deleteStack();
                    break;
                case 5 :
                    sa.display();
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
/*
TIME COMPLEXITIES
push() :
 BEST CASE : O(1) kyunki ek hi trf se push operation krskte hain
 WORST CASE : O(n) agr 10 size k array mein 11 elements ko save krna hai, sab data ko doosre arr mein copy
 krna hoga with required size
pop() :
 BEST CASE : O(1) kyunki ek hi trf se pop operation krskte hain
 WORST CASE : O(n) jb bottom most element ko delete krna ho, sab top elements ko doosre stack mein copy krke
 stack khaali krke, bottommost value ko remove krna sab data refill krna hoga
display() :
 BEST CASE and WORST CASE : O(n) kyunki ek ek krke sab elements to traverse krte hue jana hai
 */