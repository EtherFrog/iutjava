package edu.iut.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iut.app.ApplicationInfoLog;

public class ApplicationInfoLogTest {

	@Test
	public void setMessageTest()throws Exception {
		ApplicationInfoLog ai = new ApplicationInfoLog();
		ai.setMessage("OK");
		if(!ai.message.equals("OK")){
			fail("setMessage is not working !");
		}
	}
}
