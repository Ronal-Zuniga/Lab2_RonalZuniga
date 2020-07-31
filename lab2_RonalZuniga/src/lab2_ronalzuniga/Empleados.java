
package lab2_ronalzuniga;

public class Empleados {

    private String nombre;
    private String apellido;
    private String color;
    private int edad;
    private String genero;
    private float altura;
    private float peso;
    private String titulo;
    private String cargo;
    private int salario;
    
    public Empleados(String x){
        
        this.nombre=x;
        this.apellido=x;
        this.color=x;
        this.genero=x;
        this.titulo=x;
        this.genero=x;
    }
    
    public Empleados(int aux){
    
        this.edad=aux;
        this.salario=aux;
        
    }
    
    public Empleados(float n){
    
        this.altura=n;
        this.peso=n;
        
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String n){
        this.apellido=n;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setTitulo(String n){
        this.titulo=n;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setEdad(int n){
        this.edad=n;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setCargo(String n){
        this.cargo=n;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    @Override
    public String toString(){
    
        return "Nombre: "+nombre+" Apellido: "+apellido+" Cargo: "+cargo;
    
    }
    
    

    
}//fin de la clase

