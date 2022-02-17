package hangman.model;

public class OriginalScore implements GameScore{

    /**
     *
     * @param correctCount
     * @param incorrectCount
     * @return score of Original Score
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount)  {
        int originalScore=100;
        int penalty = incorrectCount * 10;
        originalScore -= penalty;

        if(originalScore < 0){
            originalScore = 0;
        }


        return originalScore;
    }

    @Override
    public int getInitialScore() {
        return 100;
    }
}
