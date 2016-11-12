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

    public int getCurrentParticleX(){
        return par.get(index).getX();
    }
    public int getCurrentParticleY(){
        return par.get(index).getY();
    }
    public int getCurrentParticleRad(){
        return par.get(index).getRadius();
    }
    // update state of each particle in list
    void update(int bw, int bh) {
        int tempX = par.get(index).getX();
        int tempY = par.get(index).getY();
        int tempVelX = par.get(index).getVelocityX();
        int tempVelY = par.get(index).getVelocityY();
        int tempRad = par.get(index).getRadius();

       /* par.get(index).setX(tempX + tempVelX);
        par.get(index).setY(tempY + tempVelY);

        if (tempX >= bw - tempRad && tempVelX > 0) {
            par.get(index).setX(-tempVelX);
        } else if (tempX < tempRad && tempVelX < 0) {
            par.get(index).setX(-tempVelX);
        }

        if (tempY >= bh - tempRad && tempVelY > 0) {
            par.get(index).setY(-tempVelY);
        } else if (tempY < tempRad && tempVelY < 0) {
            par.get(index).setY(-tempVelY);
        }*/




        /*
        px += velX;
	py += velY;

	if (px >= bdWidth-radius && velX > 0) {
	    velX = -velX;
	}
	else if (px < radius && velX < 0) {
	    velX = -velX;
	}

	if (py >= bdHeight-radius && velY > 0) {
	    velY = -velY;
	}
	else if (py < radius && velY < 0) {
	    velY = -velY;
	}*/
    }
}
