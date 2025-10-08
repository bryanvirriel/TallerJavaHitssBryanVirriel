public class IPhone extends ElectronicoImpl {
    public IPhone(double precio, String fabricante) {
        super(precio, fabricante);
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.3; // 30% más
    }
}