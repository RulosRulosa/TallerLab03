public class Sucursal {
    private int codigoSucursal;
    private String region;

    public Sucursal(int codigoSucursal, String region) {
        this.codigoSucursal = codigoSucursal;
        this.region = region;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
