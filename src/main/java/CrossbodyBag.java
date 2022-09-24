/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/**
 * Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 */

public class CrossbodyBag extends Bag{

    private int numberOfStraps;

    /**
     *      The constructor for CrossbodyBag should take the following parameters
     *       in order:
     *           1. a String for the color
     *           2. an int for the capacity
     *           3. an int for the number of straps
     */

    public CrossbodyBag(String color, int capacity, int straps){
        super(color, capacity);
        this.numberOfStraps = straps;
    }

    /**
     *       CrossbodyBag should also have a getter method called getNumberOfStraps
     *       and it should implement the enhance method.
     */

    public int getNumberOfStraps(){
        return this.numberOfStraps;
    }

    /**
     *       The enhance method should increase the capacity of the CrossbodyBag by
     *       2 (as opposed to the 1 that HandBag increases by).
     */

    public void enhance(){
        super.increaseCapacity(2);
    }

    /**
     *       The toString method should be overridden to return a string in the
     *       in the same form as Bag's toString but with the original "Bag" part
     *       of the string replaced by:
     *           Crossbody Bag with {numberOfStraps} straps
     */

    @Override
    public String toString() {
        return this.getColor() + " Crossbody Bag with " + this.numberOfStraps + " straps (" + this.getNumberOfContents() +
                " / " + this.getCapacity() + ")";
    }
}

/*
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

