import java.util.Scanner;

public class Producto {
    private int codigoProducto;
    private String tipoProducto;

    public Producto(int codigoProducto, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.tipoProducto = tipoProducto;
    }
    public int generarCodigo(){
        int codigo= (int) Math.random();

        return codigo= codigoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
