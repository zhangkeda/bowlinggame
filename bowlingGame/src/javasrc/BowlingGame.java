package javasrc;

public class BowlingGame {
	
	
	public BowlingGame() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int rolls[] = new int[21];   //�������ÿ�λ����ĸ���
	private int currentRoll = 0;         //ÿ�λ����ĸ���

	//���ɶ������setter��sgetter����
	public int[] getRolls() {
		return rolls;
	}

	public void setRolls(int[] rolls) {
		this.rolls = rolls;
	}

	//��ͨ�ֵĵ÷�
	private int sumOfBallsInFrame(int frameIndex) {         
		return rolls[frameIndex] + rolls[frameIndex + 1];
	}

	//���еĸ��ӷ�
	private int spareBonus(int frameIndex) {   
		return rolls[frameIndex + 2];
	}

	//ȫ�еĸ��ӷ�
	private int strikeBonus(int frameIndex) {      
		return rolls[frameIndex + 1] + rolls[frameIndex + 2];
	}

	//�ж��Ƿ���
	private boolean isSpare(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
	}

	//�ж��Ƿ�ȫ��
	private boolean isStrike(int frameIndex) {
		return rolls[frameIndex] == 10;
	}

	//��ÿ�λ����ĸ��������������
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	//�����ܵ÷�
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


