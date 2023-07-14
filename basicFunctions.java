package Functions;

public class basicFunctions {
    public static void main(String[] args) {

        // int n=10;

        // print(n);

        // int ans=factorial(5);
        // System.out.println(ans);
        
    }

    public static void print(int n){

        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }


    public static int factorial(int n) {

        if(n==0){
            return -1;
        }

        int sum=1;

        for(int i=1;i<=n;i++){
            sum=sum*i;
        }

        return sum;
        
    }


    public static int checkArmstrong (int n) {

        int sum=0;

        
    }
    
}
