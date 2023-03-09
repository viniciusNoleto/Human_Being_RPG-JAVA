public abstract class FoodUnhealthy extends Ingestible {
    public void ingestG(Human h){
        super.ingest(h, 6, -2, -3);
    };

    public void ingestM(Human h){
        super.ingest(h, 4, -1, -2);
    };

    public void ingestP(Human h){
        super.ingest(h, 2, -1, -1);
    };
}
