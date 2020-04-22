import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {

    public static String compareStrings(String firstString, String secondString, String   thirdString) {

       /* if(arr.length <=0){
            return;
        }*/


      /* StringBuilder sb = new StringBuilder();
        if(firstString.length() == secondString.length())
        {
            sb.append(firstString);
            sb.append(secondString);
        }
        else
        {
            return false;
        }*/

        StringBuilder sb = new StringBuilder();
        String[] array = new String[] {firstString, secondString, thirdString};

        Arrays.sort(array);
        for(String i: array){
            sb.append(i);
        }
       //return null;

       return sb.toString();
    }

    public static void main(String args[]){

        //String[] ar= {"one", "two", "three", "ate", "nat", "bat"};
        compareStrings("one","two", "three");

        // for()


    }
}
