import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Recursion recurobj=new Recursion();
        /* QUESTION-1 TEST CASE |
        Input : A = {1, 2, 3, 4, 5}
        Output : [48]
        */
        System.out.println(Arrays.toString(recurobj.sumTriangle(new int[]{1, 2, 3, 4, 5})));
        //-------------------------------------------------------------------------------------//
        /* QUESTION-2 MAXIMUM AND MINIMUM VALUE IN AN ARRAY |
        Input : A = {1, 2, 3, 4, 5}
        MIN->Output : [1]
        MAX->Output : [5]
        */
        System.out.println(recurobj.maxValueORminValue(new int[]{1, 2, 3, 4, 5},4));
        //-------------------------------------------------------------------------------------//
        /* QUESTION-3 BINARY SEARCH  |
        Input : A = {1, 2, 3, 4, 5}
        TARGET: 3
        OUTPUT-> INDEX OF THE TARGET IS [2] IF NOT PRESENT [-1];
        */
        System.out.println(recurobj.binarySearch(new int[]{1, 2, 3, 4, 5},4,0,4));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-4  FIRST UPPERCASE LETTER IN A STRING |
        INPUT->gokuL
        OUTPUT->L
        IF THERE IS NO UPPERCASE CHARACTER THEN THE PROGRAM WILL RETURN "-"
         */
        System.out.println(recurobj.firstUpperCase(new String("goKul")));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-5 REVERSE STRING |
        INPUT-> "GRIND HARD"
        OUTPUT->"DRAH DNIGR"
         */
        System.out.println(recurobj.reverseString(new String("GRIND HARD"),9));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-6 PRINT 1 TO N
        INPUT -> 10
        OUTPUT -> 1,2,3,4,5,6,7,8,9,10
         */
        recurobj.printToNumber(10);
        //-------------------------------------------------------------------------------------//
        /*QUESTION-7 FIBONACCI NUMBER |
        INPUT-5
        OUTPUT-5TH FIBONACCI NUMBER IN SERIES ->5 | 0,1,1,2,3,5,8,13 |0 Based index
        */
        System.out.println(recurobj.fiboNumber(3));
        //-------------------------------------------------------------------------------------//
        /* QUESTION-8 LENGTH OF A STRING |
        INPUT -"GOKUL"
        OUTPUT-5
        */
        System.out.println(recurobj.findLength(new String("GOKUL")));
        //-------------------------------------------------------------------------------------//
        /* QUESTION-9 GEEKONACI NUMBER |
        INPUT-1 3 2 5
        OUTPUT-11
        */
        System.out.println(recurobj.geekoNaci(5,1,3,2));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-10 RECURSIVE BUBBLE |
        INPUT-1 5 4 3 2
        OUTPUT-1 2 3 4 5
         */
        int[] arr={1,2,3,4,5};
        recurobj.recurBubble(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-11 RECURSIVE INSERTION SORT
        INPUT-1 5 4 3 2
        OUTPUT-1 2 3 4 5
        */
        int[] arr1={1,5,4,3,2};
        recurobj.recurInsertion(arr1,0);
        System.out.println(Arrays.toString(arr1));
        //-------------------------------------------------------------------------------------//
        /* QUESTION-12 SUM OF DIGITS OF A NUMBER
        INPUT-123
        OUTPUT-6
        */
        System.out.println(recurobj.recurDigitsAdd(123));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-13 PRODUCT OF TWO NUMBER
        INPUT A->5,B->10
        OUTPUT ->50;
        */
        System.out.println(recurobj.recurProduct(5,10));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-14 CHECK NUMBER IS PRIME OR NOT PRIME
        INPUT ->5
        OUTPUT ->TRUE
         */
        System.out.println(recurobj.recurIsPrime(5,2));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-15 SUM OF NATURAL NUMBERS
        INPUT->10
        OUTPUT->55
         */
        System.out.println(recurobj.recurSumNatural(10));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-16 POWER OF TWO
        INPUT-> 16
        OUTPUT -> TRUE
        */
        System.out.println(recurobj.recurPowerofTwo(16));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-17 POWER OF THREE
        INPUT-> 27
        OUTPUT -> TRUE
        */
        System.out.println(recurobj.recurPowerofThree(27));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-18 POWER OF FOUR
        INPUT-> 16
        OUTPUT -> TRUE
        */
        System.out.println(recurobj.recurPowerofFour(16));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-19 FACTORIAL OF A NUMBER
        INPUT -> 5
        OUTPUT -> 5*4*3*2*1=121
        */
        System.out.println(recurobj.recurFactorial(5));
        //-------------------------------------------------------------------------------------//
        /* QUESTION-20 CHECK ARRAY IS SORTED
        INPUT-> INT[] ARR={1,2,3,4,5};
        OUTPUT-> TRUE
        */
        System.out.println(recurobj.recurArrayisSorted(new int[]{100,101,102,103,104},4));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-21 NO OF STEPS TO REDUCE TO ZERO
        INPUT->14
        OUTPUT->6
        */
        System.out.println(recurobj.recurStepstoZero(14));
        //-------------------------------------------------------------------------------------//
        /*QUESTION-22 BALANCED PARANTHESIS
        INPUT->“[()]{}{[()()]()}”
        OUTPUT->TRUE
        */
        System.out.println(recurobj.recurBalanceParanthe("{[()]{}{[()()]()}}",0,0));
        /*QUESTION-23 CONSECUTIVE DUPLICATE CHARACTERS FROM STRING
        INPUT-> "GOOOOKULLL"
        OUTPUT->"GOKUL"
         */
        System.out.println(recurobj.recurConsecDuplicates("GOOOOKULLL",1,0));



























    }
}