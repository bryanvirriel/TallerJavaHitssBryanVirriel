package enums;

public enum OrderPriority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int nivel;

    OrderPriority(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}