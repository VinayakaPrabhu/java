
class DataTypes{
     public static void main(String args[]){
        byte byteVar = 127;    
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 60;
        float floatVar = 20;
        double doubleVar = 20.123;
        boolean booleanVar = false;
        char charVar ='W';
    
        char testChar = "hello".charAt(1);
        System.out.println(testChar);
        
        String myString = "hello";
        char testChar1 = myString.charAt(1);
        System.out.println(testChar1);
        
        String myString1 = new String("hello");
        char testChar2 = myString1.charAt(1);
        System.out.println(testChar2);
        
        System.out.println(byteVar + byteVar);
        System.out.println("Value Of byte Variable is " + byteVar);
        System.out.println("Value Of short Variable is " + shortVar);
        System.out.println("Value Of int Variable is " + intVar);
        System.out.println("Value Of long Variable is " + longVar);
        System.out.println("Value Of float Variable is " + floatVar);
        System.out.println("Value Of double Variable is " + doubleVar);
        System.out.println("Value Of boolean Variable is " + booleanVar);
        System.out.println("Value Of char Variable is " + charVar);
     }
 }