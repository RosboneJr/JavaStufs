
import java.util.Random;
public class WorldSeries {
    public static Random rand = new Random();
    public static int gameswon1 = 0;
    public static int gameswon2 = 0;
    public static final int games = 4;
    public static final int millidelay = 500;
    public static void main(String[] args) {
        System.out.println("Jacoooooooooooooooooob Wisniewski");
        BaseballTeam Pirates = new BaseballTeam("Pirates", "yellow");//makes the teams
        BaseballTeam Astros = new Cheater("Yankees", "blue");
        simulateSeries(Pirates, Astros);
    }
    public  static void simulateGame(BaseballTeam team1, BaseballTeam team2){
        int team1runs = rand.nextInt(10) + 1;
        team1runs += getCheatRuns(team1);
        int team2runs = rand.nextInt(10) + 1;
        team2runs += getCheatRuns(team2);
        if(team1runs > team2runs){
            //team one wins
            team1.winGame();
            team2.loseGame();


            System.out.println("Game Result: The "+ConsoleColors.YELLOW+team1.getName()+ConsoleColors.RESET+" Won!");
            System.out.println("Series Score: "+ConsoleColors.YELLOW+team1.getName()+ConsoleColors.RESET+" " + team1.getGamesWon()+ " - "+ConsoleColors.BLUE+ team2.getName()+ConsoleColors.RESET+" " + team2.getGamesWon());
            gameswon1 +=1;


        }else if(team2runs > team1runs){//team two wins
            team1.loseGame();
            team2.winGame();
            System.out.println("Game Result: The "+ConsoleColors.BLUE+team2.getName()+ConsoleColors.RESET+" Won!");
            System.out.println("Series Score: "+ConsoleColors.YELLOW+team1.getName()+ConsoleColors.RESET+" " + team1.getGamesWon()+ " - "+ConsoleColors.BLUE+ team2.getName()+ConsoleColors.RESET+" " + team2.getGamesWon());
            gameswon2 +=1;

        }else{
            System.out.println("its a tie no one wins");//results

            System.out.println("Series Score: "+ConsoleColors.YELLOW+team1.getName()+ConsoleColors.RESET+" " + team1.getGamesWon()+ " - "+ConsoleColors.BLUE+ team2.getName()+ConsoleColors.RESET+" " + team2.getGamesWon());
        }

    }
    public static void simulateSeries(BaseballTeam team1, BaseballTeam team2){

        while(gameswon1 < games && gameswon2 < games){//waits till someone wins four times
            simulateGame(team1, team2);//you already know what this does
            Pause(millidelay);

        }
        //prints out stats
        System.out.println("---------------------------");
        System.out.println(ConsoleColors.YELLOW +team1.getName()+ConsoleColors.RESET+" won "+team1.getGamesWon()+" times ");
        System.out.println(ConsoleColors.YELLOW +team1.getName()+ConsoleColors.RESET+" lost "+team1.getGamesLost()+" times ");
        System.out.println(ConsoleColors.BLUE +team2.getName()+ConsoleColors.RESET+" won "+team2.getGamesWon()+" times ");
        System.out.println(ConsoleColors.BLUE +team2.getName()+ConsoleColors.RESET+" lost "+team2.getGamesLost()+" times ");
        if(team1.getGamesWon() > team2.getGamesWon()){//determines who won
            System.out.println(ConsoleColors.YELLOW +team1.getName()+ConsoleColors.RESET+" Is the series Champion");
        }else{
            System.out.println(ConsoleColors.BLUE +team2.getName()+ConsoleColors.RESET+" Is the series Champion");
        }
    }
    public static void Pause(int miliseconds){
        try {
            Thread.sleep((miliseconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static int getCheatRuns(BaseballTeam team){
        int cheatruns = 0;
        if(team.getIscheater() == 1){
            Cheat cheat =  ((Cheater) team).CheatWithDetails();
            cheatruns = cheat.getBonusRuns();
            System.out.println(ConsoleColors.BLUE+team.getName()+ ConsoleColors.RESET+ConsoleColors.RED+" cheated with "+cheat.getCheatType()+" scoring an additional "+cheat.getBonusRuns()+" runs"+ConsoleColors.RESET);//results
            return cheatruns;
        }else{
            return cheatruns;
        }
    }
}
