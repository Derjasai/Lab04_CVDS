package hangman.model;

import hangman.model.*;

import static org.junit.Assert.fail;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest extends TestCase {


	@Test
	public void testOriginalScoreCorrectScore(){
		OriginalScore oScore = new OriginalScore();
		int result = (int) oScore.calculateScore(10, 5);
		Assert.assertEquals(50, result);
	}

	@Test
	public void testOriginalScoreScore0(){
		OriginalScore oScore = new OriginalScore();
		int result = (int) oScore.calculateScore(0,11);
		Assert.assertEquals(0, result);
	}

	@Test
	public void testOriginalScoreInScore0(){
		OriginalScore oScore = new OriginalScore();
		int result = (int) oScore.calculateScore(5,0);
		Assert.assertEquals(100, result);
	}

	@Test
	public void testBonusScoreCorrectScore(){
		BonusScore bScore = new BonusScore();
		int result = (int) bScore.calculateScore(50,10);

		Assert.assertEquals(450, result);
	}

	@Test
	public void testBonusScoreCorrectScoreTo0(){
		BonusScore bScore = new BonusScore();
		int result1 = (int) bScore.calculateScore(10,25);
		int result2 = (int) bScore.calculateScore(15,30);

		Assert.assertEquals(0, result1);
		Assert.assertEquals(0, result2);
	}

	@Test
	public void testBonusScoreCorrectInizialitation(){
		BonusScore bScore = new BonusScore();
		int result = (int) bScore.calculateScore(0,0);

		Assert.assertEquals(0,result);
	}

	@Test
	public void testPowerScoreCorrectScore(){
		PowerScore pScore = new PowerScore();
		int result = pScore.calculateScore(3,5);

		Assert.assertEquals(115, result);
	}

	@Test
	public void testPowerScoreCorrectInizialitation(){
		PowerScore pScore = new PowerScore();
		int result = pScore.calculateScore(0,0);

		Assert.assertEquals(0 , result);
	}

	@Test
	public void testPowerScoreGreater500(){
		PowerScore pScore = new PowerScore();
		int result = pScore.calculateScore(5,5);

		Assert.assertEquals(500, result);
	}

}