// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a byte and a short, and produces a
 * result.  This is the {@code byte} and {@code short}-consuming primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <R> the type of the result of the function
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface ByteShortFunction<R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code byte} argument
     * @param v2 the {@code short} argument
     * @return the function result
     */
    R apply(byte v1, short v2);
}
