import java.io.BufferedReader;
import java.io.FileReader;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class solution0_1 {
    
    public static void main(String[] args) {

        try{
            BufferedReader in = new BufferedReader(new FileReader("input0_0.txt"));

            List<Integer> list = new ArrayList<Integer>();

            String line = null;
            int curCalories = 0;

            while((line = in.readLine()) != null) {
                if(line.isEmpty()) {
                    list.add(curCalories);
                    curCalories = 0;
                }
                else {
                    curCalories += Integer.parseInt(line);
                }
            }

            Collections.sort(list, Collections.reverseOrder());

            Iterator<Integer> it = list.iterator();
            int total = it.next() + it.next() + it.next();
            System.out.println(total);

            in.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
