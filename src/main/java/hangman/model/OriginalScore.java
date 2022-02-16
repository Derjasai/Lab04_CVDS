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
        int originalScore=100;
        for (int i=0;i<incorrectCount;i++) {
            originalScore -= 10;
        }
        if(originalScore < 0){
            originalScore = 0;
        }

        return originalScore;
    }
}
