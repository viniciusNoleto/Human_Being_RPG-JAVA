public abstract class Ingestible {

    public void ingest(Human h, int hunger, int thirst, int health){
        h.setSatietyHunger(h.getSatietyHunger() + hunger);
        h.setSatietyThirst(h.getSatietyThirst() + thirst);
        h.setHealth(h.getHealth() + health);
    };

    public abstract void ingestG(Human h);
    public abstract void ingestM(Human h);
    public abstract void ingestP(Human h);

}