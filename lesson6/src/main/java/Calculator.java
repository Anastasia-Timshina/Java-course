/*1.1 Создать класс Calculator с полями weight, cost, color и заполнить их. И
методами нахождения суммы, разности, деления, умножения двух чисел. Метод main в этом классе
не создавать !
1.2 Создать объект класса Calculator в main методе другого класса. Проверить работу
методов и вывести в консоль значения полей weight, cost, color.
1.3 Создать конструктор для класса Calculator, чтобы иметь возможность
инициализировать поля в момент создания объекта. Также в логическом блоке добавить
вывод в консоль, создаётся объект Calculator*/


    public class Calculator {
        private int weight;
        private int cost;
        private String color;

        public Calculator(int weight, int cost, String color) {
            this.weight = weight;
            this.cost = cost;
            this.color = color;
            System.out.println("Creating Calculator object");
        }

        public int sum(int num1, int num2) {
            return num1 + num2;
        }

        public int difference(int num1, int num2) {
            return num1 - num2;
        }

        public double division(int num1, int num2) {
            if (num2 != 0) {
                return (double) num1 / num2;
            } else {
                System.out.println("Cannot divide by zero");
                return 0;
            }
        }

        public int multiplication(int num1, int num2) {
            return num1 * num2;
        }
    }



