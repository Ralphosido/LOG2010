package tp1;

import java.util.*;

public final class PointOperator {

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void translate(Double[] vector, Double[] translateVector) {
        for (int i=0; i < vector.length; i++)
            vector[i] += translateVector[i];
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        for (int i=0; i< rotationMatrix.length; i++){
            Double[] coeff_vector = new Double[]{};
             for (int j=0; j < rotationMatrix[i].length; j++){
                 coeff_vector[j] = rotationMatrix[i][j] * vector[j];
             }
             //addition
            Double result=0.0;
             for (Double vector_result: coeff_vector){
                result += vector_result;
            }
            vector[i] = result;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void divide(Double[] vector, Double divider) {
        for(Double vec:vector){
            vec/=divider;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void multiply(Double[] vector, Double multiplier) {
        for (Double vec:vector){
            vec*=multiplier;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void add(Double[] vector, Double adder) {
        for (Double vec:vector){
            vec+=adder;
        }
    }
}
