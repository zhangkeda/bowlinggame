package javasrc;

public class BowlingGame {
	
	
	public BowlingGame() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int rolls[] = new int[21];   //用来存放每次击倒的个数
	private int currentRoll = 0;         //每次击倒的个数

	//生成对数组的setter和sgetter方法
	public int[] getRolls() {
		return rolls;
	}

	public void setRolls(int[] rolls) {
		this.rolls = rolls;
	}

	//普通轮的得分
	private int sumOfBallsInFrame(int frameIndex) {         
		return rolls[frameIndex] + rolls[frameIndex + 1];
	}

	//补中的附加分
	private int spareBonus(int frameIndex) {   
		return rolls[frameIndex + 2];
	}

	//全中的附加分
	private int strikeBonus(int frameIndex) {      
		return rolls[frameIndex + 1] + rolls[frameIndex + 2];
	}

	//判断是否补中
	private boolean isSpare(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
	}

	//判断是否全中
	private boolean isStrike(int frameIndex) {
		return rolls[frameIndex] == 10;
	}

	//将每次击倒的个数存放在数组中
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	//计算总得分
	public int score() {
		int score = 0;
		int frameIndex = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isStrike(frameIndex)) {
				score += 10 + strikeBonus(frameIndex);
				frameIndex++;
			} else if (isSpare(frameIndex)) {
				score += 10 + spareBonus(frameIndex);
				frameIndex += 2;
			} else {
				score += sumOfBallsInFrame(frameIndex);
				frameIndex += 2;
			}
		}
		return score;
	}

}


