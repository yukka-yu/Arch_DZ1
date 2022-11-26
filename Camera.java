package ru.geekbrains.seminar1.modelelements;

public class Camera {
    public Point3D location;
    public Vector3D angle;

    public Flash(Point3D location, Vector3D angle, Color color, Float power){
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public Vector3D getAngle() {
        return angle;
    }

    public void rotate(Vector3D angle) {
        this.angle = angle;
    }
    public void move(Point3D location) {
        this.location = location;
    }

}
