public class StringExample {
    public static void main(String[] args) {
//        String concate
        String firstName = "Kevin";
        String lastName = "Sangani";
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name : " + fullName);
        System.out.println("Length of full name : " + fullName.length());

//        String using new keyword
        String name = new String("Kevin");

//        String buffer
        StringBuffer stringBuffer = new StringBuffer(20);
        stringBuffer.append("Kevin");
        System.out.println(stringBuffer.toString());

//        String builder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hellow");
        System.out.println(stringBuilder.toString());


    }
}
