package net.spicesoftware.api.util.vector;

import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * x, yを{@code double}で保持する２次元ベクタークラスです。
 *
 * @since 2015/01/15
 */
public final class Vector2d {

    public static final Vector2d ZERO = new Vector2d(0, 0);
    @ToString
    public final double x;
    @ToString
    public final double y;

    Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Vector2d v2d(double x, double y) {
        return new Vector2d(x, y);
    }

    public double area() {
        return x * y;
    }

    public double dot(Vector2d vector2d) {
        nullNot(vector2d);
        return x * vector2d.x + y * vector2d.y;
    }

    public double cross(Vector2d vector2d) {
        nullNot(vector2d);
        return x * vector2d.y - y * vector2d.x;
    }

    public double lengthSquared() {
        return x * x + y * y;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public Vector2d add(double x, double y) {
        return new Vector2d(this.x + x, this.y + y);
    }

    public Vector2d add(Vector2d vector2d) {
        nullNot(vector2d);
        return new Vector2d(x + vector2d.x, y + vector2d.y);
    }

    public Vector2d subtract(double x, double y) {
        return new Vector2d(this.x - x, this.y - y);
    }

    public Vector2d subtract(Vector2d vector2d) {
        nullNot(vector2d);
        return new Vector2d(x - vector2d.x, y - vector2d.y);
    }

    public Vector2d multiply(double scalar) {
        return new Vector2d(x * scalar, y * scalar);
    }

    public Vector2f toVector2f() {
        return new Vector2f((float) x, (float) y);
    }

    public Vector2i toVector2i() {
        return new Vector2i((int) x, (int) y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && getClass() == obj.getClass()) {
            Vector2d vector2d = (Vector2d) obj;
            return vector2d.x == x && vector2d.y == y;
        }
        return false;
    }

    @Override
    public String toString() {
        return ReflectionToString.rts(this);
    }
}
