import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable {
    private String name;
    private int age;
    private int runs;

    public Cricketer (String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }

}

public class SerializationProg {
    public static void main(String[] args) throws Exception {
        // Cricketer c = new Cricketer("KL", 32, 10000);
        // c.disp();

        // FileOutputStream fos = new FileOutputStream("atif.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(bos);

        // oos.writeObject(c);

        // oos.flush();
        // oos.close();
        
// ------------------------------------------------------------------------------------------------------

        // Deserialization

        FileInputStream fis = new FileInputStream("atif.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr = (Cricketer) ois.readObject();
        cr.disp();

        ois.close();


    }
}
