public class Factura {
    String Pieza;
    String Descripcion;
    int cantidad;
    double precio;

    public Factura(String pieza, String descripcion, int cantidad, double precio) {
        Pieza = pieza;
        Descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        if (cantidad>0){
            this.cantidad=cantidad;
        }else{
            this.cantidad=0;
        }
        if (precio>0){
            this.precio=precio;
        }else{
            this.precio=0.0;
        }
    }


    public void setPieza(String pieza) {
        Pieza = pieza;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        if(precio>0){
            this.precio = precio;
        }else{
            this.precio=0.0;
        }

    }

    public void setCantidad(int cantidad) {
        if(cantidad>0){
            this.cantidad = cantidad;
        }else{
            this.cantidad=0;
        }

    }

    public String getPieza() {
        return Pieza;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public double obtenerMontoFactura(){
        return cantidad * precio;
    }
}
