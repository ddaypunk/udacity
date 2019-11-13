package cs046;

/**
 * Created by andydelso on 3/14/16.
 */
public class Balloon {
    private double volume;

    /**
     * Constructs a balloon object
     * @returns nothing
     */
    public Balloon(){
        this.volume = 0;
    }

    /**
     * adds the given amount of air
     * @param amount amount of air to be added
     */
    public void addAir(double amount){
        this.volume += amount;
    }

    /**
     * gets the current volume
     * @returns the current volume of the balloon
     */
    public double getVolume(){
        return this.volume;
    }

    /**
     * gets the current surface area
     * @returns the current surface area of the balloon
     */
    public double getSurfaceArea(){
        return 4 * Math.PI * Math.pow(getRadius(),2);
    }

    /**
     * gets the current radius
     * @returns the current radius of the balloon
     */
    public double getRadius(){

        double partial = (double)(3/4) * (getVolume() / Math.PI);
        float oneThird = (float)(1/3);
        System.out.println((double)(1 / 3));

        return Math.pow(partial,(1/3));
    }
}
