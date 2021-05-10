package PassworMeterVFinal;

public class NumberOfLettersOnly {
    private int numOfLetterOnly;
    private int bonus;
    private int numLowerCase,numUpperCase,numSymbol, numNum;

    public NumberOfLettersOnly(String password){
        numLowerCase= new NumberOfLowerCaseLetters(password).calculateOccurrence();
        numUpperCase = new NumberOfUppercaseLetters(password).calculateOccurrence();
        numNum = new NumberOfNumbers(password).calculateOccurrence();
        numSymbol = new NumberOfSymbols(password).calculateOccurrence();
        if((numLowerCase>0 || numUpperCase>0 )&& numSymbol==0 && numNum ==0){
            numOfLetterOnly = password.length();
           bonus = password.length()*-1;
        }

    }
    public int calculateBonus() {

        return bonus;
    }


    public int calculateOccurrence() {
        return numOfLetterOnly;
    }
}
