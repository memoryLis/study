package com.liang.designpattern.behabvior.responsitychain.ayyayimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Chain
 * Package: com.liang.designpattern.behabvior.responsitychain.ayyayimpl
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 17:45
 */
public class Chain {
    List<Scoring> scoringList = new ArrayList<>();
    public void add(Scoring scoring){
        scoringList.add(scoring);
    }
    public void handler(int score){
        if(scoringList !=null && scoringList.size() != 0){
            for (Scoring scoring : scoringList) {
                boolean correct = scoring.correct(score);
                if(correct){
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.add(new Good());
        chain.add(new NoGood());
        chain.add(new Default());
        chain.handler(40);
    }
}
