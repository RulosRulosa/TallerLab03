import java.util.Scanner;

public class Menu {
    public void mostrarPantalla(){
        System.out.println("1) agregar producto\n" +
                "2) quitar producto\n" +
                "3) cambiar estado camión\n" +
                "4) agregar camión" +
                "5) desvincular camión\n" +
                "6) calcular valor total");
        eleccion(opcion());
    }
    public int opcion(){
        int num;
        do {
            Scanner tec = new Scanner(System.in);
            num = tec.nextInt();
        }while(num<1||num>5);
            return num;
    }
    public void eleccion(int opcion){
        Scanner tec = new Scanner(System.in);
        String fósforos = tec;
        Producto producto = new Producto(123456, fósforos);
        switch (opcion()){
            case 1:
                producto.setTipoProducto();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
    }
}
