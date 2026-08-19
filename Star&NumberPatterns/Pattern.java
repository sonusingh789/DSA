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

    public static void main(String[] args) {
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        // pattern1(); iterative
        // p1i(0); recursive

        // ----------------------------------

    }
}
