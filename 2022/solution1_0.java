import java.io.BufferedReader;
import java.io.FileReader;

public class solution1_0 {
    
    public static void main(String[] args) {

        int[][] strategyMatrix = new int[3][3];

        int charOffsetA = (int)'A';
        int charOffsetX = (int)'X';

        strategyMatrix[0][0] = 4;
        strategyMatrix[0][1] = 8;
        strategyMatrix[0][2] = 3;

        strategyMatrix[1][0] = 1;
        strategyMatrix[1][1] = 5;
        strategyMatrix[1][2] = 9;

        strategyMatrix[2][0] = 7;
        strategyMatrix[2][1] = 2;
        strategyMatrix[2][2] = 6;

        try{
            BufferedReader in = new BufferedReader(new FileReader("input1_0.txt"));

            int score = 0;
            String line = null;
            while((line = in.readLine()) != null) {
                score += strategyMatrix[line.charAt(0) - charOffsetA][line.charAt(2) - charOffsetX];
            }
            in.close();
            
            System.out.println(score);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

}
