package hangman.model;

import hangman.model.*;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {

	@Test
	public void testOriginalScoreInCountFail() {
		OriginalScore oScore = new OriginalScore();
		int result;
		try {
			result = (int) oScore.calculateScore(0, -11);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testOriginalScoreCoCountFail() {
		OriginalScore oScore = new OriginalScore();
		int result;
		try {
			result = (int) oScore.calculateScore(-10, 0);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testBonusScoreInCountFail() {
		BonusScore bScore = new BonusScore();
		int result;
		try {
			result = (int) bScore.calculateScore(0, -11);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testBonusScoreCoCountFail() {
		BonusScore bScore = new BonusScore();
		int result;
		try {
			result = (int) bScore.calculateScore(-10, 0);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testPowerScoreInCountFail() {
		PowerScore pScore = new PowerScore();
		int result;
		try {
			result = (int) pScore.calculateScore(0, -11);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}
	
	@Test
	public void testPowerScoreCoCountFail() {
		PowerScore pScore = new PowerScore();
		int result;
		try {
			result = (int) pScore.calculateScore(-10, 0);
			fail("Numero de entrada invalido");
			Assert.assertEquals(0, result);
		} catch (Exception e) {
			Assert.assertEquals("Numero de entrada invalido",e.getMessage());
		}
	}

}