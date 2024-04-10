public class Strings {
    public static void main(String[] args) {
    
        String a = "Hello";
        System.out.println(a + " Welcome to Java");

        String a1 = "Java";
        String a2 = "Programming";
        String a3 = "Language";
        String sum = a1 + " " + a2 + " " + a3;
        System.out.println("Total Text: "+ sum);

        String b1 = "Hello";
        int b2 = 35;
        String b3 = b1 + b2;
        System.out.println(b3);

        String c1 = "Hello";
        double c2 = 3.52;
        byte c3 = 10;
        c1 = c1 + c2 + c3;
        System.out.println(c1);

        char d1 = '?';
        String d2 = "Hello, How are you" + d1;
        System.out.println(d2);

        String e1 = "Java " + 
                    "Programming " + 
                    "Language";
        System.out.println(e1);

        String f1 = "Java\tProgramming\tLanguage";
        System.out.println(f1);

        String g1 = "Java\nProgramming\nLanguage";
        System.out.println(g1);
    
    
    
    }
    
}
