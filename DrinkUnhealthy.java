public abstract class DrinkUnhealthy extends Ingestible {
    public void ingestG(Human h){
        super.ingest(h, 0, 2, -2);
    };

    public void ingestM(Human h){
        super.ingest(h, 0, 1, -2);
    };

    public void ingestP(Human h){
        super.ingest(h, 0, 1, -1);
    };
}
