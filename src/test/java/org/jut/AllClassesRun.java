package org.jut;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
	public class AllClassesRun {
		public static void main(String[] args) {
			Result rs = JUnitCore.runClasses(One.class,Two.class);
			System.out.println("failure count" +rs.getFailureCount());
			System.out.println("ignore count" +rs.getIgnoreCount());
			System.out.println("run count"+rs.getRunCount());
		
			System.out.println("run time"+rs.getRunTime());
		
		System.out.println("pass count"+ (rs.getRunCount()-rs.getFailureCount()));
		
		List<Failure> failures = rs.getFailures();
		System.out.println(failures);
		}
}
