// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

/**
 * Represents a predicate (boolean-valued function) of a {@code char}-valued and a {@code double}-valued argument.
 * This is the primitive type specialization of
 * {@link java.util.function.BiPredicate} for {@code char}/{@code double}.
 *
 * @see java.util.function.BiPredicate
 */
@FunctionalInterface
public interface CharDoublePredicate {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param v1 the {@code char} argument
     * @param v2 the {@code double} argument
     * @return {@code true} if the input arguments match the predicate,
     * otherwise {@code false}
     */
    boolean apply(char v1, double v2);
}
