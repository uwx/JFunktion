// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

/**
 * Represents a function that accepts two arguments, a int and a float, and produces a
 * result.  This is the {@code int} and {@code float}-consuming primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface IntFloatFunction<R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code int} argument
     * @param v2 the {@code float} argument
     * @return the function result
     */
    R apply(int v1, float v2);
}