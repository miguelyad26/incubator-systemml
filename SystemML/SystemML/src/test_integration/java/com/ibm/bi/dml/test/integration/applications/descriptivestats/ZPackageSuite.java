package com.ibm.bi.dml.test.integration.applications.descriptivestats;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/** Group together the tests in this package into a single suite so that the Maven build
 *  won't run two of them at once. */
@RunWith(Suite.class)
@Suite.SuiteClasses({
  BivariateCategoricalCategoricallTest.class,
  BivariateOrdinalOrdinalTest.class,
  BivariateScaleCategoricalTest.class,
  BivariateScaleScaleTest.class,
  OrderStatisticsTest.class
 
})


/** This class is just a holder for the above JUnit annotations. */
public class ZPackageSuite {

}