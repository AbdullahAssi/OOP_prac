import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class BinaryWrite_Read {
    public static void main(String[] args) {
        String fileName = "BINARY.bin";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
             DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {

            // WritinG
            dos.writeInt(123);
            dos.writeUTF("Hello");  
            dos.writeInt(456);
            dos.writeUTF("World");

            System.out.println("Data written to the file successfully.");

            // ReadING
            int intValue1 = dis.readInt();
            String stringValue1 = dis.readUTF();
            int intValue2 = dis.readInt();
            String stringValue2 = dis.readUTF();

            System.out.println("Read data from the file:");
            System.out.println(intValue1);
            System.out.println(stringValue1);
            System.out.println(intValue2);
            System.out.println(stringValue2);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing or reading from the file.");
        }
    }
}
