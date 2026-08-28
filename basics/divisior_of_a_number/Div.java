class Div {
    public int[] divisors(int n) {

        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ls.add(i);
            }
        }

        int[] result = new int[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            result[i] = ls.get(i);
        }

        return result;
    }
}