package tp1;

import java.lang.*;

public class Point2d extends AbstractPoint {
	private static final Integer X = 0;
	private static final Integer Y = 1;

	// TODO creer un point en 2d avec 2 donnees
	public Point2d(Double x, Double y) {
		super(new Double[] { x, y });
	}

	// TODO creer un point a partir d'un vecteur de donnees
	public Point2d(Double[] vector) {
		super(vector);
	}

	public Double X() {
		return vector[X];
	}

	public Double Y() {
		return vector[Y];
	}

	// TODO appliquer la transalation sur la classe courrante et retourner la
	// reference
	@Override
	public Point2d translate(Double[] translateVector) {
		tp1.PointOperator.translate(this.vector, translateVector);
		return this;
	}

	// TODO appliquer la transalation sur la classe courrante et retourner la
	// reference
	public Point2d translate(Point2d translateVector) {
		tp1.PointOperator.translate(this.vector, translateVector.vector);
		return this;
	}

	// TODO appliquer la rotation sur la classe courrante et retourner la reference
	@Override
	public Point2d rotate(Double[][] rotationMatrix) {
		tp1.PointOperator.rotate(this.vector, rotationMatrix);
		return this;
	}

	// TODO appliquer la rotation sur la classe courrante et retourner la reference
	public Point2d rotate(Double angle) {
		tp1.PointOperator.rotate(this.vector,
				new Double[][] { { java.lang.Math.cos(angle), -java.lang.Math.sin(angle) },
						{ java.lang.Math.sin(angle), java.lang.Math.cos(angle) } });
		return this;
	}

	// TODO appliquer la division sur la classe courrante et retourner la reference
	@Override
	public Point2d divide(Double divider) {
		tp1.PointOperator.divide(this.vector, divider);
		return this;
	}

	// TODO appliquer la multiplication sur la classe courrante et retourner la
	// reference
	@Override
	public Point2d multiply(Double multiplier) {
		tp1.PointOperator.multiply(this.vector, multiplier);
		return this;
	}

	// TODO appliquer la addition sur la classe courrante et retourner la reference
	@Override
	public Point2d add(Double adder) {
		tp1.PointOperator.add(this.vector, adder);
		return this;
	}

	// TODO creer un nouveau point.
	@Override
	public Point2d clone() {

		return new Point2d(this.X(), this.Y());
	}
}
