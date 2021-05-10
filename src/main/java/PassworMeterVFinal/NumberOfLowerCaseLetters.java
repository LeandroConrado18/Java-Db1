package PassworMeterVFinal;

public class NumberOfLowerCaseLetters {
    private int numOfLowerCaseLetters;
    private int bonus;
    private int passwordLength;
    private int multiplierLength = 2;

    public NumberOfLowerCaseLetters(String password) {
        passwordLength = password.length();

        String[] arrPwd = password.replaceAll("\\s+", "").split("\\s*");
        for (String s : arrPwd) {
            if (s.matches("[a-z]")) {
                numOfLowerCaseLetters++;
            }

        }
    }

    public int calculateBonus() {
        if (numOfLowerCaseLetters > 0 && numOfLowerCaseLetters < passwordLength ){
            bonus = (passwordLength-numOfLowerCaseLetters)*multiplierLength;

        }
        return bonus;
    }

    public int calculateOccurrence(){
        return numOfLowerCaseLetters;

    }

}