package org.apache.maven.doxia.book.services.renderer;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.maven.doxia.module.itext.ITextUtil;
import org.codehaus.plexus.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RTF book renderer with the <code>iText</code> framework.
 *
 * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a>
 * @version $Id$
 */
@Component( role = BookRenderer.class, hint = "rtf" )
public class RtfBookRenderer
    extends AbstractITextBookRenderer
{
    private static final Logger LOGGER = LoggerFactory.getLogger( RtfBookRenderer.class );

    /** {@inheritDoc} */
    public String getOutputExtension()
    {
        return "rtf";
    }

    /** {@inheritDoc} */
    public void renderXML( File iTextFile, File iTextOutput )
        throws IOException
    {
        ITextUtil.writeRtf( new FileInputStream( iTextFile ), new FileOutputStream( iTextOutput ) );
    }
}
