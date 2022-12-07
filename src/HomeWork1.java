import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class HomeWork1 {
    public static void main(String[] args) {

        int max = 1000;

        int divisor = 7;
          //int resultIndex=0;
        int limit=0;
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        for (int i = 1; i <=max; i++) {
            if (i % divisor == 0) {
                myArr.add(i);
               //resultIndex++;
            limit= myArr.size();

              }

        }

        int max1=myArr.get(limit-1)+2;
        int max2=myArr.get(limit-2)+2;
        int max3=myArr.get(limit-3)+2;

        String max1Result = Integer.toString(max1);
        String max2Result=Integer.toString(max2);
        String max3Result=Integer.toString(max3);
        String max1Result1= "I am " +max1Result;
        String max2Result2="I am "+max2Result;
        String max3Result3="I am "+max3Result;
        ArrayList<String> maxArr = new ArrayList<String>();
        maxArr.add(max1Result1);
        maxArr.add(max2Result2);
        maxArr.add(max3Result3);


        System.out.println(maxArr);

    }

}


