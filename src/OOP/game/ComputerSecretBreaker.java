package OOP.game;

/**
 * Created by Юля on 01.04.2016.
 */
public class ComputerSecretBreaker implements SecretBreaker {
    private int leftLimit;
    private int rightLimit;

    public ComputerSecretBreaker(int leftLimit, int rightLimit) {
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    public int assumeNumber() {
        return (rightLimit - leftLimit) / 2;
    }

    public int assumeNumber(int secretNumberGreater) {
        if (secretNumberGreater > 0) {
            leftLimit = assumeNumber();
        } else {
            rightLimit = assumeNumber();
        }
        return assumeNumber();
    }
}

