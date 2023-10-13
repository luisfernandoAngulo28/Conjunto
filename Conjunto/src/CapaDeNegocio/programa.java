/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author ferna
 */
public class programa {

    public static void main(String[] args) {
        /* public static void arraycopy(
                             Object src,  // Arreglo de origen
                             int srcPos,  // La posición inicial de la Arreglo de origen
                             Object dest, // Arreglo de destino
                             int destPos, // La posición inicial de la matriz de destino
                             int length   // Longitud de la copia
                             )*/

        int[] arregloOrigen = {1, 2, 3, 4, 5};
int[] arregloDestino = new int[3];

System.arraycopy(arregloOrigen, 1, arregloDestino, 0, 3);

// arregloDestino contendrá {2, 3, 4}.
/*
int[] arregloOrigen = {1, 2, 3, 4, 5};
int[] arregloDestino = new int[arregloOrigen.length];
*/
//System.arraycopy(arregloOrigen, 0, arregloDestino, 0, arregloOrigen.length);

// Ahora, arregloDestino contiene los mismos elementos que arregloOrigen.


        for (int i = 0; i < arregloOrigen.length; i++) {
            System.out.print(arregloOrigen[i]);
        }
        System.out.println("------------------------------------------");
        for (int i = 0; i < arregloDestino.length; i++) {
            System.out.print(arregloOrigen[i]);
        }
        System.out.println("........................");
    }

}
