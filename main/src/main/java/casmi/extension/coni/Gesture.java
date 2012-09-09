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

/**
 * @author T. Takeuchi
 */
public enum Gesture {

    WAVE,
    
    CLICK,
    
    RAISE_HAND,
    
    MOVING_HAND;
    
    static final String toString(Gesture gesture) {
        switch(gesture) {
        case WAVE:
            return "Wave";
        case CLICK:
            return "Click";
        case RAISE_HAND:
            return "RaiseHand";
        case MOVING_HAND:
            return "MovingHand";
        }
        
        return null; // dummy
    }
    
    static final String toString(Gesture[] gestures) {
        StringBuilder sb = new StringBuilder();
        for (Gesture g : gestures) {
            sb.append(toString(g));
            sb.append(',');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    static final Gesture toGesture(String gestureStr) {
        if (gestureStr.equals("Wave")) {
            return Gesture.WAVE;
        } else if (gestureStr.equals("Click")) {
            return Gesture.CLICK;
        } else if (gestureStr.equals("RaiseHand")) {
            return Gesture.RAISE_HAND;
        } else if (gestureStr.equals("MovingHand")) {
            return Gesture.MOVING_HAND;
        }
        
        return null;
    }
}
