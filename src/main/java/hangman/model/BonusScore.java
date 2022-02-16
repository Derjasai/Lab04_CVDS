package hangman.model;

public class BonusScore implements GameScore{
    /**
     * @pre The game begins with 0 points
     * @pos bonus with 10 points for each correct word
     * penalize with 5 points for each incorrct word
     * @param correctCount counter of correct points
     * @param incorrectCount counter of incorrect points
     * @return score of BonusScore
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
