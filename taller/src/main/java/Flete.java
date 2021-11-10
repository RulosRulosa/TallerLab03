import java.util.Scanner;

public class Flete {
    private int codigoFlete;
    private String descripcion;
    private int pack;

    public Flete(int codigoFlete, String descripcion, int pack) {
        this.codigoFlete = codigoFlete;
        this.descripcion = descripcion;
        this.pack = pack;
    }
    public int generarCodigo(){
        int codigo= (int) Math.random();

        return codigo= codigoFlete;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigoFlete(int codigoFlete) {
        this.codigoFlete = codigoFlete;
    }

    public void setPack(int pack) {
        this.pack = pack;
    }

    public int getCodigoFlete() {
        return codigoFlete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPack() {
        return pack;
    }

    public int pack(){

        return pack;
    }
}
