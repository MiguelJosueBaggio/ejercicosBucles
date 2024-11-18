import java.util.Scanner;

public class punto2 {   public static void main(String[] args) {

    //Ejercicio 2: Cálculo de salarios semanales
    //Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
    //Instrucciones:
    //•	Pide al usuario ingresar la cantidad de empleados.
    //•	Para cada empleado, pide ingresar las horas trabajadas.
    //•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).

    Scanner intro = new Scanner(System.in);
    System.out.println("Ingrese numero de empelados");
    double num_empleados= intro.nextDouble();
    double salarioTotal=0;
    for (int n = 0; n < num_empleados ; n++) {
        System.out.println("ingrese las horas trabajadas");
        double horas = intro.nextDouble();
        double salario = horas*15;
        int c=n+1;
        System.out.println( "el salario del empleado "+ c +" es:" +salario);
        salarioTotal= salarioTotal +salario;


    }
    System.out.println("el salario total de todos  es " + salarioTotal);








}
}
