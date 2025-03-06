
package com.mycompany.tareawilsonmodulo4;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();

        while (true) {
            System.out.println("\nSistema de Gestión");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario: ");
                    double salario = scanner.nextDouble();
                    gestor.agregarEmpleado(new TareaWilsonModulo4(nombre, edad, salario));
                    System.out.println("Empleado agregado");
                    break;
                case 2:
                    gestor.mostrarEmpleados();
                    break;
                case 3:
                    System.out.println("Saliendo");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción NO EXISTE");
            }
        }
    }
}
