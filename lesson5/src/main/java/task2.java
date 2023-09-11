/*Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём*/
public class task2 {
        public static void main(String[] args) {
            int[][][] array = new int[3][][];
            array[0] = new int[2][];
            array[0][0] = new int[3];
            array[0][1] = new int[4];
            array[1] = new int[3][];
            array[1][0] = new int[2];
            array[1][1] = new int[5];
            array[1][2] = new int[3];
            array[2] = new int[4][];
            array[2][0] = new int[3];
            array[2][1] = new int[4];
            array[2][2] = new int[2];
            array[2][3] = new int[5];

            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    count += array[i][j].length;
                }
            }


            System.out.println("Количество ячеек в массиве: " + count);
        }
}
