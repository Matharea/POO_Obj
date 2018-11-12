public class Classroom{
    public static void main(String...args){
	Wilder paul = new Wilder("Paul", true);
	Wilder jean = new Wilder("Jean", false);

	System.out.println(paul.whoAmI());
	System.out.println(jean.whoAmI());
    }
}
