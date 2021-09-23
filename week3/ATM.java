import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 대기 중인 사람의 수 N
        int N = in.nextInt();

        // 인출하는데 걸리는 시간 P
        ArrayList<Integer> P = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            P.add(in.nextInt());
        }
        
        // 기다리는 시간이 짧은 순서대로(오름차순) 정렬
        Collections.sort(P);

        // 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값 result
        int result = 0;

        for(int i = 0; i < P.size(); i++) {
            for(int j = 0; j < i+1; j++) {
                result += P.get(j);
            }
        }
        
        System.out.println(result);
    }
}