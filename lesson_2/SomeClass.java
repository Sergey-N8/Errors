import java.io.*;

public class SomeClass {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[2]; // выход за граници массива
            test (); // файл
            int a = 1 / 0; // деление на ноль
            inputStream = new FileInputStream("sdafgdsaf");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Catching exception: " + e);
        } catch (IOException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } catch (StackOverflowError e) {
            System.out.println("Catching exception: " + e);
        } catch (Throwable e) {
            e.printStackTrace ();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader (file);
        reader.read();
        test();
    }
}