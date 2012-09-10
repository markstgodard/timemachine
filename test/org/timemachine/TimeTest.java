package org.timemachine;

import java.sql.Timestamp;

import junit.framework.Assert;

import org.junit.Test;

public class TimeTest {

  @Test
  public void basicUsingDefaultTimeSource() {
    
    long before = System.currentTimeMillis();
    
    Timestamp now = Time.now();
    Assert.assertNotNull(now);
    
    long after = System.currentTimeMillis();
    
    Assert.assertTrue(before <= now.getTime());
    Assert.assertTrue(after >= now.getTime());
  }

}
