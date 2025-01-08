public class Q4 {
    public static long reverseBits(long n) {
        long result = 0;
        for (int i = 0; i < 64; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        long inputWord = 0x5555555555555555L;
        long reversedWord = reverseBits(inputWord);
        System.out.println("Input: " + Long.toBinaryString(inputWord));
        System.out.println("Reversed: " + Long.toBinaryString(reversedWord));
    }
}