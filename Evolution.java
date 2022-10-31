// package assignment-3-evolution-models-jakobdowdle;
import java.util.*;

public class Evolution {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); 

        //The program will ask if you want a tundra or a jungle and then will automatically make two dogs and two lava monsters.

        //There will be loops that take into account the temperature of the biome and the chances that are implemented from the interface.

    }

    class World {

        //world data
        public HashMap<Integer, Creature> HashtotalExistingCreatures = new HashMap<Integer, Creature>();

        private String biome = new String();

        private int temperature;

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

        int creaturId;

        public int getRemainingLifeSpan(String creature){
            //place holder
            return 1;
        }

        private void die(){

        }

        private void reproduce(){

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
