package random;

import java.util.ArrayList;
import java.util.List;

public class PrintDigitsinInwardCircle {
    public static void main(String[] args) {

        // Input for 1st case
        // List<Integer> input = getInput(9);

        // Input for 2nd case
        // List<Integer> input = getInput(14);

        // Input for 100 numbers : scale check
        List<Integer> input = getInput(100);

        int inputLength = input.size();

        int turnSize = (int) Math.ceil(Math.sqrt(inputLength));
        int matrixSize = turnSize * turnSize;
        String turnDirection = "RIGHT";
        int noOfRights = 0;

        String res[][] = new String[turnSize][turnSize];
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrixSize;) {
            for (int turn = noOfRights; turn < turnSize; turn++) {
                if (turnDirection.equals("DOWN")) {
                    if (turn == turnSize - (noOfRights + 1))
                        break;
                    res[row++][turnSize - (noOfRights + 1)] = getValue(input, i++);
                }
                if (turnDirection.equals("RIGHT")) {
                    if (turn == turnSize - noOfRights)
                        break;
                    row = noOfRights;
                    col = turn;
                    res[row][col] = getValue(input, i++);
                }
                if (turnDirection.equals("UP")) {
                    if (turn == turnSize - (noOfRights + 2))
                        break;
                    res[--row][noOfRights] = getValue(input, i++);
                }

                if (turnDirection.equals("LEFT")) {
                    if (col == noOfRights)
                        break;
                    res[turnSize - (noOfRights + 1)][--col] = getValue(input, i++);
                }

            }
            switch (turnDirection) {
            case "RIGHT":
                turnDirection = "DOWN";
                row++;
                break;
            case "DOWN":
                turnDirection = "LEFT";
                break;
            case "LEFT":
                turnDirection = "UP";
                row--;
                break;
            case "UP":
                turnDirection = "RIGHT";
                row--;
                noOfRights++;
                break;
            }
        }
        for (int r = 0; r < turnSize; r++) {
            for (int c = 0; c < turnSize; c++)
                System.out.print("\t" + res[r][c]);
            System.out.println("");
        }

    }

    private static List<Integer> getInput(int length) {
        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= length; i++)
            input.add(i);
        return input;
    }

    static String getValue(List<Integer> list, int listIndex) {
        return list.size() > listIndex ? String.valueOf(list.get(listIndex)) : "*";
    }

}
