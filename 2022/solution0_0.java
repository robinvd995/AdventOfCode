import java.io.BufferedReader;
import java.io.FileReader;

class Solution0_0 {

    public static void main(String[] args) {

        try{
            BufferedReader in = new BufferedReader(new FileReader("input0_0.txt"));

            int index = 0, maxIndex = 0;
            int curCalories = 0, maxCalories = 0;
            String line = null;

            while((line = in.readLine()) != null) {
                if(line.isEmpty()) {
                    if(curCalories > maxCalories) { maxCalories = curCalories; maxIndex = index; }

                    curCalories = 0;
                    index++;
                }
                else {
                    // not my fault if input is wrong :)
                    curCalories += Integer.parseInt(line);
                }
            }

            System.out.println("Index: " + maxIndex + ", Calories: " + maxCalories);

            in.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
    }

}

