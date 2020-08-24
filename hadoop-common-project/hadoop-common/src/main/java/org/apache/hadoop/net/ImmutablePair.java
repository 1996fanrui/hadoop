package org.apache.hadoop.net;

import java.util.Objects;

public class ImmutablePair<L, R> {

    L left;

    R right;

    private ImmutablePair(L left, R right){
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePair<?, ?> that = (ImmutablePair<?, ?>) o;
        return Objects.equals(left, that.left) &&
                Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    public static <L, R> ImmutablePair<L, R> of(L left, R right){
        return new ImmutablePair<>(left, right);
    }
}
