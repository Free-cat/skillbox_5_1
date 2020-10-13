public class ReverseArray {

    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colorsWords = text.split(",?\\s+");

        colorsWords = reverseArray(colorsWords);

        for(String colorsWord : colorsWords){
            System.out.println(colorsWord);
        }
    }

    private static String[] reverseArray(String[] inArray){
        int inArrayLength = inArray.length;
        String[] outArray = new String[inArrayLength];
        for (int i = 0; i < inArrayLength; i++){
            outArray[i] = inArray[inArrayLength - 1 - i];
        }
        return outArray;
    }
}
