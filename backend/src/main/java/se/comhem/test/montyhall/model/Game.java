package se.comhem.test.montyhall.model;

import java.util.*;

public class Game {

    private static final int NUM_DOORS = 3;
    private List<Door> doors;

    public Game(){
        this.doors = initDoors();
    }

    public List<Door> getDoors() {
        return doors;
    }

    private List<Door> initDoors() {
        List<Door> tempDoors = new ArrayList<>(NUM_DOORS);
        tempDoors.add(new Door(true));
        tempDoors.add(new Door(false));
        tempDoors.add(new Door(false));

        Collections.shuffle(tempDoors);

        Random rand = new Random();
        tempDoors.get(rand.nextInt(tempDoors.size())).selectInitialDoor();

        return tempDoors;
    }







}
