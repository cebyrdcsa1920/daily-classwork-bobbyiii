import java.awt.Color;

public class Pet
{
        private String species;
        private Color color;
        private int numLegs;
        private double weight;

        public Pet()
        {
            species = "Dog";
            color = Color.BLACK;
            numLegs = 4;
            weight = 22.2;
        }

        public Pet(String species, Color color, int numLegs, double weight)
        {
            this.species = species;
            this.color = color;
            this.numLegs = numLegs;
            this.weight = weight;
        }

        public void eat(double foodWeight)
        {
        weight += foodWeight;
        }

}