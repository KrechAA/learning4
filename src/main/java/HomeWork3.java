


import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner nG = new Scanner(System.in);
    public static Scanner uW = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args) {

        do {
            game();
        }
        while (endGame() == 1);



            gameWords();





    }





    public static void game() {
        int r = rand.nextInt(9);
        System.out.println("введи число от 0 до 9");

        for (int i = 0; i < 3; i++) {
            int userIn = sc.nextInt();

            if (userIn == r) {
                System.out.println("Ты победил.");
                break;
            } else {
                System.out.println("неверно");
            }
            if (i == 2) {
                System.out.println("ты проиграл");
            }


        }
    }

    public static int endGame() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

        int newGame = nG.nextInt();
        if (newGame == 1) {
            return 1;

        } else {
            System.out.println("Игра окончена");
            return 0;
        }


    }



    public static void gameWords() {



        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int randW = rand.nextInt(words.length);
  //      System.out.println(words[randW]);

        char[] resultArr = new char[15];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = '#';
        }


        for (int i = 0; i < words[randW].length(); i++) {
            resultArr[i] = words[randW].charAt(i);
        }




        while (true) {
            String userW = uW.nextLine();
            if (words[randW].equals(userW)) {
                System.out.println("Ты победил.");
                return;
            }

            for (int i = 0; i < userW.length(); i++) {

                char randChar = resultArr[i];
                char userChar = userW.charAt(i);


                if (userChar == randChar) {
                    System.out.print(randChar);
                } else {
                    System.out.print("#");
                }

            }
            for (int i = 0; i < 15 - userW.length(); i++) {
                System.out.print("#");

            }
            System.out.println(" ");
        }


    }


}

