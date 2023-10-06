public class BaseballTeam {
    private int ischeater = 0;

    public int getIscheater() {
        return ischeater;
    }

    private String name;
    private int gamesWon =0;
    private int gamesLost =0;
    private String color;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public BaseballTeam(String name,  String color) {
        this.name = name;

        this.color = color;
    }
    public void winGame(){
        this.gamesWon += 1;
    }
    public void loseGame(){
        this.gamesLost += 1;
    }
}
