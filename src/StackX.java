import java.util.Stack;

/*
 * Created by eeliz_000 on 5/19/2017.
 * Demonstrates the stack interface
 */
public class StackX {
    // size of stack array
    private int maxSize;
    private long[] stackArray;
    // index of the top of stack
    private int top;
//--------------------------------------
    public StackX(int s) {
        // set array size
        maxSize = s;
        // create array with max size
        stackArray = new long[maxSize];
        // no items yet
        top = -1;
    }
//--------------------------------------
    // put item on top of stack
    public void push(long j) {
        // increment top, insert item
        // points to the space above the previous top
        // stored the item there
        // top is incremented BEFORE item is inserted
       if(!isFull())
            stackArray[++top] = j;
       else
           System.out.println("Stack is full; cannont push");
        //stackArray[++top] = j;
    }
//--------------------------------------
    // take item from top of the stack
    public long pop() {
        // access item, decrement top
        return stackArray[top--];
    }
//--------------------------------------
    public long peek() {
        return stackArray[top];
    }
//--------------------------------------
    // true of stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
    //--------------------------------------
    // true if stack size is full
    public boolean isFull() {
        return top == (maxSize -1);
    }
}

// class to reverse a string
class Reverseer {
    private String input;
    private String output;

    // grabs input from user as argument
    public Reverseer(String in) {
        input = in;
    }

    // reverse the string
    public String doRev() {
        int stackSize = input.length();
        StackX stack = new StackX(stackSize);
        output = "";

        // loop through string, get chars, then push chars
        for(int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            stack.push(ch);
        }

        // pop chars in LIFO order which reverses the string 
        while(!stack.isEmpty()) {
            // must cast because stack is originally of type long not char
            char ch = (char) stack.pop();
            output = output + ch;
        }
        return output;
    }
}
