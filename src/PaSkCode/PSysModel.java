package PaSkCode;

public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius



    PSysModel() {
        // instantiate list of particles
    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {

		radius = rad;
		px = npx;
		py = npy;
		velX = nvx;
		velY = nvy;

	    System.out.println("Added: " + rad + " " + px + " " + py);
    }


    // update state of each particle in list
    void update(int bw, int bh) {
    }
}
