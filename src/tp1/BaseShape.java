package tp1;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape implements Cloneable {
    private Collection<Point2d> coords;

    // TODO Initialiser la liste de points .
    public BaseShape() {
        coords = new ArrayList();
    }

    // TODO prendre une liste de points et creer une nouvelle forme.
    public BaseShape(Collection<Point2d> coords) {
        this.coords = coords;
    }

    // TODO ajouter ou retirer des coordonnees a la liste de points.
    public BaseShape add(Point2d coord) {
        this.coords.add(coord);
        return this;
    }
    // TODO A FAIRE PLUS TARD
    public BaseShape add(BaseShape shape) {

        return null;
    }
    public BaseShape addAll(Collection<Point2d> coords) {
        this.coords.addAll(coords);
        return this;
    }
    public BaseShape remove(Point2d coord) {
        this.coords.remove(coord);
        return this;
    }
    // TODO A PLUS TARD
    public BaseShape remove(BaseShape shape) {
        // ...
        return null;
    }
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return this;
    }

    // TODO retourner les coordonnees de la liste.
    public Collection<Point2d> getCoords() {
        
        return this.coords;
    }

    // TODO retourner une nouvelle liste ou tous les points sont des copy
    public Collection<Point2d> getCoordsDeepCopy() {
        Collection<Point2d> CollectionTemp = new ArrayList();
        for(Point2d point : this.coords){CollectionTemp.add(point.clone());}
        return CollectionTemp;
    }
        
    // TODO appliquer la translation sur la forme.
    public BaseShape translate(Point2d point) {
        for (Point2d PointTemp : this.coords){
            PointTemp.translate(point);
        }
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    public BaseShape rotate(Double angle) {
        for (Point2d PointTemp : this.coords){
            PointTemp.rotate(angle);
        }
        return this;
    }

    // TODO donner la plus grande valeur en X
    public Double getMaxX() {
        Double Maxx = 0.0;
        for (Point2d PointTemp : this.coords){
            if (PointTemp.X() > Maxx){
                Maxx = PointTemp.X();
            }
        }
        return Maxx;
    }

    // TODO donner la plus grande valeur en Y
    public Double getMaxY() {
        Double Maxy = 0.0;
        for (Point2d PointTemp : this.coords){
            if (PointTemp.Y() > Maxy){
                Maxy = PointTemp.Y();
            }
        }
        return Maxy;
    }


    // TODO donner les plus grandes valeurs en X et Y
    public Point2d getMaxCoord() {

        return new Point2d(getMaxX(),getMaxY());
    }

    // TODO donner la plus petite valeur en X
    public Double getMinX() {
        Double Minx = this.coords.stream().findFirst().get().X();
        for (Point2d PointTemp : this.coords){
            if (PointTemp.X() < Minx){
                Minx = PointTemp.X();
            }
        }
        return Minx;

    }
    // TODO donner la plus petite valeur en Y
    public Double getMinY() {
        Double Miny = this.coords.stream().findFirst().get().Y();
        for (Point2d PointTemp : this.coords){
            if (PointTemp.Y() < Miny){
                Miny = PointTemp.Y();
            }
        }
        return Miny;

    }

    // TODO donner les plus petites valeurs en X et Y
    public Point2d getMinCoord() {
        return new Point2d(getMinX(),getMinY());
    }

    // TODO retourner une nouvelle forme.
    public BaseShape clone() {
        return this;
    }
}
