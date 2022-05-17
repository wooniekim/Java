# 배열
- 동일한 타입의 변수들의 모임
- 연속적으로 할당된 기억공간
- 변수들을 모아 놓은 것(하나의 이름을 공유함)
- 크기가 같아야함(정수배열, 실수배열)

## 배열의 생성과 초기
### 배열 생성
- 배열 생성 방법(배열도 객체)
```java
s =  new int[10]; // 정수 10개를 담을 수 있다
```
- 인덱스는 0부터 시작
### 배열의 초기화
```java
int[] scores = {10, 20, 30, 40, 50}; // 생성과 함께 초기화
```
### 연습문제
- 배열의 원소 중 최소값 찾기
- 첫 번째 요소를 최소값이라고 가정
- 두번째 요소가 더 작으면 Minimum을 변경
```java
int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 };
        int minimum = s[0];
        for(int i = 1; i < s.length; i++){
            if(s[i] < minimum){
                minimum = s[i];
            }
        }
        System.out.println("최소값은 " + minimum);
```
- 순차탐색 ~ 배열의 원소를 순서대로 하나씩 탐색키와 비교(이진검색이 제일 효율적)

### 연습문제
- 1 ~ 10의 임의의 정수를 가지는 크기 10 정수 배열 생성
- 사용자로부터 타겟 정수 입력받아, 처음 위치 출력
- 찾을 정수 입력 : 9
- 위치 : -1
- 찾을 정수 입력 : 9
- 위치 : 3
- 정수 배열 출력 = [ ... ]

### 연습문제
- 최대값, 평균, 분산, 표준편차 구하기
```java
import java.util.Arrays;
public class week4{
    public static void main(String[] args) {
        int s[] = new int[10];
        int i, sum = 0;
        double avg, dsum = 0;

        for(i = 0; i < s.length; i++)
            s[i] = (int)(Math.random() * 10) + 1;

        System.out.println(Arrays.toString(s));

        for(i = 0; i < s.length; i++)
            sum += s[i];

        avg = (double)sum / s.length;

        for(i = 0; i < s.length; i++)
            dsum += (s[i] - avg) * (s[i] - avg);

        System.out.println("분산 : " + dsum/s.length);
        System.out.println("표준편차 : " + Math.sqrt(dsum/s.length));
        
    }
}
```

## for-each루프
```java
int[] numbers = {10, 20, 30};
for(int value : numbers)
    System.out.print(value + " ");
```

## 배열 복사
- 얕은 복사(주소 복사) : 참조 변수의 복사
- 깊은 복사 : 복사 배열 생성 & 원소별 복사
- 방법1
```java
int[] list1 = {1,2,3,4,5};
        int[] list2 = new int[list1.length];
        for(int i = 0; i < list2.length; i++)
            list2[i] = list1[i];
```
- 방법2
```java
int[] list1 = {1,2,3,4,5};
int[] list2 = Arrays.copyOf(list1, list1.length);
```

## 두 배열 비교
- Arrays.equals(배열1, 배열2)사용
- 두 배열의 데이터가 같은지 비교

## 배열 정렬
- Arrays.sort(배열이름);
- 배열의 요소를 정렬함 

# 문자열





## Arrays
- Arrays.toString()
- Arrays.copyOf()
- Arrays.equals()
- Arrays.sort()
- 객체를 생성하지 않고도 쓸 수 있음(static method), 일반적인 호출방법과 다름


## 2차원 배열
- int[][] s = new int[3][5], 3은 행의 개수, 5는 열의 개수 (행이 가로, 열이 세로)
- ppt 18쪽 중요
```java
public class week5 {
    public static void main(String[] args) {
        int [][] arr = { {10, 20, 30, 40},
                         {50, 60, 70, 80},
                         {90, 100, 110, 120} };
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

```


## Ragged Array - 시험에 잘 나옴
- 크기가 다른 배열들을 원소로 가지는 배열
```java
public class week5{
    public static void main(String[] args) {
        int [][] rarr = new int [5][];
        int i, j;
        for(i = 0; i < rarr.length; i++){
            rarr[i] = new int[i + 1];
        }
        for(i = 0; i < rarr.length; i++){
            for(j = 0; j < rarr[i].length; j++){
                rarr[i][j] = j + 1;
            }
        }
        for(i = 0; i < rarr.length; i++){
            for(j = 0; j < rarr[i].length; j++){
                System.out.print(rarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

- 파스칼 삼각형ㅅㅂ
```java
public class week5{
    public static void main(String[] args) {
        int [][] rarr = new int [6][];
        int i, j;
        for(i = 0; i < rarr.length; i++){
            rarr[i] = new int[i + 1];
        }
        for(i = 0; i < rarr.length; i++){
            for(j = 0; j < rarr[i].length; j++){
                if(j == 0 || i == j)
                    rarr[i][j] = 1;
                else
                    rarr[i][j] = rarr[i - 1][j] + rarr[i - 1][j - 1];
            }
        }
        for(i = 0; i < rarr.length; i++){
            for(j = 0; j < rarr[i].length; j++){
                System.out.print(rarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```

## 문자열 배열
- String[] 배열이름 = {"일", "월", "화", "수", "목", "금", "토"};