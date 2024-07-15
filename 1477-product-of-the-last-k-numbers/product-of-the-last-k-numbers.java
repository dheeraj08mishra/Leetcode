class ProductOfNumbers {
    ArrayList<Integer> al;

    public ProductOfNumbers() {
        al = new ArrayList<>();
    }

    public void add(int num) {
        al.add(num);
    }

    public int getProduct(int k) {
        int prod = 1;
        while (k > 0) {
            int current = al.get(al.size()-k);
            prod *= current;
            k--;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */