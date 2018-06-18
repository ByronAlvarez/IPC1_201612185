/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec01vacas;

/**
 *
 * @author Byron Alvarez
 */
public class Proyec01Vacas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        //  Tablero tab = new Tablero();
        //  tab.setVisible(true);

        /*
     int mat[][]=new int[3][3];
        llenar_esperilicamente(mat);
        show(mat);
        System.out.println(mat[0][0]);
        System.out.println(prueba(mat));
        */
         
    }

    static void show(int matrix[][]) {
        /* imprime la matriz recibida por parametro en la pantalla */
        int MAX = matrix.length;
        int i, j;

        for (i = 0; i < MAX; i++) {
            for (j = 0; j < MAX; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("\n");
        }
    }

    static void llenar_esperilicamente(int matrix[][]) {
        /* Llena la matriz del parametro desde adentro hacia afuera */
        int MAX = matrix.length;
        //  matrix = new int[MAX][MAX];
        int i, j;
        int count = 1;
        int aux;

        if (MAX % 2 != 0) {
            aux = MAX / 2;
            /* se comienza en el punto central de la matriz */
            for (i = 0; i < MAX / 2 + 1; i++) {
                for (j = aux + i; j > aux - (2 + i); j--) {
                    if (count == MAX * MAX + 1) {
                        break;
                    }
                    matrix[aux - i][j] = count;
                    count++;
                }
                if (count == MAX * MAX + 1) {
                    break;
                }
                for (j = aux - (1 + i); j < aux + i; j++) {
                    matrix[j + 2][aux - (1 + i)] = count;
                    count++;
                }
                for (j = aux - (1 + i); j < aux + (1 + i); j++) {
                    matrix[aux + (1 + i)][j + 1] = count;
                    count++;
                }
                for (j = aux + i; j > aux - (1 + i); j--) {
                    matrix[j][aux + (1 + i)] = count;
                    count++;
                }
            }
        } else {
            aux = MAX / 2 - 1;
            /* se comienza en el punto central de la matriz */
            for (i = 0; i < MAX / 2 + 1; i++) {
                for (j = aux - i; j < aux + (2 + i); j++) {
                    matrix[aux + (1 + i)][j] = count;
                    count++;
                }
                for (j = aux + i; j > aux - (1 + i); j--) {
                    matrix[j][aux + (1 + i)] = count;
                    count++;
                }
                for (j = aux + i; j > aux - (2 + i); j--) {
                    if (count == MAX * MAX + 1) {
                        break;
                    }
                    matrix[aux - i][j] = count;
                    count++;
                }
                if (count == MAX * MAX + 1) {
                    break;
                }
                for (j = aux - (1 + i); j < aux + i; j++) {
                    matrix[j + 2][aux - (1 + i)] = count;
                    count++;
                }
            }

        }
    }

    static int prueba(int matrix[][]) {
        /* Llena la matriz del parametro desde adentro hacia afuera */
        int MAX = matrix.length;
        //  matrix = new int[MAX][MAX];
        int i, j;
        int count = 1;
        int aux;
        int seleccion = 0;

        if (MAX % 2 != 0) {
            aux = MAX / 2;
            /* se comienza en el punto central de la matriz */
            for (i = 0; i < MAX / 2 + 1; i++) {
                for (j = aux + i; j > aux - (2 + i); j--) {

                    if (count == MAX * MAX + 1) {
                        break;
                    }
                    if (matrix[aux - i][j] == 2) {
                        System.out.println("En");
                        seleccion = matrix[aux - i][j];
                        return seleccion;
                    }
                }
                if (count == MAX * MAX + 1) {
                    break;
                }
                for (j = aux - (1 + i); j < aux + i; j++) {
                    // matrix[j+2][aux-(1+i)] = count;
                    //   count++;
                    if (matrix[j + 2][aux - (1 + i)] == 2) {
                        System.out.println("Encontrado");
                        seleccion = matrix[j + 2][aux - (1 + i)];
                    return seleccion;
                    }
                }
                for (j = aux - (1 + i); j < aux + (1 + i); j++) {
                    //  matrix[aux+(1+i)][j+1] = count;
                    // count++;
                    if (matrix[aux+(1+i)][j+1] == 2) {
                        //System.out.println("Encontrado");
                        seleccion = matrix[aux+(1+i)][j+1];
                    return seleccion;
                    }
                }
                for (j = aux + i; j > aux - (1 + i); j--) {
                    //  matrix[j][aux+(1+i)] = count;
                    //  count++;
                    if (matrix[j][aux+(1+i)] == 2) {
                        //System.out.println("Encontrado");
                        seleccion = matrix[j][aux+(1+i)];
                    return seleccion;
                    }

                }
            //    if (matrix[i][j] == 3) {
           //         System.out.println(matrix[i][j]);
            //   }
            }
        } else {
            aux = MAX / 2 - 1;
            /* se comienza en el punto central de la matriz */
            for (i = 0; i < MAX / 2 + 1; i++) {
                for (j = aux - i; j < aux + (2 + i); j++) {
                    matrix[aux + (1 + i)][j] = count;
                    count++;
                }
                for (j = aux + i; j > aux - (1 + i); j--) {
                    matrix[j][aux + (1 + i)] = count;
                    count++;
                }
                for (j = aux + i; j > aux - (2 + i); j--) {
                    if (count == MAX * MAX + 1) {
                        break;
                    }
                    matrix[aux - i][j] = count;
                    count++;
                }
                if (count == MAX * MAX + 1) {
                    break;
                }
                for (j = aux - (1 + i); j < aux + i; j++) {
                    matrix[j + 2][aux - (1 + i)] = count;
                    count++;
                }
            }

        }
        return seleccion;
    }
}
