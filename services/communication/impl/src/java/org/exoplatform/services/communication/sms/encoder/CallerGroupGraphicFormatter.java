/***************************************************************************
 * Copyright 2001-2003 The eXo Platform SARL         All rights reserved.  *
 * Please look at license.txt in info directory for more license detail.   *
 **************************************************************************/
package org.exoplatform.services.communication.sms.encoder;

import org.exoplatform.services.communication.sms.common.ConvertException;
import org.exoplatform.services.communication.sms.common.OperationNotSupported;
import org.exoplatform.services.communication.sms.encoder.Formatter;
import org.exoplatform.services.communication.sms.encoder.MessageFormat;

/**
 * 
 * @author: Ove Ranheim
 * @email:  oranheim@users.sourceforge.net
 */
public class CallerGroupGraphicFormatter implements Formatter {

    private static Formatter _me;
    
    public CallerGroupGraphicFormatter() {
    }

    public MessageFormat getFormat() {
        return MessageFormat.CALLER_GROUP_GRAPHIC;
    }

    public Object convert(Object object) throws ConvertException {
        throw new OperationNotSupported("Not yet implemented!");
    }

    public static Formatter getInstance() {
        if (_me == null) _me = new CallerGroupGraphicFormatter();
        return _me;
    }
    
}

