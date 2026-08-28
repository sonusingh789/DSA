class Solution {
    public int GCD(int n1, int n2) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                arr1.add(i);
            }
        }

        for (int i = 1; i <= n2; i++) {
            if (n2 % i == 0) {
                arr2.add(i);
            }
        }

        for (int i = 0; i < arr1.size(); i++) {
            if (arr2.contains(arr1.get(i))) {
                arr3.add(arr1.get(i));
            }
        }

        int GCD = arr3.get(arr3.size() - 1);

        return GCD;
    }
}