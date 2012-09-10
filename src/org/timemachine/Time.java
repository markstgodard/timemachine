package org.timemachine;

import java.sql.Timestamp;

/**
 * Time is a value type representing the current time, which is based on the
 * current {@link TimeSource}.
 * 
 * @author markstgodard@gmail.com
 */
public class Time {

  /** internal source of time */
  private static TimeSource timeSource;

  /**
   * Get the current time based on {@link TimeSource}.
   * 
   * @return The current time
   */
  public static Timestamp now() {
    // acquire time from time source
    return timeSource().now();
  }

  /**
   * Return the current {@link TimeSource}
   * 
   * @return time source
   */
  public static TimeSource timeSource() {
    // lazy init access of timesource
    if (timeSource == null) {
      timeSource = SystemTimeSource.timeSource();
    }
    return timeSource;
  }

}
