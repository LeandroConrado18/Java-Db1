package PassworMeterVFinal;

public class PasswordMeterV2 {


    public static void main(String[] args) {
        String password = "Leeeeeeeeeeandro12@";
        String sComplexity;



        int score;
        int bonusNumberOfCharacters, countNumberOfCharacters;
        int bonusUpperCaseLetters, countUpperCaseLetters;
        int bonusLowerCaseLetters, countLowerCaseLetters;
        int bonusNumber, countNumber;
        int bonusSymbol, countSymbol;
        int bonusMidChar, countMidChar;
        int bonusRequirements, countRequirements;

        int bonusLetterOnly, countLetterOnly;
        int bonusNumbersOnly,countNumbersOnly;
        int countRepChar, bonusRepChar;
        int countConsecutiveAlphaUC, bonusConsecutiveAlphaUC;
        int countConsecutiveAlphaLC, bonusConsecutiveAlphaLC;
        int countConsecutiveNumber, bonusConsecutiveNumber;
        int countSeqAlpha, bonusSeqAlpha;
        int countSeqNumber, bonusSeqNumber;
        int countSeqSymbol, bonusSeqSymbol;


        // passing all bonus values
        // additions first

        bonusNumberOfCharacters = new NumberOfCharacters(password).calculateBonus();
        bonusLowerCaseLetters = new NumberOfLowerCaseLetters(password).calculateBonus();
        bonusUpperCaseLetters = new NumberOfUppercaseLetters(password).calculateBonus();
        bonusNumber = new NumberOfNumbers(password).calculateBonus();
        bonusSymbol = new NumberOfSymbols(password).calculateBonus();
        bonusMidChar = new NumberOfMidChar(password).calculateBonus();
        bonusRepChar = new NumberOfRepeatCharacters(password).calculateBonus();

        // deductions
        bonusNumbersOnly = new NumbersOfNumbersOnly(password).calculateBonus();
        bonusLetterOnly = new NumberOfLettersOnly(password).calculateBonus();





        //pass this string with all bonus value
        int[] allBonus = new int[]{bonusNumberOfCharacters, bonusLowerCaseLetters, bonusUpperCaseLetters,
                bonusNumber,bonusSymbol,bonusMidChar, bonusNumbersOnly, bonusLetterOnly,bonusRepChar };

        for(int i=0;i<9;i++){
            System.out.println(allBonus[i]);
        }

        score = new Score(allBonus).calculateScore();
        System.out.println(score);


        // passing all counts
        countNumberOfCharacters = new NumberOfCharacters(password).calculateNumberOfCharacters();
        countLowerCaseLetters = new NumberOfLowerCaseLetters(password).calculateOccurrence();
        countUpperCaseLetters = new NumberOfUppercaseLetters(password).calculateOccurrence();
        countNumber = new NumberOfNumbers(password).calculateOccurrence();
        countSymbol = new NumberOfSymbols(password).calculateOccurrence();
        countMidChar = new NumberOfMidChar(password).calculateOccurrence();
        countNumbersOnly = new NumbersOfNumbersOnly(password).calculateOccurrence();
        countLetterOnly = new NumberOfLettersOnly(password).calculateOccurrence();
        countRepChar = new NumberOfRepeatCharacters(password).calculateOccurrence();

    }




    /*
    }

    @Override
    public String toString() {
        return "Password: " + password
                + "\nScore: " + score + ""
                + "\nComplexity: " + sComplexity

                + "\nAddictions"
                + "\n[C: " + countLength + " | B: " + bonusLength + "] Number of Characters"
                + "\n[C: " + countAlphaUpperCase + " | B: " + bonusAlphaUpperCase + "] Uppercase Letters"
                + "\n[C: " + countAlphaLowerCase + " | B: " + bonusAlphaLowerCase + "] Lowercase Letters"
                + "\n[C: " + countNumber + " | B: " + bonusNumber + "] Numbers"
                + "\n[C: " + countSymbol + " | B: " + bonusSymbol + "] Symbols"
                + "\n[C: " + countMidChar + " | B: " + bonusMidChar + "] Middle Numbers or Symbols"
                + "\n[C: " + countRequirements + " | B: " + bonusRequirements + "] Requirements"

                + "\nDeductions"
                + "\n[C: " + countAlphasOnly + " | B: " + bonusAlphasOnly + "] Letters Only"
                + "\n[C: " + countNumbersOnly + " | B: " + bonusNumbersOnly + "] Numbers Only"
                + "\n[C: " + countRepChar + " | B: " + bonusRepChar + "] Repeat Characters (Case Insensitive)"
                + "\n[C: " + countConsecutiveAlphaUC + " | B: " + bonusConsecutiveAlphaUC + "] Consecutive Uppercase Letters"
                + "\n[C: " + countConsecutiveAlphaLC + " | B: " + bonusConsecutiveAlphaLC + "] Consecutive Lowercase Letters"
                + "\n[C: " + countConsecutiveNumber + " | B: " + bonusConsecutiveNumber + "] Consecutive Numbers"
                + "\n[C: " + countSeqAlpha + " | B: " + bonusSeqAlpha + "] Sequential Letters"
                + "\n[C: " + countSeqNumber + " | B: " + bonusSeqNumber + "] Sequential Numbers"
                + "\n[C: " + countSeqSymbol + " | B: " + bonusSeqSymbol + "] Sequential Symbols";
                }
     */

}