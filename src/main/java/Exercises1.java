public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public static long factorial(int n) {
        // TODO
        if(n==0){
            return 1;
        }
        long fac = 1;
        while(n>0){
            fac = fac*n;
            n=n-1;
        }
        return fac;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        // TODO
        if( n<3){
            return 1;
        } else{
            long current_num = 1;
            long past_num = 1;
            long current_num_copy;
            for(int i=1 ; i<n-1 ; i++){
                current_num_copy = current_num;
                current_num = current_num + past_num;
                past_num = current_num_copy;
            }
            return current_num;
        }

    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        // TODO
        char[][] triangle = new char[rows][];
        for(int i=0 ; i<rows ; i++){
            triangle[i] = new char[i+1];
        }
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<i+1 ; j++){
                triangle[i][j] = '*';
            }
        }

        return triangle;
    }


    public static void main(String[] args) {

        // test your code here!

    }

}