package PaSkCode;

import java.util.ArrayList;

public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius

    public ArrayList<ParticleObj> par;
    int index;
    int count = 0;

    PSysModel() {
        // instantiate list of particles
        par = new ArrayList<ParticleObj>();

    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {

        ParticleObj tempPar = new ParticleObj(rad, x, y, vx, vy);

        par.add(tempPar);
        index = count;
        count++;
	    System.out.println("Added: " + rad + " " + x + " " + y);
    }

    public int getArrayLength() {
        return par.size();
    }

    public int getCurrentParticleX(int indexNo){
        return par.get(indexNo).getX();
    }
    public int getCurrentParticleY(int indexNo){return par.get(indexNo).getY();}
    public int getCurrentParticleRad(int indexNo){
        return par.get(indexNo).getRadius();
    }
    public int getCurrentParticleVelX(int indexNo){
        return par.get(indexNo).getVelocityX();
    }
    public int getCurrentParticleVelY(int indexNo){
        return par.get(indexNo).getVelocityY();
    }

    // update state of each particle in list
    void update(int bw, int bh) {
        for (int i = 0; i < par.size(); i++) {
            int tempX = par.get(i).getX();
            int tempY = par.get(i).getY();
            int tempVelX = par.get(i).getVelocityX();
            int tempVelY = par.get(i).getVelocityY();
            int tempRad = par.get(i).getRadius();

            par.get(i).setX(tempX + tempVelX);
            par.get(i).setY(tempY + tempVelY);

             if (tempX >= bw - tempRad && tempVelX > 0) {
                 par.get(i).setVelocityX(-tempVelX);
             }else if (tempX < tempRad && tempVelX < 0) {
                par.get(i).setVelocityX(-tempVelX);
            }

            if (tempY >= bh - tempRad && tempVelY > 0) {
                par.get(i).setVelocityY(-tempVelY);
             }else if (tempY < tempRad && tempVelY < 0) {
                par.get(i).setVelocityY(-tempVelY);
            }

        }
    }
}
