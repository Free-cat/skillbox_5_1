public class DrawXInAnAbsurdWay {

    public static void main(String[] args) {
        char[][] table = new char[][]{
                "x     x\n".toCharArray(),
                " x   x\n".toCharArray(),
                "  x x\n".toCharArray(),
                "   x\n".toCharArray(),
                "  x x\n".toCharArray(),
                " x   x\n".toCharArray(),
                "x     x\n".toCharArray()
        };

        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.print(table[i][j]);
            }
        }
    }
}
