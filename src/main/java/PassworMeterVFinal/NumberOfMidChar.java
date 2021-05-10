package PassworMeterVFinal;

public class NumberOfMidChar {
    private int numOfMidChar;
    private int bonus;
    private int passwordLength;
    private int multiplierLength = 2;


    public NumberOfMidChar(String password) {
        String[] arrPwd = password.replaceAll("\\s+", "").split("\\s*");

        for (int i = 0; i < arrPwd.length; i++) {

            if ((arrPwd[i].matches("[0-9]")) || (arrPwd[i].matches("[^a-zA-Z0-9_]"))) {
                if (i > 0 && i < arrPwd.length - 1) {
                    numOfMidChar++;
                }
            }
        }

    }

    public int calculateBonus() {
        if (numOfMidChar > 0) {
            bonus = numOfMidChar * multiplierLength;
        }
        return bonus;
    }


    public int calculateOccurrence() {
        return numOfMidChar;
    }
}
