// Hansel just finished building his new wardrobe. After a short break, he decides it’s time to build the table he bought for the TV. Just like the last time, he reads the instructions and follows the steps in the right order.
//   . Develop the code that builds the tv-table in different steps adding its parts one by one (like in the exercise 6) following the instructions below:
//   . Reuse the classes and interfaces from exercise 6 that you consider necessary.
//   . You need at least the following classes: TvTable, TvTableBuilder.
//   . The table needs the following parts to be finished: four legs, one shelf and one top.
//   . Create the TvTableBuilderTest that ensures that the tables are being built correctly.

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
