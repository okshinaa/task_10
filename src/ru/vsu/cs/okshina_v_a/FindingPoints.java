package ru.vsu.cs.okshina_v_a;

public class FindingPoints {
    public int[][] findResult(int[][] array) {
            return findPointsWithMaxSquare(array);
        }

    private int[][] findPointsWithMaxSquare(int[][] array) {
        double maxSquare = 0;
        int[][] result = new int[3][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if ((i != j) && (i != k) && (j != k)) {
                        double a = Math.sqrt(Math.pow(array[i][0] - array[j][0], 2) + Math.pow(array[i][1] - array[j][1], 2));
                        double b = Math.sqrt(Math.pow(array[i][0] - array[k][0], 2) + Math.pow(array[i][1] - array[k][1], 2));
                        double c = Math.sqrt(Math.pow(array[k][0] - array[j][0], 2) + Math.pow(array[k][1] - array[j][1], 2));

                        if (isTriangleExist(a, b, c)) {
                            double p = (a + b + c) / 2;
                            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                            if (square > maxSquare) {
                                int[] firstPoint = new int[]{array[i][0], array[i][1]};
                                int[] secondPoint = new int[]{array[j][0], array[j][1]};
                                int[] thirdPoint = new int[]{array[k][0], array[k][1]};

                                result = new int[][]{firstPoint, secondPoint, thirdPoint};

                                maxSquare = square;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    private boolean isTriangleExist(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
