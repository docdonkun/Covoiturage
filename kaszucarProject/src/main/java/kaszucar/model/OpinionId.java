package kaszucar.model;
// Generated 11 f�vr. 2016 09:50:26 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OpinionId generated by hbm2java
 */
@Embeddable
public class OpinionId implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idOpinion;
	private int idUsersFrom;
	private int idUsersTo;

	public OpinionId() {
	}

	public OpinionId(int idOpinion, int idUsersFrom, int idUsersTo) {
		this.idOpinion = idOpinion;
		this.idUsersFrom = idUsersFrom;
		this.idUsersTo = idUsersTo;
	}

	@Column(name = "id_opinion", nullable = false)
	public int getIdOpinion() {
		return this.idOpinion;
	}

	public void setIdOpinion(int idOpinion) {
		this.idOpinion = idOpinion;
	}

	@Column(name = "id_users_from", nullable = false)
	public int getIdUsersFrom() {
		return this.idUsersFrom;
	}

	public void setIdUsersFrom(int idUsersFrom) {
		this.idUsersFrom = idUsersFrom;
	}

	@Column(name = "id_users_to", nullable = false)
	public int getIdUsersTo() {
		return this.idUsersTo;
	}

	public void setIdUsersTo(int idUsersTo) {
		this.idUsersTo = idUsersTo;
	}

	public boolean equals(Object other) {
		if ((this == other)) return true;
		if ((other == null)) return false;
		if (!(other instanceof OpinionId)) return false;
		OpinionId castOther = (OpinionId) other;

		return (this.getIdOpinion() == castOther.getIdOpinion())
				&& (this.getIdUsersFrom() == castOther.getIdUsersFrom())
				&& (this.getIdUsersTo() == castOther.getIdUsersTo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdOpinion();
		result = 37 * result + this.getIdUsersFrom();
		result = 37 * result + this.getIdUsersTo();
		return result;
	}

}
