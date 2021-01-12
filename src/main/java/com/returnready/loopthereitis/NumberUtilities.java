package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
     StringBuilder resultingStringBuilder = new StringBuilder();
     for(int i = start;i<=stop;i++){
         if(i%2==0){
             resultingStringBuilder.append(String.valueOf(i));
         }
     }
        return resultingStringBuilder.toString();
    }


    public static String getOddNumbers(int start, int stop) {
      String oddNumbers = "";
      for (int i = start; i < stop; i++) {
          if(i % 2 != 0){
              oddNumbers = oddNumbers + i;
          }
      }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for(int i= start; i < stop; i += step) {
            squareNumbers += i *i;
        };
        return squareNumbers;
    }

    public static String getRange(int start) {
        String left = "";
        for(int i = 0; i < start; i++){
            left = left + i;
        }

        // i = 0: a = 0
        // i = 1: a = 01
        // i = 2: a = 012
        // i = 3: a = 0123
        // i = 4: a = 01234
        // i = 5: a = 012345
        // i = 6: a = 0123456
        // i = 7: a = 01234567
        // i = 8: a = 012345678
        // i = 9: a = 0123456789

        return left;

    }

    public static String getRange(int start, int stop) {
        String l = "";
        for(int i = start; i<stop;i++){
          l = l + i;
        }

        return l;
    }


    public static String getRange(int start, int stop, int step) {
       String j = "";
       for(int i = start;i<stop;i+=step){
           j = j + i;
       }
        return j;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String l = "";
        for(int i = start; i<stop;i+=step) {
            l = l + (int)Math.pow(i,exponent);
        }
        return l;
    }
}
