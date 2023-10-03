
import java.util.Random;
public class WorldSeries {
    public static Random rand = new Random();
    public static int gameswon1 = 0;
    public static int gameswon2 = 0;
    public static final int games = 4;
    public static final int millidelay = 500;
    public static void main(String[] args) {
        System.out.println("Jacoooooooooooooooooob Wisniewski");
        BaseballTeam Pirates = new BaseballTeam("Pirates",0,0);//makes the teams
        BaseballTeam Astros = new BaseballTeam("Astros",0,0);
        simulateSeries(Pirates, Astros);
    }
    public  static void simulateGame(BaseballTeam team1, BaseballTeam team2){
        int windecision = (rand.nextInt(2)+1);//acts as a random bool either 1 or 2
        if(windecision == 1){
            //team one wins
            team1.winGame();
            team2.loseGame();
            System.out.println(team1.getName() +" Wins " + team2.getName() + " Loses");//results
            System.out.println(team1.getName()+" has won " +team1.getGamesWon()+" times");
            System.out.println(team2.getName()+" has won " +team2.getGamesWon()+" times");
            gameswon1 +=1;


        }else{//team two wins
            team1.loseGame();
            team2.winGame();
            System.out.println(team2.getName() +" Wins " + team1.getName() + " Loses");//results
            System.out.println(team1.getName()+" has won " +team1.getGamesWon()+" times");
            System.out.println(team2.getName()+" has won " +team2.getGamesWon()+" times");
            gameswon2 +=1;

        }

    }
    public static void simulateSeries(BaseballTeam team1, BaseballTeam team2){

        while(gameswon1 < games && gameswon2 < games){//waits till someone wins four times
            simulateGame(team1, team2);//you already know what this does
            Pause(millidelay);

        }
        //prints out stats
        System.out.println("---------------------------");
        System.out.println(team1.getName()+" won "+team1.getGamesWon()+" times ");
        System.out.println(team1.getName()+" lost "+team1.getGamesLost()+" times ");
        System.out.println(team2.getName()+" won "+team2.getGamesWon()+" times ");
        System.out.println(team2.getName()+" lost "+team2.getGamesLost()+" times ");
        if(team1.getGamesWon() > team2.getGamesWon()){//determines who won
            System.out.println(team1.getName()+" Is the series Champion");
        }else{
            System.out.println(team2.getName()+" Is the series Champion");
        }
    }
    public static void Pause(int miliseconds){
        try {
            Thread.sleep((miliseconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
