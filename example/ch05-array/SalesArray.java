public class SalesArray {
    public static void main(String[] args) {
        int[][] companySales = {
            {90, 90, 110, 110},
            {120, 110, 110, 90},
            {200, 210, 200, 220}
        };

        int sum = 0;
        int totalLength = 0;
        for(int rowIndex = 0 ; rowIndex < companySales.length ; rowIndex ++){
            for (int columnIndedx = 0 ; columnIndedx < companySales[rowIndex].length ; columnIndedx ++){
                sum += companySales[rowIndex][columnIndedx];
                totalLength++;
            }
        }
        double avg = (double)sum / (double)totalLength;
        
//        int totalLenght = companySales.length * companySales[0].length;
    }
}
