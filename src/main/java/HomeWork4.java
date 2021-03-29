import java.util.Scanner;
import java.util.Random;

public class HomeWork4 {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Random rand = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            System.out.println("ti vishel za predely");
            return false;
        }
        if (map[y][x] == DOT_EMPTY) return true;
        System.out.println("mozjet bit' zanyato");
        return false;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkDiagonals(char symb) {
        boolean isWin = true;
        for (int i = 0; i < map.length; i++) {
            if (map[i][i] != symb) isWin = false;

        }
        if (isWin) return true;

        isWin = true;
        for (int i = 0; i < map.length; i++) {
            if (map[i][map.length - i - 1] != symb) isWin = false;
        }
        return isWin;
    }

    public static boolean checkRows(char symb) {

        for (int i = 0; i < map.length; i++) {

            boolean isWin = true;

            for (int j = 0; j < map.length; j++) {
                if (map[i][j] != symb) {
                    isWin = false;
                    break;
                }
            }
            if (isWin) return true;
        }
        return false;
    }

    public static boolean checkColumns(char symb) {
        for (int i = 0; i < map.length; i++) {

            boolean isWin = true;

            for (int j = 0; j < map.length; j++) {
                if (map[j][i] != symb) {
                    isWin = false;
                    break;
                }
            }
            if (isWin) return true;
        }
        return false;
    }


    public static boolean checkWin(char symb) {
        return checkRows(symb) || checkColumns(symb) || checkDiagonals(symb);
/* 1. Проверить наличие выигрышной ситуации у бота (2 в ряд) -> победить
    2. ---///--- у человека (2 в ряду) -> заблокировать
    3. если сейчас первый ход и свободна середина -> ходим в центр
    4. ----///--- и не свободна середина -> ходить в ромб
    5. сделать диагональ из 2х фишек+3 свободна
    6.???
    7. профит
 */

//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;


    }
}