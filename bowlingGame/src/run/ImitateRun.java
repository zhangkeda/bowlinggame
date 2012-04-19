package run;

import javasrc.BowlingGame;

public class ImitateRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bt1 = { 3, 7, 10, 10, 2, 5, 8, 1, 6, 3, 1, 6, 7, 3, 10, 2, 7 };
		int[] bt2 = { 3, 7, 10, 10, 2, 5, 8, 1, 6, 3, 1, 6, 7, 3, 10, 2, 8, 6 };
		int[] bt3 = { 3, 7, 10, 10, 2, 5, 8, 1, 6, 3, 1, 6, 7, 3, 10, 10, 5, 4 };

		BowlingGame g1 = new BowlingGame();
		BowlingGame g2 = new BowlingGame();
		BowlingGame g3 = new BowlingGame();

		g1.setRolls(bt1);
		System.out.println(g1.score());

		g2.setRolls(bt2);
		System.out.println(g2.score());

		g3.setRolls(bt3);
		System.out.println(g3.score());

	}

}
