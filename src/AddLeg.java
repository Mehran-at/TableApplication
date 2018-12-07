public class AddLeg implements Step{
    @Override
    public void perform(TvTable tvTable) {
        tvTable.add("Leg");
    }
}
