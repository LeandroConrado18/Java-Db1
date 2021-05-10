package PassworMeterVFinal;


public class Score {
    private int score;
    private int[] bonus;

    public Score(int[] allBonus) {

        bonus = allBonus;

    }

    public int calculateScore() {
        for(int individualBonus : bonus) {
            score += individualBonus;
        }
        return score;
    }
}