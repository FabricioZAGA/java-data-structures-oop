/*
 * Universidad De La Salle Bajío.
 * Ingeniería de Software y Sistemas Computacionales
 * Programación Estructurada y Orientada a Objetos
 * Autor: Angel Fabricio Zacarías Guzmán
 * Grupo: 211   Matrícula: 67664
 * Programa:
 * Descripción:
 * Fecha: 0/0/2019
 */
package zgaf_examen1p;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ZGAF_EXAMEN1P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados = LeerEmpleados(empleados);
        ImprimirEmpleados(empleados);
    }
    
    public static Empleado LeerEmpleado()
    {
        double lunes, martes, miercoles, jueves, viernes;
        Empleado empleadoChido = new Empleado();
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca nombre");
        empleadoChido.SetNombre(read.nextLine());
        System.out.println("Introduzca SueldoBase");
        empleadoChido.SetSueldoBase(read.nextDouble());
        System.out.println("Horas Lunes");
        empleadoChido.SetLunes(read.nextDouble());
        System.out.println("Horas Martes");
        empleadoChido.SetMartes(read.nextDouble());
        System.out.println("Horas Miercoles");
        empleadoChido.SetMiercoles(read.nextDouble());
        System.out.println("Horas Jueves");
        empleadoChido.SetJueves(read.nextDouble());
        System.out.println("Horas Viernes");
        empleadoChido.SetViernes(read.nextDouble());
        empleadoChido.SetHorasTrabajadas(empleadoChido.GetLunes(), empleadoChido.GetMartes(), empleadoChido.GetMiercoles(), empleadoChido.GetJueves(), empleadoChido.GetViernes());
        return empleadoChido;
    }
    public static Empleado[] LeerEmpleados(Empleado[] empleadosChidos)
    {
        for (int i = 0; i < 3; i++)
        {
            empleadosChidos[i] = LeerEmpleado();
        }
        return empleadosChidos;
    }
    public static void ImprimirEmpleado(Empleado empleadoChido)
    {
        System.out.println(empleadoChido.GetNombre() + "\t" + empleadoChido.GetLunes() + "\t" + empleadoChido.GetMartes() + "\t" + empleadoChido.GetMiercoles() + "\t" + empleadoChido.GetJueves() + "\t" + empleadoChido.GetViernes() + "\t" + empleadoChido.GetSueldoBase() + "\t"  + empleadoChido.GetSueldoNeto() + "\t" + empleadoChido.GetSueldoBruto());
    }
    public static void ImprimirEmpleados(Empleado[] empleadoChido)
    {
        System.out.println("Nombre\tLunes\tMartes\tMiercoles\tJueves\tViernes\tSueldoBase\tSueldoNeto\tSueldoBruto\n"); 
        for (int i = 0; i < 3; i++)
        {
        ImprimirEmpleado(empleadoChido[i]);
        }
    }
}
