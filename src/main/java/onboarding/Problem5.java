package onboarding;
import java.util.List;
import java.util.ArrayList;
public class Problem5 {
    public static List<Integer> solution(int money) {
        //List<Integer> answer = Collections.emptyList();
        ArrayList<Integer> answer=new ArrayList<Integer>();

        answer.add(money/50000);
        money=money%50000;
        answer.add(money/10000);
        money=money%10000;
        answer.add(money/5000);
        money=money%5000;
        answer.add(money/1000);
        money=money%1000;
        answer.add(money/500);
        money=money%500;
        answer.add(money/100);
        money=money%100;
        answer.add(money/50);
        money=money%50;
        answer.add(money/10);
        money=money%10;
        answer.add(money);

        return answer;
    }
}