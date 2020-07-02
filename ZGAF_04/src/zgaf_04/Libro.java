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
package zgaf_04;

/**
 *
 * @author fabri
 */
public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String genero;
    private String edicion;
    private double precio;
    private String fechaPublicacion;
    private int noPag;
    
    public Libro()
    {
        
    }
    public Libro(String titulo)
    {
        this.titulo = titulo;
    }
    public String getTitulo()
    {
        return(titulo);
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor()
    {
        return(autor);
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    public String getEditorial()
    {
        return(editorial);
    }
    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }
    public String getGenero()
    {
        return(genero);
    }
    public void setGenero(String genero)
    {
        this.genero = genero;
    }
    public String getEdicion()
    {
        return(edicion);
    }
    public void setEdicion(String edicion)
    {
        this.edicion = edicion;
    }
    public double getPrecio()
    {
        return(precio);
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    public String getFechaPublicacion()
    {
        return(fechaPublicacion);
    }
    public void setFechaPublicacion(String fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }
    public int getNoPag()
    {
        return(noPag);
    }
    public void setNoPag(int noPag)
    {
        this.noPag = noPag;
    }
    
}
