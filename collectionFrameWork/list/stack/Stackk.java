import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // S T A C K
        // ---------------------------------------------------------

        Stack<String> books = new Stack<>();

        // To add elements
        books.push("C BOOK");
        books.push("Python Book");
        books.push("Java Book");

        // java <---- peek() | pop() | push()
        // python
        // c

        // To check top element currently present
        System.out.println("Top book: " + books.peek());

        // to remove element from top.
        books.pop();
        System.out.println("Top book: " + books.peek());

    }
}
