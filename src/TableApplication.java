public class TableApplication {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        System.out.println(tvTableBuilder.build(wardrobe));
    }
}
// i'm really appreciate of this exercise. Because it gives me the feeling that if i understand something i can do it.
// Although i spent half a day to solve this question but i could reuse my learning here and save time.
// Btw i could not ruse those classes from Ikea application here because i deleted them after putting them on my Github.
//Also i could not do the testing part. Because me and some more guys missed that part, since there many exercises left
// to finish and hadn't enough time to review those lectures.