package org.apache.maven.doxia.book.services.validation;

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

import java.util.List;
import java.util.ArrayList;

/**
 * Encapsulates the result of a validation.
 *
 * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a>
 * @version $Id$
 */
public class ValidationResult
{
    /** List of errors. */
    private List<String> errors;

    /** List of warnings. */
    private List<String> warnings;

    /**
     * Checks if there were any errors or warnings.
     *
     * @return True if there were no errors or warnings.
     */
    public boolean isAllOk()
    {
        return getErrors().size() == 0 && getWarnings().size() == 0;
    }

    /**
     * Return the list of errors.
     *
     * @return List. A new ArrayList is constructed if the current List is null.
     */
    public List<String> getErrors()
    {
        if ( errors == null )
        {
            errors = new ArrayList<String>();
        }

        return errors;
    }

    /**
     * Return the list of warnings.
     *
     * @return List. A new ArrayList is constructed if the current List is null.
     */
    public List<String> getWarnings()
    {
        if ( warnings == null )
        {
            warnings = new ArrayList<String>();
        }

        return warnings;
    }
}
