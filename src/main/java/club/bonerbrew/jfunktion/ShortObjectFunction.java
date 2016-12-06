// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a short and a generic, and produces a
 * result.  This is the {@code short}-consuming primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface ShortObjectFunction<T, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code short} argument
     * @param v2 the generic argument
     * @return the function result
     */
    R apply(short v1, T v2);
}
