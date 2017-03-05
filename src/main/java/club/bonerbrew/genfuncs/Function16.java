package club.bonerbrew.genfuncs;

/**
 * A function that accepts 16 arguments and produces a result.
 */
@FunctionalInterface
public interface Function16 <K1,K2,K3,K4,K5,K6,K7,K8,K9,K10,K11,K12,K13,K14,K15,K16,R> {

    /**
     * Applies this function to the given arguments.
     *
     * @return the function result
     */
    R apply(K1 arg0,
        K2 arg1,
        K3 arg2,
        K4 arg3,
        K5 arg4,
        K6 arg5,
        K7 arg6,
        K8 arg7,
        K9 arg8,
        K10 arg9,
        K11 arg10,
        K12 arg11,
        K13 arg12,
        K14 arg13,
        K15 arg14,
        K16 arg15);
}