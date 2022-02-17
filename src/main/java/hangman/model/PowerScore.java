package hangman.model;


public class PowerScore implements GameScore{
    /**
     *
     * @param correctCount counter of correct points
     * @param incorrectCount counter of incorrect points
     * @return score of PowerScore
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int powerScore = 0;


        for (int i = 1; i <= correctCount; i++) {
            powerScore = (int) (powerScore + Math.pow(5,i));
        }
        int penalty = incorrectCount * 8;
        powerScore -= penalty;
        if(powerScore < 0){
            powerScore = 0;
        }
        if (powerScore>500){
            powerScore = 500;
        }

        return powerScore;
    }

    @Override
    public int getInitialScore() {
        return 100;
    }
}
