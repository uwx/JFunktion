// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.jfunktion;

import java.util.Objects;

/**
 * Represents a predicate (boolean-valued function) of one {@code char}-valued
 * argument. This is the {@code char}-consuming primitive type specialization
 * of {@link Predicate}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(char)}.
 *
 * @see Predicate
 * @since 1.8
 */
@FunctionalInterface
public interface CharPredicate {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param value the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    boolean test(char value);
}
