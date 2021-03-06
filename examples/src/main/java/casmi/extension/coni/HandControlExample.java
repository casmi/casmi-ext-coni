/*
 *   casmi-ext-coni
 *   https://github.com/casmi/casmi-ext-coni
 *   Copyright (C) 2012, Xcoo, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package casmi.extension.coni;

import casmi.Applet;
import casmi.AppletRunner;
import casmi.KeyEvent;
import casmi.MouseButton;
import casmi.MouseEvent;
import casmi.extension.coni.exception.CONIException;
import casmi.extension.coni.listener.GestureListener;
import casmi.extension.coni.listener.HandListener;
import casmi.graphics.color.ColorSet;
import casmi.graphics.element.Line;
import casmi.graphics.element.Texture;
import casmi.graphics.object.GraphicsObject;
import casmi.matrix.Vertex;

/**
 * CONI (casmi OpenNI) hand control example.
 * <p>
 * This example shows control of pictures by a hand.
 * 
 * @see casmi.extension.coni.CONI#enableGesture(Gesture...)
 * @see casmi.extension.coni.CONI#enableHand()
 * 
 * @author T. Takeuchi
 */
public class HandControlExample extends Applet implements GestureListener, HandListener {

    CONI coni = new CONI();
    GraphicsObject imageGroup = new GraphicsObject();
    Line line = new Line(0, 0, 0, 490);
    
    int select = 0;
    
    @Override
    public void setup() {
        setSize(640, 490);
        
        coni.enableDepth(640, 480, 30);
        coni.enableGesture(Gesture.CLICK);
        coni.enableHand();
        coni.addGestureListener(this);
        coni.addHandListener(this);
        coni.setMirror(true);
        
        addUpdateObject(coni);
        
        line.setStrokeWidth(2);
        line.setStrokeColor(ColorSet.ALICE_BLUE);
        line.hidden();
        addObject(line);
        
        for (int i = 0; i < 6; i++) {
            String filename = String.format("0%1d.jpg", i);
            Texture image = new Texture(HandControlExample.class.getResource(filename));
            image.set(320 + 640 * i, 245, 600, 450);
            imageGroup.add(image);
        }
        addObject(imageGroup);

        Texture tex = coni.getDepthMap().getTexture();
        tex.set(560, 60, 160, 120);
        addObject(tex);
    }

    @Override
    public void update() {}

    @Override
    public void mouseEvent(MouseEvent e, MouseButton b) {}

    @Override
    public void keyEvent(KeyEvent e) {}

    @Override
    public void gestureRecognized(CONI coni, Gesture gesture, Vertex idPosition, Vertex endPosition) {
        try {
            coni.startHandTracking(endPosition);
            coni.removeGesture(Gesture.CLICK);
        } catch (CONIException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void gestureProgress(CONI coni, Gesture gesture, Vertex position, float progress) {}

    @Override
    public void handCreate(CONI coni, int userID, Vertex position, float time) {
        line.visible();
    }

    @Override
    public void handDestroy(CONI coni, int userID, float time) {
        line.hidden();
        coni.addGesture(Gesture.CLICK);
    }

    @Override
    public void handUpdate(CONI coni, int userID, Vertex position, float time) {
        position = coni.convertRealWorldToProjective(position);
        line.set(position.getX(), 0, position.getX(), 490);
        select = (int)position.getX() / (640 / 6);
        imageGroup.setX(-select * 640);
    }
    
    public static void main(String[] args) {
        AppletRunner.run("casmi.extension.coni.HandControlExample", "CONI (casmi OpenNI): Hand Control Example");
    }
    
}
