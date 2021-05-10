package PassworMeterVFinal;

public class NumbersOfNumbersOnly {
    private int numOfNumOnly;
    private int bonus;
    private int passwordLength;
    private int numLowerCase,numUpperCase,numNum, numSymbol ;


    public NumbersOfNumbersOnly(String password){
        numLowerCase= new NumberOfLowerCaseLetters(password).calculateOccurrence();
        numUpperCase = new NumberOfUppercaseLetters(password).calculateOccurrence();
        numNum = new NumberOfNumbers(password).calculateOccurrence();
        numSymbol = new NumberOfSymbols(password).calculateOccurrence();
        if(numLowerCase==0 && numUpperCase==0 && numSymbol==0){
            numOfNumOnly = numNum;
            bonus = numNum*-1;
        }

    }
    public int calculateBonus() {
        return bonus;
    }


    public int calculateOccurrence() {
        return numNum;
    }
}

