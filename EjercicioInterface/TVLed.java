public class TVLed extends ElectronicoImpl {
    public TVLed(double precio, String fabricante) {
        super(precio, fabricante);
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.25; // 25% más
    }
}