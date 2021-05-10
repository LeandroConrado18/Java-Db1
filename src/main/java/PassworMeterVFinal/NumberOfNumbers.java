package PassworMeterVFinal;

public class NumberOfNumbers {
    private int numOfNumbers;
    private int bonus;
    private int passwordLength;
    private int multiplierLength = 4;


    public NumberOfNumbers(String password){
        passwordLength = password.length();

        String[] arrPwd = password.replaceAll("\\s+", "").split("\\s*");
        for (String s : arrPwd) {
            if (s.matches("[0-9]")) {
                numOfNumbers++;
            }
        }
    }
    public int calculateBonus() {
        if (numOfNumbers > 0 && numOfNumbers < passwordLength ){
            bonus = numOfNumbers * multiplierLength;

        }
        return bonus;
    }

    public int calculateOccurrence(){
        return numOfNumbers;

    }





}
