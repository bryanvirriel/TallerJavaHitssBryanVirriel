public abstract class ElectronicoImpl extends ProductoImpl implements Electronico {
    protected String fabricante;

    public ElectronicoImpl(double precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}   