package LeetCode;

import java.util.ArrayList;

class MinStack {

    ArrayList stack;

    public MinStack() {
        this.stack = new ArrayList<>();

    }

    public void push(int val) {
        stack.add(val);

    }

    public void pop() {
        stack.remove((stack.size() - 1));
    }

    public int top() {
        return (Integer) stack.get(stack.size() - 1);
    }

    public int getMin() {

    }

    class Node {
        int val;
        int currentSmallest;

        Node(int v, int cs) {
            this.val = v;
            currentSmallest = head.next.currentSmallest;
        }

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */