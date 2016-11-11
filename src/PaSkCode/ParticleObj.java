package PaSkCode;

/**
 * Created by Joey on 11/11/2016.
 */
public class ParticleObj {
    private int radius, x, y, velocityX, velocityY;

    ParticleObj(int newR, int newX, int newY, int newVelX, int newVelY) {
        radius = newR;
        x = newX;
        y = newY;
        velocityX = newVelX;
        velocityY = newVelY;
    }

    //todo do get and set for each


    public int getRadius() {
        return radius;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return radius;
    }
    public int getVelocityX() {
        return radius;
    }
    public int getVelocityY() {
        return radius;
    }


    public void setRadius(int r) {
        radius = r;
    }
    public void setX(int nx) {
        x = nx;
    }
    public void setY(int ny) {
        y = ny;
    }
    public void setVelocityX(int nvx) {
        velocityX = nvx;
    }
    public void setVelocityY(int nvy) {
        velocityY = nvy;
    }

}
