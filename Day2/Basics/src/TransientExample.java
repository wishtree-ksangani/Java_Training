import java.io.Serial;
import java.io.Serializable;

public class TransientExample implements Serializable {
    int id;
    String name;
    transient String password;

    public TransientExample(int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "name : " + name + ", password : " + password;
    }
}
