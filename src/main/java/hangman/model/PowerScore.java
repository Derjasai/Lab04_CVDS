package hangman.model;

public class PowerScore implements GameScore{
    /**
     *
     * @param correctCount counter of correct points
     * @param incorrectCount counter of incorrect points
     * @return score of PowerScore
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
