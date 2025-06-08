package Ejercicio_02_sorting;

public class Stack {
    private Object[] data;
    private int top;

    public Stack() {
        data = new Object[100];
        top = -1;
    }

    public void push(Object item) {
        data[++top] = item;
    }

    public Object pop() {
        return data[top--];
    }

    public Object peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
