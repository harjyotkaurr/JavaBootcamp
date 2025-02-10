//QUESTION 1:
// Write a Java method that takes a character input parameter and determines whether it's a vowel (a, e, i, o, u) or a consonant using a switch statement.

public class QuestionOne {
    public void checkVowel(char ch){
        ch=Character.toLowerCase(ch);

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
                default:
                    if(Character.isLetter(ch)){
                        System.out.println(ch + " is a consonant");
                    }
                    else{
                        System.out.println(ch + " is not an alphabet");
                    }
                    break;
        }
    }
}
