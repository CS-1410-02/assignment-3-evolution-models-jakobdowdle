// package assignment-3-evolution-models-jakobdowdle;
import java.util.*;

public class Evolution {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); 

    }

    class World {

        //world data
        ArrayList<List<String>> totalExistingCreatures = new ArrayList<List<String>>();
        //change to hashmap

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

        public void createCreature(String creatureName){

            if(creatureName.equals("dog")){

            }
            else if(creatureName.equals("lava monster")){
                
            }
        }

    }

    interface Chances{
        public void chanceToReproduce();
        public void lifeSpanDecrease();
    }

    class Creature {

        //data specific to all creatures
        int lifeSpan;

        int remainingLifeSpan;

        int chanceToReproduce;

        public int getRemainingLifeSpan(String creature){
            //place holder
            return 1;
        }

        public void die(){

        }

        public void reproduce(){

        }

    }

    class Dog extends Creature implements Chances {

        //unique trait
        int happinessLevel;

        public void play(){
            //increases happiness
        }

        public void chanceToReproduce(){

        }

        public void lifeSpanDecrease(){

        }
    }

    class LavaMonster extends Creature implements Chances {

        //unique trait
        int angerLever;

        public void attack(){
            //increases anger
        }

        public void chanceToReproduce(){

        }

        public void lifeSpanDecrease(){

        }
    }
}
