// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a float and a generic, and produces a
 * int result.  This is the {@code float} and {@code int}-consuming-to-{@code double} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface FloatIntToDoubleFunction {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code float} argument
     * @param v2 the {@code int} argument
     * @return the function result
     */
    double apply(float v1, int v2);
}