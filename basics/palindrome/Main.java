public class Main {

    static boolean isPalindrome(int n) {

        String num1 = String.valueOf(n);

        char[] num2 = num1.toCharArray();

        int i = 0;
        int j = num1.length() - 1;
        while (i < j) {
            char temp = num2[i];
            num2[i] = num2[j];
            num2[j] = temp;

            i++;
            j--;
        }
        String str = new String(num2);
        if (num1.equals(str)) {
            return true;
        }
        return false;
    }

    // we can use stringBuilder class as well.
    // static boolean isPalindrome(int n) {

    // String num1 = String.valueOf(n);
    // StringBuilder num2 = new StringBuilder(num1);

    // int i = 0;
    // int j = num2.length() - 1;

    // while (i < j) {
    // char temp = num2.charAt(i);

    // num2.setCharAt(i, num2.charAt(j));
    // num2.setCharAt(j, temp);

    // i++;
    // j--;
    // }

    // if (num1.equals(num2.toString())) {
    // return true;
    // }

    // return false;
    // }

    public static void main(String args[]) {
        System.out.print(isPalindrome(11211));
    }

}
