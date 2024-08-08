public class Recursion {


    //QUESTION 1-SUM TRIANGLE FROM ARRAY
    //https://www.geeksforgeeks.org/sum-triangle-from-array/
    public  int[] sumTriangle(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        return sumTriangle(addArray(arr));
    }
    public  int[] addArray(int[] arr){
        int[] tempArray=new int[arr.length-1];
        for(int i=0;i<=arr.length-2;i++){
            tempArray[i]=arr[i]+arr[i+1];
        }
        return tempArray;

    }
    //QUESTION 2-MAXIMUM AND MINIMUM VALUE IN AN ARRAY
    //https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
    public int maxValueORminValue(int[] arr,int size){
        if(size<=1){
            return arr[0];
        }
        //change the below line Math.min function -> Math.max to get maximum value of an array
        return Math.min(arr[size],maxValueORminValue(arr,size-1));

    }
    //QUESTION 3-BINARY SEARCH
    //https://leetcode.com/problems/binary-search/description/
    public int binarySearch(int[] arr,int target,int start,int end){
        if(start<end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) return binarySearch(arr, target, start, mid - 1);
            return binarySearch(arr, target, mid + 1, end);
        }

        return -1;


    }
    //QUESTION  4-First Uppercase Letter in a String
    //https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
    public char firstUpperCase(String value){
        if(value.length()>=1){
            if(Character.isUpperCase(value.charAt(0))) return value.charAt(0);
            return firstUpperCase(value.substring(1));
        }

        return '-';
    }
    //QUESTION 5-REVERSE A STRING
    //https://leetcode.com/problems/reverse-string/description/
    public String reverseString(String value,int size){
        if(size<=0){
            return String.valueOf(value.charAt(0));
        }
        return String.valueOf(value.charAt(size))+reverseString(value,size-1);

    }
    //QUESTION 6-PRINT 1 TO N
    //https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
    public void printToNumber(int end){
        if(end < 1){
            return;
        }
        printToNumber(end-1);
        System.out.println(end);
    }
    //QUESTION 7-FIBONACCI SERIES
    //https://leetcode.com/problems/fibonacci-number/description/
    public int fiboNumber(int number){
        if(number==1||number==0){
            return number;
        }
        return fiboNumber(number-2)+fiboNumber(number-1);
    }
    //QUESTION 8-LENGTH OF A STRING
    //https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
    public int findLength(String value){
        if(value==""){
            return 0;
        }
        return  1+findLength(value.substring(1));

    }
    //QUESTION 9-GEEKONACI NUMBERS
    //https://www.geeksforgeeks.org/problems/geek-onacci-number/0
    public int geekoNaci(int number,int a,int b,int c){
        if(number==a||number==b||number==c){
            return number;
        }
        return geekoNaci(number-3,a,b,c)+geekoNaci(number-2,a,b,c)+geekoNaci(number-1,a,b,c);
    }
    //QUESTION 10-RECURSIVE BUBBLE SORT
    //https://www.geeksforgeeks.org/recursive-bubble-sort/
    public  void recurBubble(int [] arr,int n){
        if(n==0)return ;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        recurBubble(arr,n-1);

    }

    //HELPER FUNCTION FOR SWAPPING VARIABLES IN  A GIVEN ARRAY
    public static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    //QUESTION 11-RECURSIVE INSERTION SORT
    //https://www.geeksforgeeks.org/recursive-insertion-sort/
    public static void recurInsertion(int[] arr,int range){

        if(range==arr.length){
            return ;
        }

        for(int i=range;i>0;i--){
            if(arr[i]<arr[i-1]){
                swap(arr,i,i-1);
            }
        }
        recurInsertion(arr,range+1);
    }
    //QUESTION 12-RECURSIVE DIGITS ADD
    //https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
    public int recurDigitsAdd(int number){
        if(number==0){
            return 0;
        }

        return number%10 +recurDigitsAdd(number/10);
    }
    //QUESTION 13-RECURSION PRODUCT OF NUMBER
    //https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
    public  int recurProduct(int number1,int number2){
         if(number2==0){
             return 0;
         }
         int min= Math.min(number1,number2);
         int max=Math.max(number1,number2);
         return max+recurProduct(max,min-1);
    }
    //QUESTION 14-RECURSION CHECK PRIME
    //https://www.geeksforgeeks.org/recursive-program-prime-number/
    public boolean recurIsPrime(int number,int start){
        if(number==start) return true;
        if(number%start==0) return false;

        return recurIsPrime(number,start+1);

    }
    //QUESTION 15- RECURSION SUM OF NATURAL NUMBERS
    //https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
    public int recurSumNatural(int number){
        if(number<=1){
            return 1;
        }
        return number+recurSumNatural(number-1);
    }
    //QUESTION 16-POWER OF TWO
    //https://leetcode.com/problems/power-of-two/submissions/1346744592/

    public boolean recurPowerofTwo(int number){
        if(number==0)return false;
        if(number==1)return true;

        return number%2==0 && recurPowerofTwo(number/2);

    }
    //QUESTION 17-POWER OF THREE
    //https://leetcode.com/problems/power-of-three/description/
    public boolean recurPowerofThree(int number){
        if(number==0)return false;
        if(number==1)return true;

        return number%3==0 && recurPowerofThree(number/3);

    }
    //QUESTION 18-POWER OF FOUR
    //https://leetcode.com/problems/power-of-four/description/
    public boolean recurPowerofFour(int number){
        if(number==0)return false;
        if(number==1)return true;

        return number%4==0 && recurPowerofFour(number/4);

    }
    //QUESTION 19-FACTORIAL OF A GIVEN NUMBER
    //https://www.hackerrank.com/challenges/30-recursion/problem
    public int recurFactorial(int number){
        if(number<=1){
            return number;
        }
        return number*recurFactorial(number-1);
    }
    //QUESTION 20-CHECK ARRAY IS SORTED
    //https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
    public boolean recurArrayisSorted(int[] array,int index){
        if(index<=1)return true;
        if(array[index]<array[index-1]) return false;
        return  recurArrayisSorted(array,index-1);
    }
    //QUESTION 21-NUMBER OF STEPS TO REDUCE A GIVEN NUMBER TO ZERO
    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
    public int recurStepstoZero(int number){
        if(number<=0) return 0;
        if(number%2==0){
            number=number/2;
        }
        else{
            number-=1;
        }
        return recurStepstoZero(number)+1;
    }
    //QUESTION 22-CHECK BALANCED PARENTHESIS
    //https://www.geeksforgeeks.org/check-for-balanced-parenthesis-without-using-stack/
    public boolean recurBalanceParanthe(String value,int index,int balance){
        if(balance<0)return false;
        if(index==value.length()){
            if(balance==0){
                return true;
            }
            return  false;
        }


        if(value.charAt(index)=='[' ||value.charAt(index)=='('||value.charAt(index)=='{'){
            return recurBalanceParanthe(value,index+1,balance+1);
        }
        else if(value.charAt(index)=='}' ||value.charAt(index)==']'||value.charAt(index)==')'){
            return recurBalanceParanthe(value,index+1,balance-1);
        }
        else{
            return recurBalanceParanthe(value,index+1,balance);
        }

    }
    //QUESTION 23-> REMOVE ALL CONSECUTIVE DUPLICATES FROM A STRING
    //https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
    public String recurConsecDuplicates(String value,int index,int pointer){
        if(value.length()==index){
            return String.valueOf(value.charAt(pointer));
        }
        if(value.charAt(pointer)==value.charAt(index)){
            return recurConsecDuplicates(value,index+1,pointer);
        }
        else{
            return value.charAt(pointer)+recurConsecDuplicates(value,index+1,index);
        }

    }

    


}
