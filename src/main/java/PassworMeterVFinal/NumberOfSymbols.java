package PassworMeterVFinal;

public class NumberOfSymbols {
    private int numOfSymbols;
    private int bonus;
    private int passwordLength;
    private int multiplierLength = 6;

    public NumberOfSymbols(String password) {
        passwordLength = password.length();
        String[] arrPwd = password.replaceAll("\\s+", "").split("\\s*");
        for (String s : arrPwd) {
            if (s.matches("[^a-zA-Z0-9_]")) {
                numOfSymbols++;
            }
        }
    }

    public int calculateBonus() {
        if (numOfSymbols > 0){
            bonus = numOfSymbols * multiplierLength;
        }
        return bonus;
    }


    public int calculateOccurrence(){
        return numOfSymbols;
    }

}
