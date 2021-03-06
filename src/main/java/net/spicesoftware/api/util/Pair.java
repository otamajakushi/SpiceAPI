package net.spicesoftware.api.util;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * ２つのオブジェクトを関連付けて保持するためのクラスです。
 *
 * @since 2014/10/06
 */
public final class Pair<A, B> {

    @ToString
    public final A a;
    @ToString
    public final B b;

    private Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public static <A, B> Pair<A, B> of(A a, B b) {
        nullNot(a, b);
        return new Pair(a, b);
    }

    @Override
    public int hashCode() {
        return 31 * a.hashCode() + b.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            Pair pair = (Pair) obj;
            return pair.a.equals(a) && pair.b.equals(b);
        }
        return false;
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
