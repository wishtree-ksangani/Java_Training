import java.lang.Character;

public class CharecterClassExample {

    public static void main(String[] args) {
        // Use of codePointBefore()
        char[] name = new char[] { 'k', 'e', 'v', 'i', 'n' };
        int position = 4;

        // Returns the Unicode code point before the specified position
        int val = Character.codePointBefore(name, position);
        int val1 = Character.codePointBefore(name, 1);
        int val2 = Character.codePointBefore(name, 3, 1);

        System.out.println("Unicode code point before " + position + " : " + val);
        System.out.println("Unicode code point before 1 : " + val1);
        System.out.println("Unicode code point before 3 to 1 : " + val2);
        System.out.println("");

        // Use of codePointCount()
        int count = Character.codePointCount(name, 1, 3);

        System.out.println("No. of Unicode points : " + count);
        System.out.println("");

        // Use of compareTo()
        Character firstChar = 'K';
        Character secondChar = 'V';

        int check = firstChar.compareTo(secondChar);
        System.out.println("firstChar < secondChar : " + check);
        int check1 = secondChar.compareTo(firstChar);
        System.out.println(" secondChar > firstChar : " + check1);
        int check2 = secondChar.compareTo(secondChar);
        System.out.println("secondChar = secondChar : " + check2);
    }
}
