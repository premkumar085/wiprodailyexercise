package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

class TestSuitepakage {
	
	@Suite
	@SelectPackages({"com.wipro.test","com.wipro.solid"})
	public class TestSuite {
	}

}
