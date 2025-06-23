package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      //  fun(2, 3, 4, 3, 6, 7, 8, 95);
        fun("pranav");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
