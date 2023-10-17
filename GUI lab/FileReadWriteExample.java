import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String textFilePath = "textfile.txt";
        String binaryFilePath = "binaryfile.bin";

        writeTextFile(textFilePath, "This is Text File being written!");
        String textContent = readTextFile(textFilePath);
        System.out.println("Text content: " + textContent);

        byte[] data = { 0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x2C, 0x20, 0x57, 0x6F, 0x72, 0x6C, 0x64, 0x21 };
        writeBinaryFile(binaryFilePath, data);
        
        byte[] binaryContent = readBinaryFile(binaryFilePath);
        System.out.print("Binary content: ");
        
        for (int i = 0; i < binaryContent.length; i++) {
            System.out.print(binaryContent[i] + " ");
        }
    }
    
    public static void writeTextFile(String filePath, String text) {
        try {
            FileWriter Writer_obj = new FileWriter(filePath);
            Writer_obj.write(text);
            Writer_obj.close();
            System.out.println("Text file written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the text file: " + e.getMessage());
        }
    }
    
    public static String readTextFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader_obj = new FileReader(filePath);
            int c;
            while ((c = reader_obj.read()) != -1) {
                content.append((char) c);
            }
            reader_obj.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the text file: " + e.getMessage());
        }
        return content.toString();
    }
    
    public static void writeBinaryFile(String filePath, byte[] data) {
        try {
            FileOutputStream output_obj= new FileOutputStream(filePath);
            output_obj.write(data);
            output_obj.close();
            System.out.println("Binary file written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the binary file: " + e.getMessage());
        }
    }
    
    public static byte[] readBinaryFile(String filePath) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
            inputStream.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the binary file: " + e.getMessage());
        }
        return outputStream.toByteArray();
    }
}
