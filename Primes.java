public class Primes {
    public static void main(String[] args) {
       int N = Integer.parseInt(args[0]);
       final boolean[] arrPrime = new boolean[N+1];

       for(int i=1; i<arrPrime.length; i++){
        arrPrime[i] = true;
        }

        for(int i = 2; i<arrPrime.length; i++){
            if (arrPrime[i]){

                for(int j = 2; j<arrPrime.length; j++) {
                    if((j % i == 0) && j != i ){
                        arrPrime[j] = false; 
                    }
                }

            }   
        }   
       
        System.out.println("Prime numbers up to " + N + " :");
        System.out.println(0);
        int count = 0;
        for(int i=0; i<arrPrime.length; i++){
            if (i == 1) {
                i++;
            }
            if(i == 4){
                System.out.println(3);
            }
            if (arrPrime[i]) {
                System.out.println(i++);
                count++;
            }
            
        }
        count++;
        System.out.println("There are " + count +
         " primes between 2 and " + N + " (" + (int)(((double) count / N) * 100) + "% are primes)");

        
    }
}