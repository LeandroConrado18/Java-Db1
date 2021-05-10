package PassworMeterVFinal;

public class NumberOfCharacters {
    private int numOfCharacters;
    private int bonus;
    private int  multiplierLength = 4;

    public NumberOfCharacters(String password) {
        numOfCharacters = password.length();
    }
    public int calculateBonus(){
        bonus = numOfCharacters * multiplierLength;
        return bonus;
    }
    public int calculateNumberOfCharacters(){
        return numOfCharacters;
    }
}
