package OOP.game;

/**
 * Created by Юля on 01.04.2016.
 */
public class Game {

    public static void main(String[] args) {
        ComputerSecretBreaker computerSecretBreaker = new ComputerSecretBreaker(0,100);
        ComputerSecretKeeper computerSecretKeeper = new ComputerSecretKeeper(0,100);
        GameKeeper gameKeeper = new GameKeeper();
        gameKeeper.startGame(computerSecretKeeper, computerSecretBreaker);
    }
}
