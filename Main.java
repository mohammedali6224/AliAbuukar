package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            char[][] GridBoard = {{' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' '}};

            printGridBoard(GridBoard);
            Scanner scan = new Scanner(System.in);

            System.out.println("Select number (1-36)");


            int pos = scan.nextInt();


            System.out.println(pos);

            switch (pos) {
                case 1:
                    GridBoard[0][0] = 'x';
                    break;
                case 2:
                    GridBoard[0][2] = 'x';
                    break;
                case 3:
                    GridBoard[0][4] = 'o';
                    break;
                case 4:
                    GridBoard[0][6] = 'x';
                    break;
                case 5:
                    GridBoard[0][8] = 'x';
                    break;
                case 6:
                    GridBoard[0][10] = 'x';
                    break;
                case 7:
                    GridBoard[2][0] = 'x';
                    break;
                case 8:
                    GridBoard[2][2] = 'o';
                    break;
                case 9:
                    GridBoard[2][4] = 'x';
                    break;
                case 10:
                    GridBoard[2][6] = 'x';
                    break;
                case 11:
                    GridBoard[2][8] = 'x';
                    break;
                case 12:
                    GridBoard[2][10] = 'x';
                    break;
                case 13:
                    GridBoard[3][0] = 'x';
                    break;
                case 14:
                    GridBoard[3][2] = 'x';
                    break;
                case 15:
                    GridBoard[3][4] = 'o';
                    break;
                case 16:
                    GridBoard[3][6] = 'x';
                    break;
                case 17:
                    GridBoard[3][8] = 'o';
                    break;
                case 18:
                    GridBoard[3][10] = 'x';
                    break;
                case 19:
                    GridBoard[4][0] = 'x';
                    break;
                case 20:
                    GridBoard[4][2] = 'x';
                    break;
                case 21:
                    GridBoard[4][4] = 'x';
                    break;
                case 22:
                    GridBoard[4][8] = 'x';
                    break;
                case 23:
                    GridBoard[4][10] = 'x';
                    break;
                case 24:
                    GridBoard[5][0] = 'x';
                    break;
                case 25:
                    GridBoard[5][2] = 'o';
                    break;
                case 26:
                    GridBoard[5][4] = 'x';
                    break;
                case 27:
                    GridBoard[5][6] = 'x';
                    break;
                case 28:
                    GridBoard[5][8] = 'x';
                    break;
                case 29:
                    GridBoard[5][10] = 'x';
                    break;
                case 30:
                    GridBoard[6][0] = 'o';
                    break;
                case 31:
                    GridBoard[6][2] = 'x';
                    break;
                case 32:
                    GridBoard[6][4] = 'o';
                    break;
                case 33:
                    GridBoard[6][6] = 'x';
                    break;
                case 34:
                    GridBoard[6][8] = 'o';
                    break;
                case 35:
                    GridBoard[6][10] = 'x';
                    break;
                case 36:
                    GridBoard[7][0] = 'o';
                    break;

            }
            printGridBoard(GridBoard);

        }


       // }







            public static void printGridBoard(char[][] gridBoard) {
                for (char[] row : gridBoard) {
                    for (char c : row) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
            }
          public static void selectPlace(char[][] gridBoard,int pos) {

    }


}








