public class Gym implements Ambient {
    public int interact(Human h, NPC npc){
        System.out.println(npc.getName() + ": Hello, wellcome to the gym! Let's work out!");
        
        int exercice = 0;
        if(exercice == 0){
            System.out.println(h.getName() + ": No... thanks. Maybe another day...");
        }if(exercice == 1){
            System.out.println(npc.getName() + ": Some aerobics today? Good choise!");
            h.setSpeed(h.getSpeed() + 1);
        }if(exercice == 2){
            System.out.println(npc.getName() + ": I know you can do it! SO JUST DO IT!!");
            h.setStrength(h.getStrength() + 1);
        }if(exercice == 3){
            System.out.println(npc.getName() + ": You want some faster way? Go to the bathroom and get a pill under the second drawer");

            int take_pill = 0;
            if(h.getIntelligence() >= 8 || take_pill == 0){
                System.out.println("You get a pill but think about it and give up, running out the place.");
            }if(h.getIntelligence() <= 3 || take_pill == 1){
                System.out.println("You swallow a pill and feel the energy filling you body and your veins.");
                h.setStrength(h.getStrength() + 2);
                h.setSpeed(h.getSpeed() + 1);
                h.setHealth(h.getHealth() - 1);
            }
        }
        
        return exercice;
    }
}
