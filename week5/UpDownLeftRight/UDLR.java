package UpDownLeftRight;
import java.util.*;

public class UDLR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 지도 크기 정하기
        int n = in.nextInt(); 

        // 버퍼 비워주기
        in.nextLine();

        // 이동 방향 입력
        String[] plans = in.nextLine().split(" "); 

        // 시작위치
        int x = 1, y = 1; 

        // L, R, U, D에 따른 이동 방향 
        int[] dx = {0, 0, -1, 1}; 
        int[] dy = {-1, 1, 0, 0}; 
        char[] move_types = {'L', 'R', 'U', 'D'}; 

        // 이동 계획을 하나씩 확인하기
        for (int i = 0; i < plans.length; i++) { 
            char plan = plans[i].charAt(0); 
            // 이동 후 좌표 구하기 
            int nx = -1, ny = -1; 
            for (int j = 0; j < 4; j++) { 
                if (plan == move_types[j]) { 
                    nx = x + dx[j]; 
                    ny = y + dy[j]; 
                } 
            } 
            // 공간을 벗어나는 경우 무시 
            if (nx < 1 || ny < 1 || nx > n || ny > n) 
            continue; 
            // 이동 수행 
            x = nx; 
            y = ny; 
        } 
        System.out.println(x + " " + y); 
    }
}