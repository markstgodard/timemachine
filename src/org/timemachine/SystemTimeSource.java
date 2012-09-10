/**
 * 
 */
package org.timemachine;

import java.sql.Timestamp;

/**
 * Default {@link TimeSource} implementation based on
 * System.currentTimeMillis.
 * 
 * @author markstgodard@gmail.com
 *
 */
public class SystemTimeSource implements TimeSource {

  /* (non-Javadoc)
   * @see org.timemachine.TimeSource#now()
   */
  public Timestamp now() {
    return new Timestamp(System.currentTimeMillis());
  }

}
