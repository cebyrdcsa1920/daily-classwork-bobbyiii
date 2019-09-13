import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;
    public final double mpg;

    public Car()
    {
         model ="Mustang";
        color = Color.YELLOW;
       numPassengers = 2;
         amountOfGas= 20.5;
         mpg = 15.0;
    }
        public Car(String model, Color color, int numPassengers, double amountGas, double mpg)
        {
            this.model = model;
            this.color = color;
            this.numPassengers = numPassengers;
            this.amountOfGas = amountOfGas;
            this.mpg = mpg
        }
    /**
     * Drives the car the given distance. Subtracts gas from tank.
     *
     * @param distance. The distance driven in miles
     */
        public void drive(double distance)
        {
            amountOfGas = distance / mpg;

        }
        /**
         * get the amount of gas in the tank
         *
         * @return amount of gas
         */

        public double getAmountOfGas()
        {
            return amountOfGas;
    }
    public String toString()
    {
        return "This is my Mustang";
    }
    /**
     * Fills up the gas tank
     *
     * @param amount gas to add to tank
     */
     public void fillUpGasTank(double amount)
     {
         amountOfGas += amount;
     }

}