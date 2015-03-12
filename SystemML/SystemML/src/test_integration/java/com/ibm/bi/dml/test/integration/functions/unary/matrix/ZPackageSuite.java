package com.ibm.bi.dml.test.integration.functions.unary.matrix;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/** Group together the tests in this package into a single suite so that the Maven build
 *  won't run two of them at once. */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	AbsTest.class,
	ACosTest.class,
	ASinTest.class,
	ATanTest.class,
	CastAsScalarTest.class,
	CosTest.class,
	DiagTest.class,
	IQMTest.class,
	MinusTest.class,
	NegationTest.class,
	PrintTest.class,
	QRSolverTest.class,
	ReplaceTest.class,
	RoundTest.class,
	SinTest.class,
	SqrtTest.class,
	TanTest.class,
	TransposeTest.class
})


/** This class is just a holder for the above JUnit annotations. */
public class ZPackageSuite {

}