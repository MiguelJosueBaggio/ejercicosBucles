import java.util.Scanner;

public class punto4 {
    //Ejercicio 4: Registro de ventas diarias
    //Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
    //Instrucciones:
    //•	Usa un bucle para registrar las ventas diarias durante 7 días.
    //•	Al final del bucle, muestra el total de ventas de la semana.

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
         String dia = "";
         double monto_total = 0;
        for (int i = 0; i < 7 ; i++) {
            switch (i)
            {   case 0:
                    dia = "lunes";
                break;
                case 1:
                    dia = "martes";
                break;
                case 2:
                    dia = "miercoles";
                    break;
                case 3:
                    dia = "jueves";
                    break;
                case 4:
                    dia = "viernes";
                    break;
                case 5:
                    dia = "sabado";
                    break;
                case 6: dia = "domingo";
                    break;
                default:
                    System.out.println("error");





            }//fin switch


            System.out.println("insertar el valor de ventas del dia " + dia );
            double venta_dia = intro.nextDouble();
            monto_total += venta_dia;


        }//fin for


        System.out.println("las ventas totales de la semana fue: "+ monto_total);







    }

}
