package ru.geekbrains.seminar1.modelelements;

public class Angle3D {

    private Vector3D vector1;
    private Vector3D vector2;
    private double angle;

    public double getAngle() {
        return angle;
    }

    public Vector3D getVector1() {
        return vector1;
    }

    public Vector3D getVector2() {
        return vector2;
    }

    public Angle3D(Vector3D vector1, Vector3D vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

}
