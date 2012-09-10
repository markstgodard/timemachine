package org.timemachine;

import java.sql.Timestamp;

/**
 * Default {@link TimeSource} implementation based on System.currentTimeMillis.
 * 
 * @author markstgodard@gmail.com
 * 
 */
public class SystemTimeSource {

  /**
   * Time source for {@link SystemTimeSource}.
   * @return the {@link TimeSource}
   */
  public static TimeSource timeSource() {
    return new TimeSource() {
      public Timestamp now() {
        return SystemTimeSource.now();
      }
    };
  }

  /**
   * Return the current system time
   * 
   * @return The current time
   */
  public static Timestamp now() {
    return new Timestamp(System.currentTimeMillis());
  }

}
