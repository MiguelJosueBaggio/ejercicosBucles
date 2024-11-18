import java.util.Scanner;

public class punto5 {

    public static void main(String[] args) {

        //Ejercicio 5: Cálculo de horas extras
        //Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
        //Instrucciones:
        //•	Pide al usuario ingresar el número de empleados.
        //•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
        //•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.

        Scanner intro = new Scanner(System.in);
        System.out.println("ingresar el numero de empleados ");
        int numero_empleado = intro.nextInt();
        int horas_trabajadas =0;
        int horas_extras= 0;
        int conteo = 0;
        int horas_totales =0;
        int horas_ext_totales=0;
        do {
            conteo = conteo +1 ;
            System.out.println("ingresar numero de horas del empelado " + conteo);
            horas_trabajadas = intro.nextInt();
            if (horas_trabajadas > 40 ) { horas_extras= horas_trabajadas-40;
                horas_ext_totales +=horas_extras;

            }
            horas_totales +=horas_trabajadas;



        } while (conteo<= (numero_empleado-1));

        System.out.println("las horas totales trabajadas son "+horas_totales + " y las horas extras totales son " + horas_ext_totales);











    }










}
