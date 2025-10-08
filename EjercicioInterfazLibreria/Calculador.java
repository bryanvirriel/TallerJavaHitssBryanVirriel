import java.util.List;

@FunctionalInterface
public interface Calculador<T, R> {
    R calcular(List<T> lista);
}