class Stringcompress {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        if(s.length() == 1) return 1;

        for(int i=1; is.length() ; i++){
            String now = ; String comp = ;
            String temp = ;
            int cnt = 1;

            for(int j= 0; j=s.length()i;j++){
                int from = ij; int to = i(j+1);
                if(to  s.length()) to = s.length();

                now = comp;
                comp = s.substring(from, to);

                if(now.equals(comp)) cnt++;
                else{
                    if(cnt1) temp += String.valueOf(cnt);
                    temp += now; 
                    cnt = 1;  개수 초기화
                }
            }
            if(cnt1) temp += String.valueOf(cnt);
            temp += comp; 
            answer = Math.min(temp.length(), answer);
        }
        
        return answer;
    }
}
