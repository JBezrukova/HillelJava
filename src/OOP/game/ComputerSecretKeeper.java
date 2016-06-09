package OOP.game;

/**
 * Created by Юля on 01.04.2016.
 */
public class ComputerSecretKeeper implements SecretKeeper{
    private int secretNumber;



    public ComputerSecretKeeper(int leftLimit, int rightLimit){
        secretNumber = rightLimit + (int)Math.random()*(rightLimit - leftLimit);
    }

    public int checkNumber(int probableNumber){
        return Integer.compare(secretNumber, probableNumber);
    }
}
