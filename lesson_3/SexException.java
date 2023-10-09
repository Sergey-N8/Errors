package lesson_3;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Значение пола введено не корректно: %s", i);
        System.out.println();
    }
}
