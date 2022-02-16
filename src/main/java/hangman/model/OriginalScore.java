package hangman.model;

public class OriginalScore implements GameScore{
    /**
     *
     * @param correctCount
     * @param incorrectCount
     * @return score of Original Score
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
