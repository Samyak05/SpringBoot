package org.reference;

// Class A is dependent on Class B
// Means Class A requires an object/reference of B
public class A {
    private int x;
    private B object;

    public A(){
        super();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getObject() {
        return object;
    }

    public void setObject(B object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "A{" + "x=" + x + ", object=" + object + '}';
    }
}
