package com.ProjectConcept1;

import com.NykaaMavenConceptPom.LoginId;
import com.ProjectConceptBase.BaseClass;

public class RunnerClass extends BaseClass {
	public void loginId() throws InterruptedException {
		LoginId log = new LoginId(driver);
		clickElement(log.getsignIn());
		clickElement(log.getmobile());
		Thread.sleep(10000);
		clickElement(log.getsid1());
		wait(30);
//		sendKeys(log.getsid1(),"6382199843");
		clickElement(log.getsubmit());
		Thread.sleep(30000);
		clickElement(log.getverify());
		
	}
	public static void main(String[] args) {
		
       
	}

}
