// 두 2차원 벡터의 합과 곱(내적) 수행
// 예) 벡터1 = (1, 2)
//     벡터2 = (2, 3)
//     벡터 합 = (3, 5)
//     벡터 내적 = 8 (1 * 2 + 2 * 3)
//      벡터 1의 크기=...
//      벡터 2의 크기=...
// 힌트) 벡터 합 메소드 형식
// public double length(){ ... }
// public Vector2D add(Vector2D v)
// 힌트) 벡터 내적 메소드 형식
// public int mult(Vector2D v){ ... }
public class week_6_munje {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1,2);
        Vector2D v2 = new Vector2D(2,3);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.add(v2));
        System.out.println(v1.mult(v2));
    }
}

class Vector2D {
    private int x, y;
    public Vector2D(){} // 기본 생성자, 껍데기라도 만들어야함
    public Vector2D(int x, int y){this.x = x; this.y = y;} // 인자가 있는 생성자
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
    public double length(){
        return Math.sqrt(x * x + y * y);
    }
    public Vector2D add(Vector2D v){ // 필드를 사용하지 않은 메소드는 static을 붙이자
        return new Vector2D(x + v.x, y + v.y);
        
    }
    public int mult(Vector2D v){
        return this.x * v.x + this.y * v.y;
    }
}
