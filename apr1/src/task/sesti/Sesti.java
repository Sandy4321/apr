package task.sesti;

import matrix.Matrix;

import java.io.IOException;

public class Sesti {
    public static void main(String[] args) throws IOException {

        Matrix A = Matrix.load("src\\task\\sesti\\A.txt");
        Matrix b = Matrix.load("src\\task\\sesti\\b.txt");

        Matrix LU = A.lu();
        Matrix y = LU.forwardSupstiton(b);
        Matrix.print(y, "y:");
        Matrix x = LU.backwardSupstition(y);
        Matrix.print(x, "x:");

        Matrix LUP = A.lup();
        b = Matrix.permuteRows(b);
        Matrix.print(b, "b permutiran:");
        Matrix y1 = LUP.forwardSupstiton(b);
        Matrix.print(y1, "y:");
        Matrix x1 = LUP.backwardSupstition(y1);
        Matrix.print(x1, "x:");

    }
}


