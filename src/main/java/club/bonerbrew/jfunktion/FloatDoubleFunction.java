// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a float and a double, and produces a
 * result.  This is the {@code float} and {@code double}-consuming primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface FloatDoubleFunction<R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code float} argument
     * @param v2 the {@code double} argument
     * @return the function result
     */
    R apply(float v1, double v2);
}
