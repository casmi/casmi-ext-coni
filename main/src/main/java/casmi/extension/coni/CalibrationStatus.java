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

package casmi.extension.coni;

public enum CalibrationStatus {
    
    OK,
    
    NO_USER,
    
    ARM,
    
    LEG,
    
    HEAD,
    
    TORSO,
    
    TOP_FOV,
    
    SIDE_FOV,
    
    POSE,
    
    MANUAL_ABORT,
    
    MANUAL_RESET,
    
    TIMEOUT_FAIL;
    
    static final CalibrationStatus valueOf(org.OpenNI.CalibrationProgressStatus status) {
        switch (status) {
        case OK:
            return OK;
        case NO_USER:
            return NO_USER;
        case ARM:
            return ARM;
        case LEG:
            return LEG;
        case HEAD:
            return HEAD;
        case TORSO:
            return TORSO;
        case TOP_FOV:
            return TOP_FOV;
        case SIDE_FOV:
            return SIDE_FOV;
        case POSE:
            return POSE;
        case MANUAL_ABORT:
            return MANUAL_ABORT;
        case MANUAL_RESET:
            return MANUAL_RESET;
        case TIMEOUT_FAIL:
            return TIMEOUT_FAIL;
        }
        
        return null; // dummy
    }
}
