public class AddTop implements Step{
    @Override
    public void perform(TvTable tvTable) {
        tvTable.add("Top");
    }
}
