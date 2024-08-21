public class Main {
    public static void main(String[] args) {
        // 변수 a와 b를 선언하고 값을 초기화합니다.
        double a = 5.26;
        double b = 8.27;

        // 두 수의 곱을 계산합니다.
        double product = a * b;

        // 결과를 소수점 셋째 자리까지 반올림하여 출력합니다.
        System.out.printf("%.3f", product);
    }
}