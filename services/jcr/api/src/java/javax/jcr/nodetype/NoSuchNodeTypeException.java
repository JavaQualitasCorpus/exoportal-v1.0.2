/*
 * $Id: NoSuchNodeTypeException.java,v 1.2 2004/07/24 00:16:23 benjmestrallet Exp $
 *
 * Copyright 2002-2004 Day Management AG, Switzerland.
 *
 * Licensed under the Day RI License, Version 2.0 (the "License"),
 * as a reference implementation of the following specification:
 *
 *   Content Repository API for Java Technology, revision 0.12
 *        <http://www.jcp.org/en/jsr/detail?id=170>
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License files at
 *
 *     http://www.day.com/content/en/licenses/day-ri-license-2.0
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.jcr.nodetype;

import javax.jcr.RepositoryException;

/**
 * Exception thrown by node type-related methods.
 *
 * @author Peeter Piegaze
 */
public class NoSuchNodeTypeException extends RepositoryException {

  /**
   * Constructs a new instance of this class.
   */
  public NoSuchNodeTypeException() {
    super();
  }

  /**
   * Constructs a new instance of this class given a message describing the
   * failure cause.
   *
   * @param s description
   */
  public NoSuchNodeTypeException(String s) {
    super(s);
  }

  /**
   * Constructs a new instance of this class given a message describing the
   * failure and a root exception.
   *
   * @param s description
   * @param e root failure cause
   */
  public NoSuchNodeTypeException(String s, Exception e) {
    super(s, e);
  }
}
