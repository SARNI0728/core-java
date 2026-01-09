package november.twenty_eight.getpoker;

import java.util.*;

public class Main {
    static final int PLAYER_NUMBER = 3;
    static final int SHUFFLE_COUNT = 1000;

    public static void main(String[] args) {
        //创建牌组
        String[] suits = {"黑桃","桃心","梅花","方片"};
        String[] nums = {"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] cards = new  String[54];
        for(int i = 0; i< suits.length; i++){
            for(int j = 0;j<nums.length;j++){
                cards[i*13 + j] = suits[i].concat(nums[j]);
                }
            }
        cards[54 - 2] = "小王";
        cards[54 - 1] = "大王";

        //洗牌 （也可以使用shuffle）
        Random rand = new Random();
        int randomNumber1;
        int randomNumber2;
        StringBuilder tempString = new StringBuilder();
        for(int i = 0;i<SHUFFLE_COUNT;i++){
            randomNumber1 = rand.nextInt(54);
            randomNumber2 = rand.nextInt(54);
            tempString.append(cards[randomNumber1]);
            cards[randomNumber1] = cards[randomNumber2];
            cards[randomNumber2] = tempString.toString();
            tempString.setLength(0);
        }

        //定义三个玩家，给三个玩家发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for(int i = 0;i<51;i++){
            if(i % 3 == 0)
                player1.add(cards[i]);
            else if(i % 3 == 1)
                player2.add(cards[i]);
            else player3.add(cards[i]);
        }

        player1.sort(new cardsComparator());
        player2.sort(new cardsComparator());
        player3.sort(new cardsComparator());
        Collections.reverse(player1);
        Collections.reverse(player2);
        Collections.reverse(player3);

        System.out.println("玩家1的手牌：" + player1);
        System.out.println("玩家2的手牌：" + player2);
        System.out.println("玩家3的手牌：" + player3);
        System.out.println("底牌：");
        for (int i = 51; i < 54; i++) {
            System.out.print(cards[i] + " ");
        }

    }

    public static class cardsComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) { //检查是否相同
            if(o1.equals(o2)){
                return 0;
            }

            HashMap<String, Integer> suitMap = new HashMap<>(); //创建映射器用于比较
            suitMap.put("大王",6);
            suitMap.put("小王",5);
            suitMap.put("黑桃",4);
            suitMap.put("桃心",3);
            suitMap.put("梅花",2);
            suitMap.put("方片",1);

            int valueOfSuitOfCard1 = suitMap.get(o1.substring(0,2));
            int valueOfSuitCard2 = suitMap.get(o2.substring(0,2));

            if(valueOfSuitOfCard1!=valueOfSuitCard2){ //比较花色
                return valueOfSuitOfCard1-valueOfSuitCard2;
            }

            HashMap<String, Integer> numberMap = new HashMap<>();
            numberMap.put("A",1);
            numberMap.put("J",11);
            numberMap.put("Q",12);
            numberMap.put("K",13);

            int numberOfCard1;
            int numberOfCard2;

            if(numberMap.containsKey(o1.substring(2)))
                numberOfCard1 = numberMap.get(o1.substring(2));
            else
                numberOfCard1 = Integer.parseInt(o1.substring(2));

            if(numberMap.containsKey(o2.substring(2)))
                numberOfCard2 = numberMap.get(o2.substring(2));
            else
                numberOfCard2 = Integer.parseInt(o2.substring(2));

            return numberOfCard1-numberOfCard2;
        }
    }
}
