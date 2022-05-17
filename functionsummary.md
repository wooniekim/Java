## 순차 탐색
```java
static int search(int []arr, int target){
        int i;
        for(i = 0; i < arr.length; i++)
            if(arr[i] == target)
                return i;
        return -1;
    }
```