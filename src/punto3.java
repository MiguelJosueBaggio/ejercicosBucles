import java.util.Scanner;

public class punto3 {
    public static void main(String[] args) {

//Ejercicio 3: Control de inventario
//Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades
// disponibles para realizar un pedido.
//Instrucciones:
//•	Pide al usuario ingresar el número de productos.
//•	Usa un bucle para ingresar la cantidad disponible de cada producto.
//•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.

        Scanner intro = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de productos");
        int numeroDeProductos = intro.nextInt();
        for (int i = 0; i < numeroDeProductos ; i++) {
            System.out.println("Ingrese el nombre del producto");
            String producto = intro.next();
            System.out.println("Ingrese la cantidad");
            int cantidad = intro.nextInt();
            if (cantidad <5) {
                System.out.println("Reponer "+ "el producto " + producto);

                }
            else {
                System.out.println("ok");

            }

        }








    }





}
