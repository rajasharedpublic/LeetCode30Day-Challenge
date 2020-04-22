import java.util.*;

public class Problem7 {


    public static int CountingElements(int arr[])
    {
        if(arr.length<=0 || arr.length>1000){
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr) {
            if (!map.containsKey(i)) {
                map.put(i,1);
             } else {
                map.put(i,map.get(i)+1);
            }
        }

        int result=0;
        for(int i:map.keySet()){
            if(map.containsKey(i + 1)!= map.isEmpty())
            {
                result+=map.get(i);
            }

        }
     return result;
    }



    public static void main(String args[]){

        //int ar[]= {1,2,3};
        //int ar[]= {1,1,3,3,5,5,7,7};
        int ar[]= {405,220,238,143,795,820,831,855,77,402,369,997,349,185,171,547,855,80,535,139,858,988,915,863,338,927,696,818,387,834,223,311,905,589,4,889,755,678,849,117,754,460,706,665,27,484,847,803,759,152,721,531,258,215,776,867,136,104,29,803,744,972,680,95,925,107,739,638,603,373,561,909,495,573,221,488,509,109,311,492,193,513,993,496,12,625,793,537,948,957,140,809,284,93,198,609,106,12,546,186,251,827,918,615,459,999,331,808,675,164,332,880,172,134,405,871,65,155,877,462,99,84,428,573,798,273,700,213,724,826,812,227,871,556,316,755,585,911,382,776,621,936,523,519,651,441,420,386,839,739,391,39,422,992,933,851,642,503,484,697,546,444,947,110,415,737,931,516,22,741,154,189,40,568,307,856,467,887,430,925,884,914,36,331,188,78,659,865,154,133,436,622,366,699,8,889,518,386,221,990,50,719,132,759,594,908,167,24,783,843,115,922,778,813,74,189,720,832,921,694,225,367,299,858,202,67,532,760,397,171,29,963,804,511,122,595,377,34,701,921,22,456,404,105,888,646,713,466,149,154,743,864,147,571,253,718,279,471,745,80,707,239,537,898,533,451,101,684,283,261,559,879,589,932,460,863,231,980,93,118,908,762,810,877,181,719,802,255,663,698,332,731,962,177,410,242,215,526,620,246,784,842,220,877,699,972,582,682,537,797,898,608,357,326,707,750,371,950,162,150,781,254,152,84,595,60,505,656,925,546,447,394,199,595,645,911,312,335,260,108,394,724,945,918,331,577,136,554,792,231,912,342,576,172,489,67,457,468,256,160,349,238,320,681,688,293,236,405,437,370,346,157,345,225,847,276,631,129,921,921,706,20,551,275,384,426,754,557,154,339,897,646,45,632,319,575,471,553,775,717,846,782,779,142,286,644,794,954,624,320,853,567,960,39,785,544,675,337,517,65,5,470,164,350,723,446,244,533,322,970,675,686,914,185,391,493,989,713,57,932,325,491,700,676,463,346,37,580,898,246,859,184,564,229,293,768,933,614,281,676,576,438,950,311,268,582,976,234,941,496,841,146,37,279,586,771,601,92,257,145,782,164,245,343,191,877,87,7,124,801,276,708,345,647,921,260,764,475,719,638,464,507,638,129,918,803,87,382,233,75,515,971,323,228,766,568,167,942,447,780,894,401,10,865,852,583,257,65,928,681,50,161,960,890,845,45,649,128,208,42,775,789,768,171,61,932,936,862,362,553,517,401,282,173,633,244,765,37,467,860,602,301,113,921,906,104,538,579,333,259,938,373,716,918,136,346,185,934,147,514,751,9,809,499,478,13,416,339,297,911,657,999,978,534,847,578,988,574,605,577,176,449,847,335,43,494,209,551,847,508,829,649,745,428,76,42,30,407,147,213,887,56,455,166,757,911,758,1000,127,94,583,361,329,532,350,524,59,840,854,172,838,81,300,789,294,331,898,574,365,392,6,308,98,254,324,225,493,857,494,633,338,673,131,93,309,75,436,978,674,864,8,389,69,183,545,471,42,331,923,525,163,197,954,858,902,49,377,416,407,919,983,582,317,52,544,10,391,27,221,236,819,27,478,261,638,14,519,77,137,279,570,921,524,14,813,487,100,983,961,342,74,833,732,108,91,895,727,210,306,536,9,620,882,335,84,489,146,751,379,110,408,634,958,296,653,182,987,349,212,943,305,833,93,577,842,93,714,276,5,331,786,989,195,565,371,196,187,593,975,465,379,434,63,204,360,264,925,500,67,799,889,697,655,993,551,83,42,119,929,796,817,723,974,112,190,707,215,336,499,880,522,8,246,3,965,865,646,331,151,353,225,315,215,729,431,277,286,530,141,108,801,255,800,124,748,126,477,899,463,270,591,455,715,498,233,825,914,346,602,55,766,175,784,645,792,585,105,709,623,430,360,433,581,316,86,863,213,269,600,638,491,613,61,544,391,755,322,236,687,311,344,482,253,80,780,434,533,280,930,88,820,276,583,77,975,201,658,740,489,382,746,561,170,392,565,423,123,999,665,791,875,876,873,689,952,374,424,825,750,272,243,830,56,315,608,568,518,80,760,426,981,257,503,820,465,433,885,423,594,71,254,23,906,229,993,247,336,843,755,726,141,282,260,257,394,434,786,69,881,679,269,342,565,0,966,533,358,795,525,943,133,492,593,977,833,525,338,139,537,305,482,212,334,335,534,888,790,327,261,984,644,541,987,583,858,864,340,691,197,404,995,630,419,958,593,894,915,686,380,615};
        System.out.println(CountingElements(ar));

    }

}
