/*
 * $$Id${file_name} ${time} ${user} $$
 * $$URL${file_name} $$
 * ---------------------------------------------------------------------
 * This file is part of Simulation Core Library, a Java-based library
 * for efficient numerical simulation of biological models.
 *
 * Copyright (C) 2007-2012 jointly by the following organizations:
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
package org.simulator.math;

/**
 * @author Roland Keller
 * @version $Rev$
 * @since 1.0
 */
public class RelativeManhattanDistance extends Relative_N_Metric {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5446188147827736620L;

	/**
	 * 
	 */
	public RelativeManhattanDistance() {
		super(new ManhattanDistance());
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.sbml.simulator.math.Relative_N_Metric#setRoot(double)
	 */
	public void setRoot(double root) {
		//root should not be changed
	}
	
}
