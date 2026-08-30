public class ArmStrong {

    static boolean checkArm(int n) {

        String nums = String.valueOf(n);

        int sum = 0;

        for (int i = 0; i < nums.length(); i++) {

            int digit = nums.charAt(i) - '0';

            sum += (int) Math.pow(digit, nums.length());
        }

        return sum == n;
    }

    public static void main(String[] args) {

        System.out.println(checkArm(153));
    }
}