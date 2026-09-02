class NarrowingConversion {
    public static void main(String[] args) {
        short s = 42;
        byte b = (byte) s;

        int i = 42;
        byte b1 = (byte) i;
        short s1 = (short) i;
        char c1 = (char) i;

        long l = 42;
        byte b2 = (byte) l;
        short s2 = (short) l;
        int i2 = (int) l;
        char c2 = (char) l;

        float f = 42.5f;
        byte b3 = (byte) f;
        short s3 = (short) f;
        int i3 = (int) f;
        long l3 = (long) f;
        char c3 = (char) f;

        double d = 42.5;
        byte b4 = (byte) d;
        short s4 = (short) d;
        int i4 = (int) d;
        long l4 = (long) d;
        float f4 = (float) d;
        char c4 = (char) d;

        char ch = 42;
        byte cb = (byte) ch;
        short cs = (short) ch;

        System.out.println("Short to Byte: " + b);
        System.out.println("Int to Byte: " + b1);
        System.out.println("Int to Short: " + s1);
        System.out.println("Int to Char: " + c1);

        System.out.println("Long to Byte: " + b2);
        System.out.println("Long to Short: " + s2);
        System.out.println("Long to Int: " + i2);
        System.out.println("Long to Char: " + c2);

        System.out.println("Float to Byte: " + b3);
        System.out.println("Float to Short: " + s3);
        System.out.println("Float to Int: " + i3);
        System.out.println("Float to Long: " + l3);
        System.out.println("Float to Char: " + c3);

        System.out.println("Double to Byte: " + b4);
        System.out.println("Double to Short: " + s4);
        System.out.println("Double to Int: " + i4);
        System.out.println("Double to Long: " + l4);
        System.out.println("Double to Float: " + f4);
        System.out.println("Double to Char: " + c4);

        System.out.println("Char to Byte: " + cb);
        System.out.println("Char to Short: " + cs);
    }
}