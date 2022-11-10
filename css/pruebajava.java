import java.lang.Math;

class Diagonal {
    public static void main(String[] argumentos) {

        // Define los números.
        Integer[][] matriz = {
            {  0,  1,  2,  3,  4,  5 },
            {  6,  7,  8,  9, 10, 11 },
            { 12, 13, 14, 15, 16, 17 },
            { 18, 19, 20, 21, 22, 23 },
            { 24, 25, 26, 27, 28, 29 },
            { 30, 31, 32, 33, 34, 35 }
        };

        // Calcula la altura y la anchura de la matriz introducida.
        Integer altura = matriz.length, anchura = matriz[0].length;

        for (
            // Recorre los inicios de cada diagonal en los bordes de la matriz.
            Integer diagonal = 1 - anchura; // Comienza con un número negativo.
            diagonal <= altura - 1; // Mientras no llegue a la última diagonal.
            diagonal += 1 // Avanza hasta el comienzo de la siguiente diagonal.
        ) {
            for (
                // Recorre cada una de las diagonales a partir del extremo superior izquierdo.
                Integer vertical = Math.max(0, diagonal), horizontal = -Math.min(0, diagonal);
                vertical < altura && horizontal < anchura; // Mientras no excedan los límites.
                vertical += 1, horizontal += 1 // Avanza en diagonal incrementando ambos ejes.
            ) {
                // Muestra cada punto de la matriz ordenadamente.
                System.out.print(matriz[vertical][horizontal] + " ");
                
            }
        }
    }}