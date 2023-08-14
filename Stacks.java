import java.util.ArrayList;
import java.util.List;

public class Stacks {
    private List<Integer> stack;

    public Stacks() {
        stack = new ArrayList<>();
    }

    public void push(int data) {
        stack.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        int lastIndex = stack.size() - 1;
        int data = stack.get(lastIndex);
        stack.remove(lastIndex);
        return data;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
