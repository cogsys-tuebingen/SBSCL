/*
 * $Id$
 * $URL$
 * ---------------------------------------------------------------------
 * This file is part of Simulation Core Library, a Java-based library
 * for efficient numerical simulation of biological models.
 *
 * Copyright (C) 2007-2012 jointly by the following organizations:
 * 1. The University of Tuebingen, Germany
 * 2. The Keio University, Japan
 * 3. The Harvard University, USA
 * 4. The University of Edinburgh
 * 5. EMBL European Bioinformatics Institute (EBML-EBI), Hinxton, UK
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation. A copy of the license
 * agreement is provided in the file named "LICENSE.txt" included with
 * this software distribution and also available online as
 * <http://www.gnu.org/licenses/lgpl-3.0-standalone.html>.
 * ---------------------------------------------------------------------
 */
package org.simulator.sedml;

/**
 * Runtime exception indicating that SEDML execution has failed.
 * @author Richard Adams
 * @version $Rev$
 * @since 1.1
 */
public class ExecutionException extends RuntimeException {

	public ExecutionException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
