package org.infinispan.util.concurrent.locks;

import org.infinispan.CacheException;
import org.infinispan.util.concurrent.TimeoutException;

/**
 * Exception signaling detected deadlocks.
 *
 * @author Mircea.Markus@jboss.com
 */
public class DeadlockDetectedException extends CacheException {

   private static final long serialVersionUID = -8529876192715526744L;

   public DeadlockDetectedException(String msg) {
      super(msg);
   }
}
