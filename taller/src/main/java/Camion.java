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
        int codigo;

        return codigo= codigoCamion;
    }

    public void setPatente(String patente) {
        Scanner teclado = new Scanner(System.in);
        patente= teclado.next();
        this.patente = patente;
    }

    public String getDescripcion() {
        return descripcion;
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
