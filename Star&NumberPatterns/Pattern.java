public class Pattern {
    static void pattern1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void p1j(int n) {
        if (n > 3) {
            return;
        }
        System.out.print("*" + " ");
        p1j(n + 1);
    }

    static void p1i(int n) {
        if (n > 3) {
            return;
        }
        p1j(0);
        System.out.println();
        p1i(n + 1);
    }

    // -----------------------------------------

    static void pattern2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void p2j(int n, int count) {
        if (count >= n) {
            return;
        }
        System.out.print("*");
        p2j(n, count + 1);
    }

    static void p2i(int n) {
        if (n > 4) {
            return;
        }
        p2j(n, 0);
        System.out.println(" ");
        p2i(n + 1);
    }

    // ---------------------------------------------

    static void pattern3() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    static void p3j(int n, int count) {
        if (count > n) {
            return;
        }
        System.out.print(count);
        p3j(n, count + 1);
    }

    static void p3i(int n) {
        if (n > 6) {
            return;
        }
        p3j(n, 1);
        System.out.println(" ");
        p3i(n + 1);
    }

    // -----------------------------------------------
    static void pattern4() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    static void p4j(int n, int count) {
        if (count > n) {
            return;
        }
        System.out.print(n);
        p4j(n, count + 1);
    }

    static void p4i(int n) {
        if (n > 6) {
            return;
        }
        p4j(n, 1);
        System.out.print("");
        p4i(n + 1);
    }

    // -----------------------------------------------
    static void pattern5() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p5j(int n, int count) {
        if (count > n) {
            return;
        }

        System.out.print("*" + " ");
        p5j(n, count + 1);

    }

    static void p5i(int n) {
        if (n > 5) {
            return;
        }
        p5j(4 - n, 0);
        System.out.println("");
        p5i(n + 1);
    }

    // --------------------------------------------------

    static void pattern6() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void p6j(int n, int count) {
        if (count > n) {
            return;
        }

        System.out.print(count + " ");
        p6j(n, count + 1);
    }

    static void p6i(int n) {
        if (n > 6) {
            return;
        }
        p6j(6 - n, 1);
        System.out.println(" ");
        p6i(n + 1);
    }

    // --------------------------------------------
    static void pattern7() {

    }

    public static void main(String[] args) {
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        // pattern1(); iterative
        // p1i(0); recursive

        // ----------------------------------

        // *
        // * *
        // * * *
        // * * * *

        // pattern2(); iterative
        // p2i(0); recursive

        // ---------------------------------
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // pattern3(); iterative
        // p3i(1); recursive

        // ----------------------------------------
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
        // pattern4(); iterative
        // p4i(1); recursive

        // ---------------------------------------------
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // pattern5();
        // p5i(0);
        // ------------------------------------------------
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // pattern6(); iterative
        // p6i(1); recursive
    }

}
