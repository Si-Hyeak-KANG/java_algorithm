package test;

import static java.lang.Character.isDigit;

// 65~90
// a(65,97)e(69,101)i(73,105)o(79,111)u(85,117)
// 97~122
public class MyChar {

    char c;
    char[] vowel = {'A','E','I','O','U'};

    public MyChar(char c) {

        this.c = c;
    }


    /**
     * 모음 / 자음 체크
     * isVowel()
     */
    public boolean isVowel() {

        for(int i=0; i < vowel.length; i++) {

            if(this.c == vowel[i] || this.c == vowel[i] + 32) {
                return true;
            }
        }
        return false;
    }

    /**
     * 숫자인지 체크
     * isNumber()
     */
    public boolean isNumber() {

        for(int i = 48; i < 58; i++) {

            if(this.c == i) {
                return true;
            }
        }

        return false;
    }


    /**
     * 문자인지 체크
     * isAlphabet()
     */
    public boolean isAlphabet() {

        for(int i = 65; i<=90; i++) {

            if(this.c == i || c==i+32) {
                return true;
            }
        }

        return false;
    }
    /**
     * 대문자일 경우 소문자로 변경
     * printLowerCaseAlphabets()
     */
    public void printLowerCaseAlphabets() {

        boolean searched = false;

        for(char i = 65; i < 91; i++) {

            if (this.c == i) {
                System.out.println((char)(this.c + 32));
                searched = true;
                break;
            }
        }

        if(!searched)
            System.out.println("대문자가 아닙니다.");
    }

    /**
     * 소문자일 경우 대문자로 변경
     * printUpperCaseAlphabets()
     */
    public void printUpperCaseAlphabets() {

        boolean searched = false;

        for(char i = 97; i < 123; i++) {

            if (this.c == i) {
                System.out.println((char)(this.c - 32));
                searched = true;
                break;
            }
        }

        if(!searched)
            System.out.println("소문자가 아닙니다.");
    }

    public static void main(String[] args) {

        MyChar myChar = new MyChar('E');

        System.out.println(myChar.isVowel()); // true

        MyChar myChar2 = new MyChar('c');

        System.out.println(myChar2.isVowel()); // false

        System.out.println();

        MyChar myInt = new MyChar('1');

        System.out.println(myInt.isNumber()); //true
        System.out.println(myChar.isNumber()); //false
        System.out.println(myChar2.isNumber()); //false

        System.out.println();

        System.out.println(myChar.isAlphabet()); // true
        System.out.println(myChar2.isAlphabet()); // true
        System.out.println(myInt.isAlphabet()); // false


        System.out.println();

        myChar.printLowerCaseAlphabets(); // e
        myChar2.printLowerCaseAlphabets(); // 대문자가 아닙니다.

        System.out.println();

        myChar.printUpperCaseAlphabets(); // 소문자가 아닙니다.
        myChar2.printUpperCaseAlphabets(); // C




    }
}
