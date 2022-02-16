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
        int powerScore = 0;
        for (int i = 1; i <= correctCount; i++) {
            powerScore = powerScore + (5^i);
        }
        for (int i = 0; i < incorrectCount; i++) {
            powerScore -= 8;
        }
        if(powerScore < 0){
            powerScore = 0;
        }
        if (powerScore>500){
            powerScore = 500;
        }

        return powerScore;
    }
}
