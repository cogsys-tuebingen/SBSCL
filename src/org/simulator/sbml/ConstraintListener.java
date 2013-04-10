/*
 * $Id$
 * $URL$
 * ---------------------------------------------------------------------
 * This file is part of Simulation Core Library, a Java-based library
 * for efficient numerical simulation of biological models.
 *
 * Copyright (C) 2007-2013 jointly by the following organizations:
 * 1. University of Tuebingen, Germany
 * 2. Keio University, Japan
 * 3. Harvard University, USA
 * 4. The University of Edinburgh, UK
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

package org.simulator.sbml;

import java.util.EventListener;

import org.sbml.jsbml.Constraint;

/**
 * A listener interface that allows the processing of {@link Constraint}s that
 * triggered during simulation.
 * 
 * @author Alexander D&ouml;rr
 * @author Andreas Dr&auml;ger
 * @version $Rev$
 * @since 1.3
 */
public interface ConstraintListener extends EventListener {

	/**
	 * Processes the given {@link ConstraintEvent}.
	 * 
	 * @param evt
	 */
	public abstract void processViolation(ConstraintEvent evt);

}
