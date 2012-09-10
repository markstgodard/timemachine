package org.timemachine;

import java.sql.Timestamp;

/**
 * {@link TimeSource} defines how time is derived (i.e. from {@link System}
 * currentTimeMillis or otherwise).
 * 
 * @author markstgodard@gmail.com
 * 
 */
public interface TimeSource {

  /**
   * Represents the current (or faked) time.
   * 
   * @return The current time as timestamp
   */
  public Timestamp now();

}
