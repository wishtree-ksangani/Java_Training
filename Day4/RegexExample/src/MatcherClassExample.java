import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("kevin", Pattern.CASE_INSENSITIVE);
        String description  = "Hellow my name is Kevin, the means of kevin is handsome.";
//        Matcher class
        Matcher matcher = pattern.matcher(description);
//        Print the how many time kevin is appear in the description
        while (matcher.find()){
            System.out.println("Starting : " + matcher.start() + " , End : " + (matcher.end()-1) + "Word : " + matcher.group());
        }
//        Matcher's pattern method
        System.out.println(matcher.pattern());
//        g+g and g++g
        Pattern greedy = Pattern.compile("g+g");
        Pattern propositional = Pattern.compile("g++g");
//        Output of bot for "gggg" input
        System.out.println("greedy check : " + greedy.matcher("gggg").matches());
        System.out.println("Propositional check : " + propositional.matcher("gggg").matches());


    }
}
