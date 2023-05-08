package testautomotor2;
class Automotor{
    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;
    private Fabricante fabricante;

    public Automotor(String cedula, String marca, int anio, double valorVehiculo, Fabricante fabricante) {
        this.cedula = cedula;
        this.marca = marca;
        this.anio = anio;
        this.valorVehiculo = valorVehiculo;
        this.fabricante = fabricante;
    }

    
    
    //set

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    public void CalcularValorMatricula(){
        this.valorMatricula=(this.valorVehiculo*0.00002)*(2023-this.anio);
    }
    
    //get

    public String getCedula() {
        return cedula;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }
    
    public String toString(){
        String msj=String.format("DATOS AUTOMOTOR: "
                +"%nCedula: %s"
                +"%nMarca: %s"
                +"%nAnio: %d"
                +"%nValor del Vehiculo: %.2f"
                +"%nValor de la Matricula: %.2f"
                +"%n%s"
                ,this.cedula,this.marca,this.anio,this.valorVehiculo,this.valorMatricula,this.fabricante);
        
        return msj;
    }
}
class Fabricante{
    private String nombre;
    private String ciudad;

    public Fabricante(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    //set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    //get

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    public String toString(){
        String msj=String.format("DATOS DE FABRICANTE: "
                +"%nNombre: %s"
                +"%nCiudad del fabricante: %s"
                ,this.nombre,this.ciudad );
        return msj;
    }
}
public class TestAutomotor2 {
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Chivo", "Loja");
        Automotor automotor1 = new Automotor("1103475578", "Ford", 1785,28000.99, fabricante1);
        automotor1.CalcularValorMatricula();
        System.out.println(automotor1);
    }
    
}
