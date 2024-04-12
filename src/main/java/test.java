import java.io.FileInputStream;

public class test {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src//1.txt");
        System.out.println(fileInputStream.read());
    }
}