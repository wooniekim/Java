// 어떤 정수 n에서 시작해, n이 짝수면 2로 나누고,
// 홀수면 3을 곱한 다음 1을 더한다. 
// 이렇게 해서 새로 만들어진 숫자를 n으로 놓고,
// n=1 이 될때까지 같은 작업을 계속 반복한다.
// n이라는 값이 입력되었을때 1이 나올 때까지 만들어진 수의 개수(1을 포함)를 n의 사이클 길이라고 한다. 
// 위에 있는 수열을 예로 들면 22의 사이클 길이는 16이다.
// 900과 1000 사이의 수 중에서 가장 긴 사이클의 길이를 출력

public class sibal1 {
    public static void main(String[] args) {
        int max = 0;
        for(int i = 900; i <= 1000; i++){
            if(Cycle(i) > max){
                max =  Cycle(i);
            }
        }
        System.out.println(max);
    }
    public static int Cycle(int n){
        int count = 0;
        for(int ye = 1; n > 1; ye++){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            count = ye;
        }    
        return count + 1;
    }
}
