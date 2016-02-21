package kaszucar.model;
// Generated 11 f�vr. 2016 09:50:26 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UsersHasCars generated by hbm2java
 */
@Entity
@Table(name = "users_has_cars", schema = "public")
public class UsersHasCars implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsersHasCarsId id;

	public UsersHasCars() {
	}

	public UsersHasCars(UsersHasCarsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idUsersHasCarl", column = @Column(name = "id_users_has_carl", nullable = false) ),
			@AttributeOverride(name = "idCars", column = @Column(name = "id_cars", nullable = false) ),
			@AttributeOverride(name = "idUsers", column = @Column(name = "id_users", nullable = false) ) })
	public UsersHasCarsId getId() {
		return this.id;
	}

	public void setId(UsersHasCarsId id) {
		this.id = id;
	}

}
