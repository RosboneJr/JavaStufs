import java.util.Random;
public class Cheater extends BaseballTeam {
    private int ischeater = 1;

    @Override
    public int getIscheater() {
        return ischeater;
    }

    public static Random rand = new Random();
    private Cheat[] cheats = new Cheat[2];



    public Cheater(String name, String color){
        super(name, color);
        cheats[0] = new Cheat("Corked Bats", 3);
        cheats[1] = new Cheat("Sign Stealing", 2);

    }

    public Cheat CheatWithDetails(){
        return cheats[rand.nextInt(2)];
    }

}
