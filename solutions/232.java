class MyQueue {
    Deque<Integer> firstStack;
    Deque<Integer> secondStack;
    int p;
    /** Initialize your data structure here. */
    public MyQueue() {
        firstStack = new ArrayDeque<>();
        secondStack = new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (firstStack.isEmpty()) {
            p = x;
        }
        firstStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        secondStack.clear();
        while (!firstStack.isEmpty()) {
            secondStack.push(firstStack.pop());
        }
        int res = secondStack.pop();
        firstStack.clear();
        boolean flag = true;
        while (!secondStack.isEmpty()) {
            if (flag) {
                p = secondStack.pop();
                firstStack.push(p);
                flag = false;
            } else {
                firstStack.push(secondStack.pop());
            }
        }
        return res;
    }

    /** Get the front element. */
    public int peek() {
        return p;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return firstStack.isEmpty();
    }
}