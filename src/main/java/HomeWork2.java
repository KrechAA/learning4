import java.util.Arrays;
public class HomeWork2 {
//йцуке
    public static void main(String[] args) {


        int[] ex1 = {0, 0, 1, 1, 0, 0};

        for (int i = 0; i < ex1.length; i++) {

            if (ex1[i] > 0) ex1[i] = 0;
            else ex1[i] = 1;
        }
        System.out.println("Задание 1: " + Arrays.toString(ex1));

        int[] ex2 = new int[8];
        for (int i = 0; i < ex2.length; i++) {
            ex2[i] = i * 3;

        }
        System.out.println("Задание 2: " + Arrays.toString(ex2));

        int[] ex3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ex3.length; i++) {

            if (ex3[i] < 6) ex3[i] = ex3[i] * 2;

        }
        System.out.println("Задание 3: " + Arrays.toString(ex3));

        System.out.println("Задание 4: ");
        int[][] ex4 = new int[3][3];
        for (int i = 0; i < ex4.length; i++) {
            for (int j = 0, j2 = ex4[i].length; j < ex4[i].length; j++, j2--) {
               if (i == j || i == (j2 - 1)) ex4[i][j] = 1;
                System.out.print(ex4[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Задание 5: ");
        int []ex5 = {1,2,2,3,5,-10,99,10};
        int imin=0, imax=0, min = ex5[0], max = ex5[0];
        for (int i = 0; i < ex5.length; i++){
            if(ex5[i]>max) {
                max=ex5[i];
                imax=i;
            }
            if (ex5[i]<min) {
                min=ex5[i];
                imin=i;

            }

        }
        System.out.println("Индекс " + imax + " значение " + max);
        System.out.println("Индекс " + imin + " значение " + min);





    }
}

