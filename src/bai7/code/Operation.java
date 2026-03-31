package bai7.code;

@FunctionalInterface
public interface Operation <T> {
    T execute(T a, T b);
}
