package practice;
//구현과제로 실습

//hashset을 arraylist로 변환하여 정렬하기 구현

/*
 * 로또 당첨 규칙:
 * 꽝: 번호 2개, 1개
 * 5등: 번호 3개 - 5000원
 * 4등: 번호 4개 - 5만원
 * 3등: 번호 5개 - 150만원 - 판매금액에 변동(판매금액의 12.5%)
 * 2등: 3등번호 + 보너스번호 - 3000만원 - 판매 금액에 변동, 당첨 확률: 1,300,000분의1
 * 1등: 6개 숫자 - 당첨 확률 8,000,000 분의 1, 10억 ~ 30억
 */
//hashset을 arraylist로 변환하여 정렬하기 구현
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//class ListComparator implements Comparator<List<Integer>>{
//	@Override
//	public int compare(List<Integer> l1, List<Integer> l2) {
//		Iterator<Integer> ait = l1.iterator();
//		Iterator<Integer> bit = l2.iterator();
//		while (ait.hasNext()) {
//			int anum = ait.next();int bnum = bit.next();
//			if ( anum > bnum) return 1;
//			else if (anum < bnum) return -1;
//			
//		}
//		return 0;
//	}
//}
//

public class Test06 { // Q.로또 당첨?
	// 1. hashset을 arraylist로 변환하여 정렬하기 구현
//******************************************************
	public static void main(String[] args) {

		lotto_generator(5);

	}

//******************************************************
	 public static void lotto_generator(int n) {
	        Random number = new Random();
	        List<HashSet<Integer>> lotSet = new ArrayList<>();

	        HashSet<Integer> lotto = null;

	        for (int i = 0; i < n; i++) {
	            lotto = new HashSet<>();
	            for (int j = 0; lotto.size() < 6; j++) {
	                lotto.add(1 + number.nextInt(45));
	            }
	            Collections.sort(lotto);
	            lotSet.add(lotto);
	        }
//*****************1
	        
	        System.out.println("\n로또 번호 출력\n");

	        for (HashSet<Integer> eachLotto : lotSet) {
	            System.out.println(eachLotto);
	        }
	        

	        // 정렬 전 출력
	        System.out.println("로또 정렬 전: " + lotSet);

	        // 정렬 후 출력
	        lotSet.sort(Comparator.comparing(Object::toString));
	        
	        System.out.println("로또 정렬 후: " + lotSet);
//********************************2
	        // 당첨번호 추첨
	        HashSet<Integer> win = new HashSet<>();
	        for (int j = 0; win.size() < 6; j++) {
	            win.add(1 + number.nextInt(45));
	        }
	        int bonus = 1 + number.nextInt(45);
	        System.out.println("당첨번호: " + win + " 보너스번호 = " + bonus);
	        winnerLotto(win, lotSet);
	    }

	    static void winnerLotto(HashSet<Integer> w, List<HashSet<Integer>> lottoSet) {
	        for (HashSet<Integer> elem : lottoSet) {
	            checkWinner(w, elem);
	        }
	    }

	    static void checkWinner(HashSet<Integer> w, HashSet<Integer> elem) {
	        List<Integer> winList = new ArrayList<>(w);
	        int count = 0;

	        for (int winNum : winList) {
	            if (elem.contains(winNum)) {
	                count++;
	            }
	        }
	           }
	}