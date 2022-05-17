public class week4{
    public static void main(String[] args) {
        int[] baekjegob = new int[31];
        baekjegob[30] = 2;
        for(int i = 1; i < 100; i++){
            for(int j = baekjegob.length - 1; j >= 0; j--){
                baekjegob[j] *= 2;
            }
            for(int k = baekjegob.length - 1; k > 0; k--){
                if(baekjegob[k] >= 10){
                    baekjegob[k - 1]++;
                    baekjegob[k] -= 10;
                }
            }
        }
        for(int y = 0; y < baekjegob.length; y++){
            System.out.print(baekjegob[y]);
        }
    }
}