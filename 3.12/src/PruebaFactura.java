import javax.swing.*;

public class PruebaFactura {
    public static void main(String[] args) {
        System.out.println("Numeros de piezas: ");
        String pieza= JOptionPane.showInputDialog("Ingrese el codigo de la pieza");
        String descripcion =JOptionPane.showInputDialog("Ingrese descripcion");
        String cantidadStr=JOptionPane.showInputDialog("Ingrese la cantidad:");
        int cantidad=Integer.parseInt(cantidadStr);
        String precioStr=JOptionPane.showInputDialog("Ingrese el precio:");
        double precio=Double.parseDouble(precioStr);
        Factura factura=new Factura(pieza,descripcion,cantidad,precio);
        String mensaje= "Factura\n"+"Codigo de pieza:"+ factura.getPieza()+"\n"+"Descripcion: "+factura.getDescripcion()
                +"\n"+"Cantidad: "+factura.getCantidad()+"\n"+"Precio: "+ factura.getPrecio() + "\n"+"Total: $" + factura.obtenerMontoFactura();
     JOptionPane.showInputDialog(null,mensaje,"Factura",JOptionPane.INFORMATION_MESSAGE);

    }
}
