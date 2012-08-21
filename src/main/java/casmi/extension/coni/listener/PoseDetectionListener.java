/*
 *   casmi-ext-coni
 *   https://github.com/casmi/casmi-ext-coni
 *   Copyright (C) 2012, Xcoo, Inc.
 *
 *  casmi is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package casmi.extension.coni.listener;

import casmi.extension.coni.CONI;

/**
 * PoseDetectionListener interface.
 * 
 * @author T. Takeuchi
 */
public interface PoseDetectionListener {
    
    void outOfPose(CONI coni);
    
    void poseDetected(CONI coni, String pose, int userID);
    
    void poseDetectionInProgress(CONI coni, int userID);
}
