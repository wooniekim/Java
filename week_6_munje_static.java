public class week_6_munje_static{
    public static void main(String[] args) {
        long jesus = 0;
        for(int k = 1; k <= 5100; k++){
            if(isgenerator(k)){
                jesus += k;
            }
        }
        System.out.println(jesus);
    }
    static int generator(int x){
        int sum = 0;
        while(x != 0){
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
    static boolean isgenerator(int x){
        for(int i = 1; i <= x; i++){
            if(i + generator(i) == x)
                return false;
        }
        return true;
    }
}