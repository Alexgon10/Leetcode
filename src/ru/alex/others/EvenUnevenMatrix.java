//package ru.alex.others;
//
//
//import java.util.Scanner;
//
///**
// * Дано n>0 нужно сгенерировать матрицу (2n+1)*(2n+1) так что
// * Клетки раскрашиваются в ч/б порядке и все углы черные
// * На главной диагонали нули
// * В белые клетки записывается числа >0 последовательно начиная с 1 проходя сначала по строкам от верхней и потом по столбцам от левого к правому
// * В черные клетки записывается числа <0 последовательно начиная с -1 проходя сначала по столбцам от левого к правому и по строкам от верхней к нижней
// * **/
//public class EvenUnevenMatrix {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        printMatrix(generateMatrix(scanner.nextInt()));
//    }
//
//    public static int[][] generateMatrix(int num) {
//        boolean isBlack = true;
//        int size = 2 * num + 1;
//        int blackCounter = -1;
//        int[][] matrix = new int[size][size];
//
//        for (int column = 0; column < size; column++) {
//            for (int row = 0; row < size; row++) {
//                if (column == row) {
//                    matrix[row][column] = 0;
//                } else if (isBlack) {
//                    matrix[row][column] = blackCounter--;
//                } else {
//                    matrix[row][column] = ((row) * size + column + 1) / 2;
//                }
//                isBlack = !isBlack;
//            }
//        }
//        return matrix;
//    }
//
//    public static void printMatrix(int[][] matrix) {
//        for (int row = 0; row < matrix.length; row++) {
//            System.out.println();
//            for (int column = 0; column < matrix.length; column++) {
//                System.out.print(matrix[row][column] + " ");
//            }
//        }
//    }
//}
