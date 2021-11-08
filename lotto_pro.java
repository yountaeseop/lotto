package Java2021_11_08;

import java.util.Scanner;

public class lotto_pro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lottoNums = new int[6]; 
		// 내가 선택한 번호
		
		int[] winNums = new int[7];
//		int[] winNums = {1,1,1,1,1,1,1};
		// 1등 당첨번호
		
		int length = lottoNums.length;
		
		 //1등 번호 저장
		for(int i = 0; i < winNums.length; i++) {
			winNums[i] = (int)(Math.random()*45) + 1;
			
		// 중복체크 
		for(int j = 0; j < i; j++) {
			if(winNums[i] == winNums[j]) {
					i--; //추가하면 안되므로 이전으로 돌림
					break;
				}
			}
		}
		
		
		
		
		// 선택번호 입력
		for(int i = 0; i < length; i++) {
			lottoNums[i] = Integer.parseInt(sc.nextLine());
			}
		
		System.out.print("선택된 로또 번호 : ");
		for(int i = 0; i < length; i++) {
			System.out.print(lottoNums[i]+" ");
		}
		
		System.out.println();
		
		System.out.print(" 로또 당첨번호 ");
		for (int i = 0; i < winNums.length - 1; i++) {
			System.out.print(winNums[i] + " ");
		}
		System.out.println("보너스 번호 :"+winNums[length]);
		
		
		
		
		
		
		
		
		
		int god = 0;
		
		boolean isExistBonusNum = false;
		// 당첨 여부 확인 코드----------
		
		for(int i = 0; i < winNums.length - 1; i++) {
			for(int j = 0; j < length; j++) {
				if(winNums[i] == lottoNums[j]) {
					god++;
					break;
				}
				else if(winNums[6] == lottoNums[j] && !isExistBonusNum){
					isExistBonusNum = true;
					break;
				}
			}
		}
		
		
		if(god == 6) {
			System.out.println("1등당첨");
		}else if(god == 5 && isExistBonusNum) {
			System.out.println("2등 당첨");
		}else {
			System.out.println("꽝");
			};
		
		
		
		
		
	}	
}
