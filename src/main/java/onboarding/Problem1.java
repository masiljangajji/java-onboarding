package onboarding;

import java.util.List;
class Problem1 {

    public static int solution(List<Integer> pobi, List<Integer> crong) {

        int answer = Integer.MAX_VALUE;

        int pobi_Max,crong_Max;
        if ((pobi.get(0) + 1 != pobi.get(1)) || (crong.get(0) + 1 != crong.get(1))) {
            answer= -1;
            return answer;
        }
        else if (pobi.get(0) % 2 == 0 || crong.get(0) % 2 == 0 || pobi.get(1) % 2 == 1 || crong.get(1) % 2 == 1) {
            answer= -1;
            return answer;
        }
        else
        {
            pobi_Max=crong_Max=0;

            for(int i=0;i<2;i++)
            {
                int sum=0;
                int n=pobi.get(i);
                while(n>0)
                {
                    sum+=n%10;
                    n/=10;
                }
                if(sum>pobi_Max)
                    pobi_Max=sum;
            }

            for(int i=0;i<2;i++)
            {
                int sum=0;
                int n=crong.get(i);
                while(n>0)
                {
                    sum+=n%10;
                    n/=10;
                }
                if(sum>crong_Max)
                    crong_Max=sum;
            }

            for(int i=0;i<2;i++)
            {
                int sum=1;
                int n=pobi.get(i);
                while(n>0)
                {
                    sum*=n%10;
                    n/=10;
                }
                if(sum>pobi_Max)
                    pobi_Max=sum;
            }

            for(int i=0;i<2;i++)
            {
                int sum=1;
                int n=crong.get(i);
                while(n>0)
                {
                    sum*=n%10;
                    n/=10;
                }
                if(sum>crong_Max)
                    crong_Max=sum;
            }

        }

        if(pobi_Max>crong_Max)
            answer=1;
        else if(pobi_Max<crong_Max)
            answer=2;
        else if(pobi_Max==crong_Max)
            answer=0;


        return answer;
    }


}