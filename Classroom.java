public class Classroom{
    public static void main(String[] args){
        Wilder firstWilder = new Wilder("Hervé", true);
        Wilder seconWilder = new Wilder("Marion", false);
        Wilder thirdWilder = new Wilder("Jerome", true);

        System.out.println(firstWilder.whoAmI());
        System.out.println(seconWilder.whoAmI());
        System.out.println(thirdWilder.whoAmI());
    }
}