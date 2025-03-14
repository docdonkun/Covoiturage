package kaszucar.model;
// Generated 26 f�vr. 2016 12:28:55 by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", schema = "public", uniqueConstraints = { @UniqueConstraint(columnNames = "email_adress"), @UniqueConstraint(columnNames = "phone_number") })
public class Users implements java.io.Serializable {
  private static final long serialVersionUID = 1L;
	private int idUsers;
	private Address address;
	private String name;
	private String lastName;
	private Integer phoneNumber;
	private String emailAdress;
	private String password;
	private String ipAddress;
	private String genre;
	private int yearOfBirth;
	private String description;
	private String urlPicture;
	private Set<Opinion> opinionsForIdUsersTo = new HashSet<Opinion>(0);
	private Set<UsersHasCovoiturage> usersHasCovoiturages = new HashSet<UsersHasCovoiturage>(0);
	private Set<Opinion> opinionsForIdUsersFrom = new HashSet<Opinion>(0);
	private Set<UsersHasCars> usersHasCarses = new HashSet<UsersHasCars>(0);

	public Users() {
	}

	public Users(int idUsers, String name, String lastName, String emailAdress, String password, String ipAddress, String genre, int yearOfBirth) {
		this.idUsers = idUsers;
		this.name = name;
		this.lastName = lastName;
		this.emailAdress = emailAdress;
		this.password = password;
		this.ipAddress = ipAddress;
		this.genre = genre;
		this.yearOfBirth = yearOfBirth;
	}

	public Users(int idUsers, Address address, String name, String lastName, Integer phoneNumber, String emailAdress, String password, String ipAddress, String genre, int yearOfBirth, String description, String urlPicture, Set<Opinion> opinionsForIdUsersTo, Set<UsersHasCovoiturage> usersHasCovoiturages, Set<Opinion> opinionsForIdUsersFrom, Set<UsersHasCars> usersHasCarses) {
		this.idUsers = idUsers;
		this.address = address;
		this.name = name;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
		this.password = password;
		this.ipAddress = ipAddress;
		this.genre = genre;
		this.yearOfBirth = yearOfBirth;
		this.description = description;
		this.urlPicture = urlPicture;
		this.opinionsForIdUsersTo = opinionsForIdUsersTo;
		this.usersHasCovoiturages = usersHasCovoiturages;
		this.opinionsForIdUsersFrom = opinionsForIdUsersFrom;
		this.usersHasCarses = usersHasCarses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_users", unique = true, nullable = false)
	public int getIdUsers() {
		return this.idUsers;
	}

	public void setIdUsers(int idUsers) {
		this.idUsers = idUsers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_address")
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "phone_number", unique = true)
	public Integer getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "email_adress", unique = true, nullable = false)
	public String getEmailAdress() {
		return this.emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "ip_address", nullable = false, length = 15)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Column(name = "genre", nullable = false, length = 3)
	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Column(name = "year_of_birth", nullable = false)
	public int getYearOfBirth() {
		return this.yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "url_picture", length = 1024)
	public String getUrlPicture() {
		return this.urlPicture;
	}

	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByIdUsersTo")
	public Set<Opinion> getOpinionsForIdUsersTo() {
		return this.opinionsForIdUsersTo;
	}

	public void setOpinionsForIdUsersTo(Set<Opinion> opinionsForIdUsersTo) {
		this.opinionsForIdUsersTo = opinionsForIdUsersTo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<UsersHasCovoiturage> getUsersHasCovoiturages() {
		return this.usersHasCovoiturages;
	}

	public void setUsersHasCovoiturages(Set<UsersHasCovoiturage> usersHasCovoiturages) {
		this.usersHasCovoiturages = usersHasCovoiturages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByIdUsersFrom")
	public Set<Opinion> getOpinionsForIdUsersFrom() {
		return this.opinionsForIdUsersFrom;
	}

	public void setOpinionsForIdUsersFrom(Set<Opinion> opinionsForIdUsersFrom) {
		this.opinionsForIdUsersFrom = opinionsForIdUsersFrom;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<UsersHasCars> getUsersHasCarses() {
		return this.usersHasCarses;
	}

	public void setUsersHasCarses(Set<UsersHasCars> usersHasCarses) {
		this.usersHasCarses = usersHasCarses;
	}

}
