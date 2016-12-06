// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a long and a boolean, and produces a
 * result.  This is the {@code long} and {@code boolean}-consuming primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface LongBooleanFunction<R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code long} argument
     * @param v2 the {@code boolean} argument
     * @return the function result
     */
    R apply(long v1, boolean v2);
}
