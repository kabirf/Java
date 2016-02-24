package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fish fish=new Fish("Puffer fish", "female");
        GoldFish goldFish=new GoldFish("Lion head", "female", true);
        FlyingFish flyingFish=new FlyingFish("pectoral","Feed on bacteria and planktons","Weak currents",true);
        Guppy guppy=new Guppy("Orange Guppy","female",true);
        SnakeHead snakeHead=new SnakeHead("Snake Head", "female",true);

        System.out.println("Fish created");
        System.out.println("name:" +fish.getName()+ ". Gender:" +fish.getSex());
        System.out.println("---------------------");
        System.out.println("GoldFish created");
        System.out.println("name:" +goldFish.getName()+". Gender:"+goldFish.getSex()+". Can lay eggs:" +goldFish.getCanLayEggs());
        System.out.println("---------------------");
        System.out.println("Flying fish created");
        System.out.println("Fin type:"+flyingFish.getHasFinns()+". Food type:"+flyingFish.getFoodType()+". Breeding environment:"+flyingFish.getEggFertilizationEnvironment()+". Can it fly:"+flyingFish.getCanFly());
        System.out.println("---------------------");
        System.out.println("Guppy created");
        System.out.println("name:"+guppy.getName()+". Gender:"+guppy.getSex()+". Can lay babies:"+guppy.getCanLayBabies());
        System.out.println("---------------------");
        System.out.println("Snake head created");
        System.out.println("name:"+snakeHead.getName()+". Gender:"+snakeHead.getSex()+". Is is Amphibious:"+snakeHead.getAmphibious());
    }
}
