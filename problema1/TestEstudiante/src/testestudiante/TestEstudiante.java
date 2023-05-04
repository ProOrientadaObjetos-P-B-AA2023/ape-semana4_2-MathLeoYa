package testestudiante;
class Estudiante{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;
    public Estudiante() {}
    public Estudiante(String nombre, double nota1, double nota2, double nota3, Universidad universidad) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.universidad = universidad;
    }
    
    //set
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    
    public void CalcularPromedio(){
        this.promedio=(this.nota1+this.nota2+this.nota3)/3;
    }
    
    //get

    public String getNombre() {
        return this.nombre;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getNota3() {
        return this.nota3;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public Universidad getUniversidad() {
        return this.universidad;
    }

    @Override
    public String toString() {
        String msj=String.format("DATOS DEL ESTUDIANTE: "
                +"%nNombre: %s"
                +"%nNota 1: %.2f"
                +"%nNota 2: %.2f"
                +"%nNota 3: %.2f"
                +"%nEl promedio es de %.2f"
                +"%nUNIVERSIDAD: "
                +"%n%s"
                ,this.nombre,this.nota1,this.nota2,this.nota3,this.promedio,this.universidad);
        return msj;
    }
    
    
}
class Universidad{
    private String nombre;
    private String direcccion;
    public Universidad(String nombre, String direcccion) {
        this.nombre = nombre;
        this.direcccion = direcccion;
    }
    
    //set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecccion() {
        return this.direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    @Override
    public String toString() {
        String msj=String.format("Nombre: %s"
                +"%nDireccion: %s"
                , this.nombre,this.direcccion);
        return msj;
    }
}
public class TestEstudiante {
    public static void main(String[] args) {
        Universidad universidad1 = new Universidad("UTPL", "LOJA");
        Estudiante estudiante1=new Estudiante("Chivo",4,5,6,universidad1);
        estudiante1.CalcularPromedio();
        System.out.println(estudiante1);
    }
    
}
