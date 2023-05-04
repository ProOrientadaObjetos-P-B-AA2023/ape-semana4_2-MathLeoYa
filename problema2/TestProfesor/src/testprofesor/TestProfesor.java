package testprofesor;
class Profesor{
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    private ProvNacimiento provNacimineto;
    public Profesor(String nombre, String apellido, String cedula, double sueldoBasico, ProvNacimiento provNacimineto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        this.provNacimineto = provNacimineto;
    }
    
    //set
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setProvNacimineto(ProvNacimiento provNacimineto) {
        this.provNacimineto = provNacimineto;
    }
    
    public void CalcularSueldoTotal(){
        this.sueldoTotal=(this.sueldoBasico*1.2);
    }
    
    //get

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public ProvNacimiento getProvNacimineto() {
        return provNacimineto;
    }
     public String toString(){
        String msj=String.format("DATOS DEL PROFESOR:"
                +"%nNombre: %s"
                +"%nApellido: %s"
                +"%nCedula: %s"
                +"%nSueldo Basico: %.2f"
                +"%nSueldo Total: %.2f"
                +"%n%s"
                ,this.nombre,this.apellido,this.cedula,this.sueldoBasico,this.sueldoTotal,this.provNacimineto);
        return msj;
    }
    
}
class ProvNacimiento{
    private String nombre;
    private int numHabitantes;

    public ProvNacimiento(String nombre, int numHabitantes) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
    }
    //sett

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }
    //get

    public String getNombre() {
        return nombre;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }
    public String toString(){
        String msj=String.format("PROVINCIA:"
                +"%nNombre: %s"
                +"%nNumero de habitantes: %d"
                ,this.nombre,this.numHabitantes);
        return msj;
    }
}
public class TestProfesor {
    public static void main(String[] args) {
        ProvNacimiento provNacimiento1=new ProvNacimiento("Loja", 1500);
        Profesor profesor1=new Profesor("chivito","Jimenez","1105833303",100,provNacimiento1);
        profesor1.CalcularSueldoTotal();
        System.out.println(profesor1);
    }
}
