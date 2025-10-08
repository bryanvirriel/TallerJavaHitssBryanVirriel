public abstract class ProductoImpl implements Producto {
    protected double precio;

    public ProductoImpl(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}