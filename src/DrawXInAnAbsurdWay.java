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

        for (char[] rows : table) {
            for (char cells : rows) {
                System.out.print(cells);
            }
        }
    }
}
