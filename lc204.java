class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i))
                count++;
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i =3; i*i<=n;i=i+2){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
