/*Задача 2:
Создать программу для раскраски шахматной доски с помощью цикла. Создать
двумерный массив String 8х8. С помощью циклов задать элементам массива значения
B(Black) или W(White). При выводе результат работы программы должен быть следующим:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W

*/
public class homework2 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];


        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }


        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
