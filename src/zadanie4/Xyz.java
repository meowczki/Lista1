package zadanie4;

public class Xyz {
    private float x;
    private float y;
    private float z;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public Xyz(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "x= " + x + " y= " + y + " z= " + z;
    }

}
