class RecentCounter {

    private Queue<Integer> counterQueue;
    public RecentCounter() {
        this.counterQueue = new LinkedList<>();
    }

    public int ping(int t) {
        counterQueue.add(t);
        while (true) {
            if (counterQueue.peek() < t - 3000) {
                counterQueue.poll();
            } else {
                break;
            }
        }
        return this.counterQueue.size();
    }
}