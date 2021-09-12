package week2;
import java.util.*;

public class Coin {
    public static void main(String[] args) {
        int cnt = 0; // 필요한 동전의 최소 개수 cnt

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 동전의 종류 개수
        int k = sc.nextInt(); // 만드려는 동전의 가치

        Integer[] coinTypes = new Integer[n]; // 동전의 종류

        // 입력된 동전의 종류를 배열에 넣어준다.
        for (int i = 0; i < n; i++) {
            coinTypes[i] = sc.nextInt();
        }

        // 동전의 종류가 오름차순으로 입력되었기에 내림차순으로 변경해준다.
        Arrays.sort(coinTypes, Collections.reverseOrder());

        // 그리디 알고리즘 수행
        for (int i = 0; i < n; i++) {
            cnt += k / coinTypes[i];
            k %= coinTypes[i];
        }

        // 최적의 동전 개수를 출력한다.
        System.out.println(cnt);
    }
}