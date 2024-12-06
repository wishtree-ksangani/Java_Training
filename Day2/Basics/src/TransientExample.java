import java.io.*;

public class TransientExample implements Serializable {
    int id;
    String name;
//    transient  String password
    String password;

    public TransientExample(int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    /**
     * Custom writeObject for writing the object into bitstream
     *
     * <p>
     *     Password field is excluded while serializing the object
     * </p>
     *
     * @param objectOutputStream Object of the  Output Stream object
     * @throws IOException Exception during the IO Operations
     * @throws ClassNotFoundException If not able to found the class details
     */
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException, ClassNotFoundException {
//        Store the password into local variable and assign it to null to exclude that field from being serialized
        String password = this.password;
        this.password = null;
        objectOutputStream.defaultWriteObject();
        this.password = password;
    }

    /**
     * Custom readObject for reading the object from bitstream
     *
     * @param objectInputStream  Input stream to read the object data
     * @throws IOException If any exception occurs during the IO Operation
     * @throws ClassNotFoundException If class if not founded
     */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
    }


    @Override
    public String toString() {
        return "name : " + name + ", password : " + password;
    }
}
