public abstract class Disease {

    public void hurt(Human h, int health){
        h.setHealth(h.getHealth() + health);
    };

}
