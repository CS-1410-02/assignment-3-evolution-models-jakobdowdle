// package assignment-3-evolution-models-jakobdowdle;
import java.util.*;

public class Evolution {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); 

    }

    class World {

        //world data
        ArrayList<List<String>> totalExistingCreatures = new ArrayList<List<String>>();

        String biome = new String();

        int temperature;

        public void createBiome(String name){

            biome = name;

            //There are only two possible biomes
            if(biome.equals("tundra")){
                temperature = 0;
            }
            if(biome.equals("jungle")){
                temperature = 90;
            }

        }

    }
}
