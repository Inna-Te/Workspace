package homework7;

public class Main7 {
    public static void main(String[] args) {

            Game game = new Game();
            game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER, "11");
            game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY, "6");
            game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY, "15");


    }
}
