public class AddShelf implements Step{
    @Override
    public void perform(TvTable tvTable) {
        tvTable.add("Shelf");
    }
}
