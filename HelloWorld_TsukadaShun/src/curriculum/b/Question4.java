package curriculum.b;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // Q1: 1〜5を格納した配列 → 順番に表示
        int[] sequentialNumbers = {1, 2, 3, 4, 5};
        System.out.println("Q1: 1〜5の順番表示");
        for (int num : sequentialNumbers) {
            System.out.println(num);
        }
        System.out.println();

        // Q2: 10,20,30,40,50 → 逆順表示
        int[] numbersForReverse = {10, 20, 30, 40, 50};
        System.out.println("Q2: 配列の逆順表示");
        for (int i = numbersForReverse.length - 1; i >= 0; i--) {
            System.out.println(numbersForReverse[i]);
        }
        System.out.println();

        // Q3: 3,5,7,9,11 → 合計計算
        int[] numbersForSum = {3, 5, 7, 9, 11};
        int sumOfNumbers = 0;
        for (int value : numbersForSum) {
            sumOfNumbers += value;
        }
        System.out.println("Q3: 配列の合計 = " + sumOfNumbers);
        System.out.println();

        // Q4: 12,7,9,21,5,18 → 最大値・最小値
        int[] numbersForMaxMin = {12, 7, 9, 21, 5, 18};
        int maxValue = numbersForMaxMin[0];
        int minValue = numbersForMaxMin[0];
        for (int value : numbersForMaxMin) {
            if (value > maxValue) maxValue = value;
            if (value < minValue) minValue = value;
        }
        System.out.println("Q4: 最大値 = " + maxValue + ", 最小値 = " + minValue);
        System.out.println();

        // Q5: 1〜5の配列 → 全要素2倍（拡張forで表示）
        int[] numbersToDouble = {1, 2, 3, 4, 5};
        System.out.println("Q5: 配列の要素を2倍");
        for (int value : numbersToDouble) {
            System.out.println(value * 2);
        }
        System.out.println();

        // Q6: 配列 {4,7,10,15,20} → 入力値が含まれているか判定
        int[] searchArray = {4, 7, 10, 15, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Q6: 配列に含まれるか判定 → 数値を入力してください: ");
        int inputNumber = scanner.nextInt();
        boolean found = false;
        for (int value : searchArray) {
            if (value == inputNumber) {
                found = true;
                break;
            }
        }
        System.out.println(inputNumber + (found ? " は配列に含まれています" : " は配列に含まれていません"));
        System.out.println();

        // Q7: 2次元配列 {{1,2},{3,4},{5,6}} → すべて表示
        int[][] twoDimArray = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Q7: 2次元配列の全要素表示");
        for (int row = 0; row < twoDimArray.length; row++) {
            for (int col = 0; col < twoDimArray[row].length; col++) {
                System.out.print(twoDimArray[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Q8: 2次元配列 {{10,20,30},{40,50,60},{70,80,90}} → 合計
        int[][] numbersMatrixForSum = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int totalSum = 0;
        for (int i = 0; i < numbersMatrixForSum.length; i++) {
            for (int j = 0; j < numbersMatrixForSum[i].length; j++) {
                totalSum += numbersMatrixForSum[i][j];
            }
        }
        System.out.println("Q8: 配列の合計 = " + totalSum);
        System.out.println();

        // Q9: 2次元配列 {{12,15,8},{6,19,25},{30,2,10}} → 最大・最小
        int[][] numbersMatrixForMaxMin = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
        int maxInMatrix = numbersMatrixForMaxMin[0][0];
        int minInMatrix = numbersMatrixForMaxMin[0][0];
        for (int i = 0; i < numbersMatrixForMaxMin.length; i++) {
            for (int j = 0; j < numbersMatrixForMaxMin[i].length; j++) {
                int val = numbersMatrixForMaxMin[i][j];
                if (val > maxInMatrix) maxInMatrix = val;
                if (val < minInMatrix) minInMatrix = val;
            }
        }
        System.out.println("Q9: 最大値 = " + maxInMatrix + ", 最小値 = " + minInMatrix);
        System.out.println();

        // Q10: 3次元配列 {{{1,2},{3,4}},{{5,6},{7,8}}} → 全要素表示
        int[][][] threeDimArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println("Q10: 3次元配列の全要素表示");
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    System.out.print(threeDimArray[i][j][k] + " ");
                }
            }
        }
        System.out.println();

        scanner.close();
    }
}
