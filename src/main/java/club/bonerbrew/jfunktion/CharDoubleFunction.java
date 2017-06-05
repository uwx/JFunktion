// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a char and a double, and produces a
 * result.  This is the {@code char} and {@code double}-consuming primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface CharDoubleFunction<R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code char} argument
     * @param v2 the {@code double} argument
     * @return the function result
     */
    R apply(char v1, double v2);
}