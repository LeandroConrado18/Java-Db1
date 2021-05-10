package PassworMeterVFinal;

public class NumberOfUppercaseLetters {
    private int numOfUpperCaseLetters;
    private int bonus;
    private int passwordLength;
    private int multiplierLength = 2;

    public NumberOfUppercaseLetters(String password) {
        passwordLength = password.length();

        String[] arrPwd = password.replaceAll("\\s+", "").split("\\s*");
        for (String s : arrPwd) {
            if (s.matches("[A-Z]")) {
                numOfUpperCaseLetters++;
            }

        }

    }

    public int calculateBonus() {
        if (numOfUpperCaseLetters > 0 && numOfUpperCaseLetters < passwordLength) {
            bonus = (passwordLength - numOfUpperCaseLetters) * multiplierLength;

        }
        return bonus;
    }

    public int calculateOccurrence() {
        return numOfUpperCaseLetters;
    }
}