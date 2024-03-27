import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	
	int diceCount=6;
	int min=1;
	int max=6;

	public Dice(int count) {
		this.diceCount = count;
	}
	
	public int rollDice() {

        int totalSum=0;
        int diceUsed=0;

        while(diceUsed<diceCount){

            totalSum += ThreadLocalRandom.current().nextInt(min,max+1);
            diceUsed++;
        }

        return totalSum;
	}

}
