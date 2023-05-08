
package testcheque2;
class Cheque{
    private Cliente cliente;
    private Banco banco;
    private double valor;
    private double comision;

    public Cheque() {}
    
    public Cheque(Cliente cliente, Banco banco, double valor){
        this.cliente = cliente;
        this.banco = banco;
        this.valor = valor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void calcularComision() {
        this.comision = this.valor * 0.00003;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public double getValor() {
        return valor;
    }

    public double getComision() {
        return comision;
    }

    @Override
    public String toString() {
        String msj=String.format("INFO: "
                +"%n%s"
                +"%n%s"
                +"%nvalor: %.2f"
                
                , this.cliente,this.banco,this.valor);
        return msj;
    }
}

class Cliente{
    private String nombre;
    private String apellido;
    private String cedula;
    
    public Cliente(){}

    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }
    
    public String toString(){
        String msj=String.format("Cliente: "
            +"%nNombre: %s"
            +"%nApellido: %s"
            +"%nNumero de cedula: %s"
            , this.nombre,this.apellido,this.cedula);
    return msj;
    }
}

class Banco{
    private String nombre;
    private int numeroSucursales;
    
    public Banco(){}
    
    public Banco(String nombre, int numeroSucursales) {
        this.nombre = nombre;
        this.numeroSucursales = numeroSucursales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroSucursales(int numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSucursales() {
        return numeroSucursales;
    }

    public String toString() {
        String msj=String.format("BANCO: "
                +"%nNombre: %s"
                +"%nNumero de Sucursales: %d"
                , this.nombre,this.numeroSucursales);
        return msj;
    }
}
public class TestCheque2 {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco de Loja",8);
        Cliente cliente1 = new Cliente("Chivo","Jimenez","1109512312");
        Cheque cheque1 = new Cheque(cliente1,banco1,151230.99);
        cheque1.calcularComision();
        System.out.println(cheque1);
    } 
}
