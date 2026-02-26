class Stack {
    public int maxSize;
    public int[] s;
    public int top;

    public Stack(int size) {
        maxSize = size;
        s = new int[maxSize];
        top = -1;
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            s[++top] = value;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(s[top] + " removed");
            top--;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.push(40);

        s.pop();
        s.pop();
        s.display();
        s.pop();
        s.display();

    }
}