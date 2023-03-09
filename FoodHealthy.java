public abstract class FoodHealthy extends Ingestible {
    public void ingestG(Human h){
        super.ingest(h, 3, 1, 3);
    };

    public void ingestM(Human h){
        super.ingest(h, 2, 0, 2);
    };

    public void ingestP(Human h){
        super.ingest(h, 1, 0, 1);
    };
}
