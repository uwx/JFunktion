package club.bonerbrew.tuples;

import java.util.Iterator;

import club.bonerbrew.tuples.values.IValue0;

/**
 * A tuple of 1 elements.
 */
public final class Tuple1 <K1>
    implements BaseTuple,
    IValue0 <K1> {

        private static final long serialVersionUID = -1607420937567707033L;

        private final K1 val0;

        public static <K1> Tuple1 <K1> with(final K1 value0) {
            return new Tuple1 <K1> (value0);
        }

        /**
         * Create a tuple from an array. The array has to have exactly 1 elements.
         * 
         * @param <X> the array element type
         * @param array the array to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple1 <X> fromArray(final X[] array) {
            if(array == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }
            if(array.length != 1) {
                throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple1. Size is " + array.length);
            }
            return new Tuple1 <X> (
                array[0]
            );
        }

        /**
         * Create tuple from an iterable. It must have exactly 1 elements or less remaining.
         * 
         * @param <X> the iterable component type 
         * @param iterable the iterable to be converted to a tuple
         * @return the tuple
         */
        public static <X> Tuple1 <X> fromIterable(final Iterable <X> iterable) {
            return fromIterable(iterable.iterator());
        }

        private static <X> Tuple1 <X> fromIterable(final Iterator <X> iter) {

            if(iter == null) {
                throw new NullPointerException("Iterator cannot be null");
            }

            X element0 = null;

            if(iter.hasNext()) {
                element0 = iter.next();
            }

            return new Tuple1 <X> (
                element0
            );
        }

        private Tuple1(
            final K1 value0
        ) {
            this.val0 = value0;
        }

        public K1 getValue0() {
            return this.val0;
        }

        @Override
        public int getSize() {
            return 1;
        }
    }