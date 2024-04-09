public class FloatDouble {
    public static void main(String[] args) {
            
        // Double : 64 bit - 8 byte
        // Float : 32 bit - 4 byte

        // Otomatik Dönüştürme: int --> float --> double

        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;

        System.out.println(c);


        float num1 = (float) 5.0;
        float num2 = 5f;
        float num3 = 5.2f;


        int num4 = 22 / 7;
        
        float num5 = 22f / 7f;

        double num6 = 22d / 7d;

        System.out.println("num4: " + num4);
        System.out.println("num5: " + num5);
        System.out.println("num6: " + num6);

        int num7 = 5;
        float num8 = num7;
        System.out.println("Num 8: " + num8);


        double num9 = 3.52;
        float num10 = (float)(num9);
        System.out.println("Num 10: " + num10);


        Double num11 = 70.25;
        Double num12 = 60d;
        Double num13 = 80.2;

        System.out.println("Mean1: " + (num11 + num12 + num13) / 3);

        float num14 = 70.25f;
        float num15 = 60f;
        float num16 = 80.2f;
        System.out.println("Mean2: " + (num14 + num15 + num16) / 3);
    
        
    }



    
}
