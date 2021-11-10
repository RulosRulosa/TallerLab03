import java.util.Scanner;

public class Camion {
    private int codigoCamion;
    private String patente;
    private String descripcion;
    private boolean estado;
    private Flete flete;
    private Producto producto;

    public Camion(int codigoCamion, String patente, String descripcion, boolean estado) {
        this.codigoCamion = codigoCamion;
        this.patente = patente;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int generarCodigo(){
        int codigo= (int) Math.random();

        return codigo= codigoCamion;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCodigoCamion() {
        return codigoCamion;
    }

    public void setCodigoCamion(int codigoCamion) {
        this.codigoCamion = codigoCamion;
    }

    public String getPatente() {
        return patente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Flete getFlete() {
        return flete;
    }

    public void setFlete(Flete flete) {
        this.flete = flete;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean estadoCamion(){
        int service= validar(1);
        if(service==1){
            estado= true;
        }
        if(service==0){
            estado= false;
        }
        return estado;
    }

    public int validar(int x) {
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner(System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            if (n < 0 || n > x) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }


}
