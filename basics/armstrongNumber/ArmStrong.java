public class ArmStrong {

    static boolean checkArm(int n) {
        isArmStrong = false;

        String nums = String.ValueOf(n);

        int sum = 0;
        for (int i = 0; i < lenght(); i++) {
            sum += math.pow(nums.charAt(i), nums.length());
        }

        String nums2 = String.ValueOf(sum);

        if (nums == nums1) {
            isArmStrong = true;
            return isArmStrong;
        }
        return isArmStrong;

    }

    public static void main(String args) {
        System.out.println(checkArm(121));
    }

}
