package se.comhem.test.montyhall.model;

public class Door {

    private boolean selected;
    private boolean initiallySelected;
    private boolean containsPrize;
    private boolean removedByMonty;

    public Door(boolean containsPrize) {
        this.containsPrize = containsPrize;
    }

    public boolean isSelected() {
        return selected;
    }

    public boolean isInitiallySelected() {
        return initiallySelected;
    }

    public boolean isContainsPrize() {
        return containsPrize;
    }

    public boolean isRemovedByMonty() {
        return removedByMonty;
    }

    public void selectInitialDoor() {
        selected = true;
        initiallySelected = true;
    }

    public void selectDoor() {
        selected = true;
    }

    public void unSelectDoor() {
        selected = false;
    }

    public void removeByMorty() {
        removedByMonty = true;
    }




}