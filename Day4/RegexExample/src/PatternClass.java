import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
//        Regex for mobile number
        Pattern mobileNumer = Pattern.compile("[0-9]{10}");
        System.out.println("Regex for Mobile number check for : 9924737495 :" + mobileNumer.matcher("9924737495").matches());
        System.out.println("Regex for Mobile number check for : 992473749 :" + Pattern.matches("[0-9]{10}", "992473749"));
        System.out.println("Pattern for mobile number : " + mobileNumer.pattern());
//        Regex for email
        System.out.println("Regex for email : " + Pattern.matches("[._a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+", "kevin.sangani@wishtreetech.com") );
    }
}
