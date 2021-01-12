package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String returnedTable= "";
        int rowSize = 5;
        int columnSize = 5;
        for( int i = 1; i <= columnSize;i++){
            int result;
            for(int j = 1; j <= rowSize; j++){
                result = i * j;
                returnedTable += " ";
                if (result <10){
                    returnedTable +=" ";
                }
                returnedTable += result;
                returnedTable += " |";
            }
            returnedTable += "\n";

        } return returnedTable;

    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
