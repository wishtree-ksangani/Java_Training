@FunctionalInterface
public interface Operation<T> {
    T operate(T num1, T num2);
}
