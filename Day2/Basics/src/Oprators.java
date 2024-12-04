public class Oprators {
    public static void main(String[] args) {
        int f = 7;

//        Summetion
        System.out.println("f += 3: " + (f += 3));
//        Substraction
        System.out.println("f -= 2: " + (f -= 2));
//        Multiplication
        System.out.println("f *= 4: " + (f *= 4));
//        division
        System.out.println("f /= 3: " + (f /= 3));
//        percentage
        System.out.println("f %= 2: " + (f %= 2));
//        and
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
//        or
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
//        XOR operation
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
//        leftshift
        System.out.println("f <<= 2: " + (f <<= 2));
//        rightshift
        System.out.println("f >>= 1: " + (f >>= 1));
//        signed right shift
        System.out.println("f >>>= 1: " + (f >>>= 1));
    }
}
