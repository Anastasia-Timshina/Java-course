package task3;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        ExceptionHandlingExample example = new ExceptionHandlingExample();

        // Пример 1: try-catch
        try {
            example.method1();
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }

        // Пример 2: try-catch с несколькими catch-блоками
        try {
            example.method2();
        } catch (NullPointerException e) {
            System.out.println("Ошибка: ссылка на null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива");
        }

        // Пример 3: try-catch с multi-catch
        try {
            example.method3();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("Ошибка: недопустимый аргумент или выход за пределы массива");
        }

        // Пример 4: try-catch-finally
        try {
            example.method4();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполнен");
        }
    }

    // Метод 1: деление на ноль
    public void method1() {
        int result = 10 / 0;
    }

    // Метод 2: работа с массивом
    public void method2() {
        int[] arr = {1, 2, 3};
        int value = arr[5];
    }

    // Метод 3: недопустимый аргумент и выход за пределы массива
    public void method3() {
        String str = null;
        //System.out.println(str.length());

        int[] arr = {1, 2, 3};
        int value = arr[5];
    }

    // Метод 4: выбрасывание пользовательского исключения
    public void method4() throws Exception {
        throw new Exception("Ошибка в методе");
    }
}

