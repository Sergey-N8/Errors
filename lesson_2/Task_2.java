public class Task_2 {
    public static void main(String[] args) {
        //Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        //int[] intArray = {0, 1, 2, 3, 4, 5};
        Integer[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, null };
        Integer d = 1;
        Integer index = 8; 
        try {
            if (!d.getClass().equals(Integer.class)) {
                System.out.println("Неверный класс аргумента d");
            } else if (!index.getClass().equals(Integer.class)) {
                System.out.println("Неверный класс аргумента index");
            } else if (!intArray.getClass().equals(Integer[].class)) {
                System.out.println("Неверный класс аргумента intArray"); 
            } else if (d.equals(0)) {
                System.out.println("На ноль делить нельзя"); 
            } else if (intArray.length - 1 < index  || index < 0) {
                System.out.println("Аргумент ссылается за пределы массива");
            } else if (intArray[index] == null) {
                System.out.println("Невозможно произвести деление, так как intArray[index] = null"); 
            } else {
                double catchedRes1 = intArray[index] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
/*


Если необходимо, исправьте данный код:

        try {    
            int d = 0;
            double catchedRes1 = intArray[8] / d;   
            System.out.println("catchedRes1 = " + catchedRes1);  
        } catch (ArithmeticException e) {  
            System.out.println("Catching exception: " + e);  
        }

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
       //int[] intArray = {0, 1, 2, 3, 4, 5};
       //Integer[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, null };

        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

*/