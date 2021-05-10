package PassworMeterVFinal;

public class NumberOfRepeatCharacters {

    private int numOfRepeatChar;
    private double incrementBonus;
    private int bonus;



    public NumberOfRepeatCharacters(String password){

        String[] arrPwd = password.replaceAll("\\s+", "").split("\\s*");

        for (int i = 0; i < arrPwd.length; i++) {
            var bCharExists = false;
            for (int j = 0; j < arrPwd.length; j++) {
                if (arrPwd[i].equals(arrPwd[j]) && i != j) {
                    bCharExists = true;
                    incrementBonus += Math.abs(arrPwd.length / (j - i));
                }
            }
            if (bCharExists) {
                numOfRepeatChar++;
                int countUniqueCharacters = arrPwd.length - numOfRepeatChar;
                incrementBonus = countUniqueCharacters != 0 ?
                        Math.ceil(incrementBonus/ countUniqueCharacters) :
                        Math.ceil(incrementBonus);
            }
        }



    }
    public int calculateBonus() {
        if (numOfRepeatChar > 0) {
            bonus = (int) incrementBonus *-1;
        }
        return bonus;
    }


    public int calculateOccurrence() {
       return numOfRepeatChar;
    }
}
