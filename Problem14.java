public class Problem14 {

    public static String stringShift(String s, int[][] shift) {

        int val =0; //Effective Rotation
        for(int i=0;i<shift.length; i++){
            val+= shift[i][0] ==0 ?-shift[i][1]:shift[i][1];
        }
        int len= s.length();
        val%=len;

        String result = "";
       /* result= val>0 ?s.substring((len-val),val) + s.substring(0,(len-val)) //Right Rotation
                : s.substring(-val,(len+val))+s.substring(0,-val); //Left Rotation*/

        if(val>0) {
            result= s.substring(s.length() - val) + s.substring(0, s.length() - val); //Right Rotation
            }else {
            result=  s.substring(-val) + s.substring(0, -val); //Left Rotation
        }
        return result;
    }




    public static void main(String args[]){


        int ar[][]= {{0, 1},{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}};
        //int ar[][]= {{0, 1},{1, 2}};
        //System.out.println(stringShift("abc",ar));
        System.out.println(stringShift("wpdhhcj",ar));
        /*for(row = 0; row < ar.length; row++) {
            for(column = 0; column < ar[0].length; column++) {
                varOne = paramOne[row][column];
                if(varOne > max){
                    max = varOne;
                }
            }
        }*/
    }
}
