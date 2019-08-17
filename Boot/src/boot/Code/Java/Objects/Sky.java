/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.EllipseBuilder;
import javafx.scene.shape.RectangleBuilder;
import javafx.scene.transform.Rotate;
/**
 *
 * @author Richardo
 */
public class Sky extends Group{
   final Rotate rx = new Rotate(0,Rotate.X_AXIS);
        final Rotate ry = new Rotate(0,Rotate.Y_AXIS);
        final Rotate rz = new Rotate(0,Rotate.Z_AXIS);
        public Sky(double size, Color color, double shade) {
            getTransforms().addAll(rz, ry, rx);
            getChildren().addAll(
                EllipseBuilder.create() // back face
                    .radiusX(size)
                    .radiusY(size)
                    .fill(color.deriveColor(0.0, 1.0, (1 - 0.5*shade), 1.0))
                    .translateX(-0.5*size)
                    .translateY(-0.5*size)
                    .translateZ(0.5*size)
                    .build()
            );
        }
    }
