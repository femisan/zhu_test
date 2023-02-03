package testIF;

public class fortest {

    public static int add(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
//       int sum=0;
//       for (int num=1;num<=5;num++)
//           sum=sum+num;
//
//         System.out.println(sum);
        int a = 4;
        int b = 3;
        b = a;
        String[] arr0 = {"23,","212","34s"};
       String[] arr = new String[2];
        arr = arr0;
        System.out.println(arr);



        int i;
        OuterLoop:for(i=0;i<2;i++){
            for(int j=1;j<4;j++){
                if (i==j){
                    continue OuterLoop;
                }
                 System.out.println("i="+i +"j="+j);
            }
        }
        System.out.println(i);

    }
}
