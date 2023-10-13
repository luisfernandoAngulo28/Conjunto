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
public class Conjunto {

    //Atributos
    int C[];
    int dim;

    //Constructor
    public Conjunto() {
        C = new int[10];
        dim = -1;
    }

    public boolean Vacio() {
        return dim == -1;
    }

    public void insertar(int elemento) {
        if (Vacio()) {
            dim++;
            C[dim] = elemento;
        } else {
            if (!pertenece(elemento)) {

                Redimensionar();
                dim++;
                C[dim] = elemento;

            }
        }

    }

    public boolean pertenece(int elemento) {
        for (int i = 0; i <= dim; i++) {///recorre el arreglo
            if (C[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public void eliminar(int elemento) {
        if (!Vacio()) {
            int i = 0;
            while ((i <= dim) && (C[i] != elemento)) { //aqui ubicamos la posicion               
                i++;
            }

            if (i <= dim) {
                for (int j = i; j < dim; j++) {
                    C[j] = C[j + 1];
                }
                dim--;
            }
        }
    }

    public void Redimensionar() {
        if (dim == C.length - 1) {
            int C1[] = new int[C.length];
            System.arraycopy(C, 0, C1, 0, C.length);
            //le damos mas espacio a mi arreglo original
            C = new int[C.length + 10];
            System.arraycopy(C1, 0, C, 0, C1.length);

        }

    }

    public void union(Conjunto A, Conjunto B) {
        for (int i = 0; i <= A.dim; i++) {
            insertar(A.C[i]);
        }
        for (int i = 0; i <= B.dim; i++) {
            insertar(B.C[i]);
        }
    }

    public void interseccion(Conjunto A, Conjunto B) {
        for (int i = 0; i <= A.dim; i++) {
            if (B.pertenece(A.C[i])) {
                insertar(A.C[i]);
            }

        }

    }

    @Override
    public String toString() {
        String S = "C={";
        for (int i = 0; i <= dim; i++) {
            S = S + C[i] + ",";
        }
        return S + "}";
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Conjunto A = new Conjunto();
        for (int i = 1; i < 4; i++) {
            A.insertar(i);
        }
        System.out.println(A.toString());
        Conjunto B = new Conjunto();
        B.insertar(4);
        B.insertar(5);
        B.insertar(6);
        System.out.println(B.toString());
        Conjunto C = new Conjunto();
        C.union(A, B);
        System.out.println(C.toString());
    }

}
