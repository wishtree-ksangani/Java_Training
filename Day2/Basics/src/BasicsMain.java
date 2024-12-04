import java.io.*;

public class BasicsMain {

    public static void main(String[] args) {


        /*
        strictfp example which will give same output across all the platform
         */
        StrictFpExample strictFpExample = new StrictFpExample();
        System.out.println("strictfp example");
        System.out.println(strictFpExample.calculate(0.2, 0.3) + "\n");


        /*
        transient keyword example
         */
        TransientExample tre = new TransientExample(1, "Kevin", "Kevin");

//        Serialization of the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TransientExample.txt")))
        {
            oos.writeObject(tre);
            System.out.println("serialized object : " + tre.toString());
        }catch (IOException e){
            System.out.println("IO-Exception : " + e.toString());
        }catch (Exception e){
            System.out.println(e.toString());
        }

//      deserialization of the object
        try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("TransientExample.txt"))){
            TransientExample tout = (TransientExample) oin.readObject();
            System.out.println("Deserialized object: " + tout.toString());
        }catch (IOException e){
            System.out.println("IO-Exception : " + e.toString());
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}

