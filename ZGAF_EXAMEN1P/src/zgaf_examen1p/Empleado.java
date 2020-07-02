/*
 * Universidad De La Salle Bajío.
 * Ingeniería de Software y Sistemas Computacionales
 * Programación Estructurada y Orientada a Objetos
 * Autor: Angel Fabricio Zacarías Guzmán
 * Grupo: 211   Matrícula: 67664
 * Programa:
 * Descripción: Realiza un programa en Java que con POO, 
 * calcule el total de horas trabajadas por empleado,
 * sueldo bruto y neto, contemplando que se descuenta un 25% de ISR.
 * Debe encapsular los datos y mostrar una tabla con la información (3 empleados). 
 * Fecha: 0/0/2019
 */
package zgaf_examen1p;

/**
 *
 * @author fabri
 */
public class Empleado {
    
    private String Nombre;
    private Double SueldoBase;
    private Double HorasTrabajadas;
    private Double Lunes;
    private Double Martes;
    private Double Miercoles;
    private Double Jueves;
    private Double Viernes;
    
   
    public Empleado()
    {
        
    }
    
    public void SetNombre(String nombre)
    {
        this.Nombre =  nombre;
    }
    public String GetNombre()
    {
        return this.Nombre;
    }
    
    public void SetSueldoBase(Double SueldoBase)
    {
        this.SueldoBase = SueldoBase;
    }
    public Double GetSueldoBase()
    {
        return this.SueldoBase;
    }
    
        public Double GetSueldoBruto()
    {
        return this.HorasTrabajadas * this.SueldoBase;
    }
    
    
    public Double GetSueldoNeto()
    {
        Double sueldoBruto = GetSueldoBruto();
        return sueldoBruto * 0.75;
    }
    
    public void SetHorasTrabajadas(Double lunes, Double martes, Double miercoles, Double jueves, Double viernes)
    {
        this.HorasTrabajadas = lunes + martes + miercoles + jueves + viernes;
    }
    
    public Double GetHorasTrabajadas()
    {
        return this.HorasTrabajadas;
    }
    
    public void SetLunes(Double lunes)
    {
        this.Lunes = lunes;
    }
    public void SetMartes(Double martes)
    {
        this.Martes = martes;
    }
    public void SetMiercoles(Double miercoles)
    {
        this.Miercoles = miercoles;
    }
    public void SetJueves(Double jueves)
    {
        this.Jueves = jueves;
    }
    public void SetViernes(Double viernes)
    {
        this.Viernes = viernes;
    }
    
    public Double GetLunes()
    {
        return this.Lunes;
    }
    public Double GetMartes()
    {
        return this.Martes;
    }
    public Double GetMiercoles()
    {
        return this.Miercoles;
    }
    public Double GetJueves()
    {
        return this.Jueves;
    }
    public Double GetViernes()
    {
        return this.Viernes;
    }
    
    
   

}
