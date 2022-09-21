package com.hyragano;

import java.util.Objects;

public class Street {
    public String name;
    private int width;
    private int length;

    public Street(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return width == street.width && length == street.length && Objects.equals(name, street.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, length);
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
