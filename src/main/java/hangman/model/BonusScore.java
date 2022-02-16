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
        int bonusScore = 0;
        for (int i = 0; i < correctCount; i++) {
            bonusScore += 10;
        }
        for (int i = 0; i < incorrectCount; i++) {
            bonusScore -= 5;
        }
        if (bonusScore < 0){
            bonusScore = 0;
        }
        return bonusScore;
    }
}
