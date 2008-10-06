/**
 * 
 */
package toxi.physics;

import toxi.geom.Vec3D;

/**
 * @author toxi
 * 
 */
public class YAxisConstraint implements IParticleConstraint {

	private Vec3D constraint;

	public YAxisConstraint(Vec3D constraint) {
		this.constraint = constraint;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see toxi.physics.IParticleConstraint#apply(toxi.physics.VerletParticle)
	 */
	public void apply(VerletParticle p) {
		p.x = constraint.x;
		p.z = constraint.z;
	}

}
