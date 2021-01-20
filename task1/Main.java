package eu.senla.task1;

import eu.senla.task1.values.Values;

public class Main {           // static нужен чтобы мы могли использовать в методе Main
    static boolean a; //хранит значение true или false
    static byte b;   //хранит целое число от -128 до 127 и занимает 1 байт
    static char c;  //хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, диапазон значений от 0 до 65535
    static double d;  //хранит число с плавающей точкой от ±4.9*10-324 до ±1.8*10308 и занимает 8 байт
    static float e;  //хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
    static int f;  //хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
    static long g;  //хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
    static short h;  //хранит целое число от -32768 до 32767 и занимает 2 байта

    static Boolean aBoolean;
    static Byte aByte;
    static Character aCharacter;
    static Double aDouble;
    static Float aFloat;
    static Integer aInteger;
    static Long aLong;
    static Short aShort;

    public static void main(String[] args) {
        Values values = new Values();
        values.setA((boolean)true);
        values.setB((byte)15);
        values.setC((char)'X');
        values.setD((double)7.8);
        values.setE((float) 7.983254E03f);
        values.setF((int) 23);
        values.setG((long) 230251451478566223L);
        values.setH((short) -32765);

        values.setaBoolean(false);
        values.setaByte((byte) 38);
        values.setaCharacter((char)'V');
        values.setaDouble((double)10.5);
        values.setaFloat((float) 25.87454E03f);
        values.setaInteger((int) 98);
        values.setaLong((long) 2247542178566223L);
        values.setaShort((short) -32769);


        boolean a = true;
        byte b = 10;
        char c = 'S';
        double d = 5.28;
        float e = 5.721f;
        int f = 7;
        long g = 2452475422541444111L;
        short h = 55;

        Boolean aBoolean = true;
        Byte aByte = 15;
        Character aCharacter = 'M';
        Double aDouble;
        Float aFloat;
        Integer aInteger = 200;
        Integer aIntegern = 200;
        Long aLong;
        Short aShort;
//____________
                    // without loss of date
        short _short = (short) b;       //byte to short
        int _int = (int) h;             //short to int
        int __int = (int) c;            //char to int
        long _long = (long) f;          //int to long
        double _double = (double) f;    //int to double
        double __double = (double) e;   //float to double
                    // with loss of date
        double ___double = (double) g;  //long to double
        float _float = (float) g;       //long to float
        float __float = (float) f;      //int to float
//____________

                    // without loss of date
        short a_short = (short) values.getB();      //byte to short
        int a_int = (int) values.getH();            //short to int
        int a__int = (int) values.getC();           //char to int
        long a_long = (long) values.getF();         //int to long
        double a_double = (double) values.getF();   //int to double
        double a__double = (double) values.getE();  //float to double
                    // with loss of date
        double a___double = (double) values.getG(); //long to double
        float a_float = (float) values.getG();      //long to float
        float a__float = (float) values.getF();     //int to float




        String r = "Hello SENLA";
        char z = 'Z';


        System.out.println(values.isA());
        System.out.println(values.getB());
        System.out.println(values.getC());
        System.out.println(values.getD());
        System.out.println(values.getE());
        System.out.println(values.getF());
        System.out.println(values.getG());
        System.out.println(values.getH());
        System.out.println();


        System.out.println(values.getaBoolean());
        System.out.println(values.getaByte());
        System.out.println(values.getaCharacter());
        System.out.println(values.getaDouble());
        System.out.println(values.getaFloat());
        System.out.println(values.getaInteger());
        System.out.println(values.getaLong());
        System.out.println(values.getaShort());
        System.out.println();


        System.out.println(_short);
        System.out.println(_int);
        System.out.println(__int);
        System.out.println(_long);
        System.out.println(_double);
        System.out.println(__double);
        System.out.println(___double);
        System.out.println(_float);
        System.out.println(__float);
        System.out.println();

        System.out.println(a_short);
        System.out.println(a_int);
        System.out.println(a__int);
        System.out.println(a_long);
        System.out.println(a_double);
        System.out.println(a__double);
        System.out.println(a___double);
        System.out.println(a_float);
        System.out.println(a__float);
        System.out.println();


        System.out.println(r);

    }


}
