public class DataTypes {
    public static void main(String[] args) {

        // byte --> short --> int --> long

        int a = 4; // -2^31 to 2^31-1

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        byte b=100;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short c = 1000;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        long d = 1000000000;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        short j = 1000;
        int i =(j/2);

        int k = j;

        byte m = 100;
        byte n = (byte)(m/2);
        System.out.println(n);

        
        short num1 = 100;
        byte num2 = 2;
        int num3 = 4;

        long num4 = num1 + num2 + num3;

        System.out.println("Total: " + num4);





    }
}