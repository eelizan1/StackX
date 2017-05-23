/**
 * Created by eeliz_000 on 5/19/2017.
 */
public class stackApp {
    public static void main(String[] args) {
        // make new stack
        StackX theStack = new StackX(4);
        // push items into the stack
        theStack.push(20);          // 20 is at bottom
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(90);          // 80 is at top (popped first)

        // until stack is empty
        while(!theStack.isEmpty()) {
            // delete from stack
            long value = theStack.pop();
            // display deleted value
            System.out.println(value);
        }
    }
}
