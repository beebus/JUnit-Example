interface Adder {
    int add(int a, int b);
}

class AdderImpl implements Adder {
    public int add(int a, int b) {
        return a + b;
    }
}