package OOP.game;

/**
 * Created by Юля on 01.04.2016.
 */
public class GameKeeper {
    public void startGame(SecretKeeper secretKeeper, SecretBreaker secretBreaker) {
        int assume = secretBreaker.assumeNumber();
        int result = secretKeeper.checkNumber(assume);

       while (result != 0){
           assume = secretBreaker.assumeNumber(result);
           result = secretKeeper.checkNumber(assume);
       }
        System.out.println("Congratulations! the number was: "+assume);
    }
}
