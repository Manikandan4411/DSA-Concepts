public class BitManipulationBasics {

    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));

        // Check whether the second bit is set
        System.out.println("Check bit: " + ((a & (1 << 1)) != 0));

        // Set the second bit
        System.out.println("Set bit: " + (a | (1 << 1)));

        // Clear the second bit
        System.out.println("Clear bit: " + (a & ~(1 << 1)));
    }
}