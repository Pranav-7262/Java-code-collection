package Bits;

public class Operators {
    public static void main(String[] args) {

        //AND
        System.out.println(14 & 1);
        //OR
        System.out.println(13 | 7);

        //XOR (1 even no of times  == 0 else 1)
        System.out.println(13 ^ 7);//10


        System.out.println((13  >> 1)) ; // n == 13 , k == 1
        //formula ,  n >> k = (n / 2 ^ k);

        System.out.println(13 << 1); //   1 1 0 1 (0) // 26
        //formula , n << k = n * 2 ^ k; //  0 0 1 0 //  0 0 1 1

        //NOT OPERATOR
        System.out.println(~ 5); // ~x = -(x + 1) // 0101 // 1010
          // 0000 0101
        // 1111 1010 // now flip again coz its negative (1111) / 2s complement
        // 0000 0101 // 1s
        //1 0000  0110   -> -6 answer


        System.out.println(~ -13);//-(-13 + 1) = -(-12) = 12

         // 0000 1101
        // 1111 0010 // 1s
        //  +1 for 2s
        // 1111 0011 // -13  , now flip
        // 0000 1100 // ---->    12

        System.out.println(~ -6);
        // -6
        // 0000 0110
        // 1111 1001 // flip , now 2s comp.
        // 1111  1010   // -6 store
        //
        // its negative  , then apply 2s complement -->
        // first we convert 1s comp.
        // 0000 0101 // its positive num hence STOP here  ans    ---->  5
    }

}


