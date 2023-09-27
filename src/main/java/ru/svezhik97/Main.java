package ru.svezhik97;

public class Main {
    public static void main(String[] args) {
        byte aByte = Byte.MAX_VALUE;
        short aShort = Short.MAX_VALUE;
        int aInt = Integer.MIN_VALUE;
        long aLong = 9223372036854775807L;
        float aFloat = 34.23f;
        double aDouble = 1000.0;
        boolean aTrue = true;
        boolean aFalse = false;
        char aChar = 'a';
        String testString = "qa_guru";


        System.out.println("aByte + aShort = " + (aByte + aShort));
        System.out.println("aShort - aByte = " + (aShort - aByte));
        System.out.println("aLong / aInt = " + (aLong / aInt));
        System.out.println("aInt % aShort = " + (aInt % aShort));
        System.out.println("aInt + aDouble = " + (aInt + aDouble));
        System.out.println("aInt * aDouble = " + (aInt * aDouble));


//      ! - отрицание "НЕ"
//      & - умножение "И"
//      | - сложение "ИЛИ" Возвращает true если хотя бы один из операндов равен true
//      ^ - исключающее "ИЛИ" Возвращает true, если один и только один из операндов равен true. Возвращает false, если оба операнда равны true или false
//      && - Условное "И" То же самое, что и &, но если операнд, находящийся слева от & является false, данный оператор возвращает false без проверки второго операнда
//      || - Условное "ИЛИ" То же самое, что и |, но если оператор слева является true, оператор возвращает true без проверки второго операнда

        System.out.println("aFloat < aDouble = " + (aFloat < aDouble));
        System.out.println("aTrue && !aFalse = " + (aTrue && !aFalse));
        System.out.println("aTrue || aFalse = " + (aTrue || aFalse));


//      Метод indexOf() вернет индекс символа, присутствующего в строке
        System.out.println("Index of symbol: " + testString.indexOf(aChar));
    }
}