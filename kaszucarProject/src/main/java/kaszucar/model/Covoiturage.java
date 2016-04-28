package kaszucar.model;
// Generated 15 mars 2016 00:08:54 by Hibernate Tools 4.3.1.Final


import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Covoiturage generated by hbm2java
 */
@Entity
@Table(name = "covoiturage", schema = "public")
public class Covoiturage implements java.io.Serializable {


  private int idCovoiturage;
  private Cars cars;
  private Preference preference;
  private Date dateFirstTrip;
  private Date dateReturnTrip;
  private String cityFrom;
  private String cityTo;
  private String description;
  private int price;
  private int sitNumber;
  private String sizeOfLuggage;
  private Set<UsersHasCovoiturage> usersHasCovoiturages = new HashSet<UsersHasCovoiturage>(0);
  private Set<CityWaypoints> cityWaypointses = new HashSet<CityWaypoints>(0);

  public Covoiturage() {}


  public Covoiturage(int idCovoiturage, Cars cars, Preference preference, Date dateFirstTrip,
      String cityFrom, String cityTo, int price, int sitNumber, String sizeOfLuggage) {
    this.idCovoiturage = idCovoiturage;
    this.cars = cars;
    this.preference = preference;
    this.dateFirstTrip = dateFirstTrip;
    this.cityFrom = cityFrom;
    this.cityTo = cityTo;
    this.price = price;
    this.sitNumber = sitNumber;
    this.sizeOfLuggage = sizeOfLuggage;
  }

  public Covoiturage(int idCovoiturage, Cars cars, Preference preference, Date dateFirstTrip,
      Date dateReturnTrip, String cityFrom, String cityTo, String description, int price,
      int sitNumber, String sizeOfLuggage, Set<UsersHasCovoiturage> usersHasCovoiturages,
      Set<CityWaypoints> cityWaypointses) {
    this.idCovoiturage = idCovoiturage;
    this.cars = cars;
    this.preference = preference;
    this.dateFirstTrip = dateFirstTrip;
    this.dateReturnTrip = dateReturnTrip;
    this.cityFrom = cityFrom;
    this.cityTo = cityTo;
    this.description = description;
    this.price = price;
    this.sitNumber = sitNumber;
    this.sizeOfLuggage = sizeOfLuggage;
    this.usersHasCovoiturages = usersHasCovoiturages;
    this.cityWaypointses = cityWaypointses;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id_covoiturage", unique = true, nullable = false)
  public int getIdCovoiturage() {
    return this.idCovoiturage;
  }

  public void setIdCovoiturage(int idCovoiturage) {
    this.idCovoiturage = idCovoiturage;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_cars")
  public Cars getCars() {
    return this.cars;
  }

  public void setCars(Cars cars) {
    this.cars = cars;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "preference_id_preference", nullable = false)
  public Preference getPreference() {
    return this.preference;
  }

  public void setPreference(Preference preference) {
    this.preference = preference;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date_first_trip", nullable = false, length = 29)
  public Date getDateFirstTrip() {
    return this.dateFirstTrip;
  }

  public void setDateFirstTrip(Date dateFirstTrip) {
    this.dateFirstTrip = dateFirstTrip;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date_return_trip", length = 29)
  public Date getDateReturnTrip() {
    return this.dateReturnTrip;
  }

  public void setDateReturnTrip(Date dateReturnTrip) {
    this.dateReturnTrip = dateReturnTrip;
  }


  @Column(name = "city_from", nullable = false)
  public String getCityFrom() {
    return this.cityFrom;
  }

  public void setCityFrom(String cityFrom) {
    this.cityFrom = cityFrom;
  }


  @Column(name = "city_to", nullable = false)
  public String getCityTo() {
    return this.cityTo;
  }

  public void setCityTo(String cityTo) {
    this.cityTo = cityTo;
  }


  @Column(name = "description", length = 500)
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Column(name = "price", nullable = false)
  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }


  @Column(name = "sit_number", nullable = false)
  public int getSitNumber() {
    return this.sitNumber;
  }

  public void setSitNumber(int sitNumber) {
    this.sitNumber = sitNumber;
  }


  @Column(name = "size_of_luggage", nullable = false)
  public String getSizeOfLuggage() {
    return this.sizeOfLuggage;
  }

  public void setSizeOfLuggage(String sizeOfLuggage) {
    this.sizeOfLuggage = sizeOfLuggage;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "covoiturage")
  public Set<UsersHasCovoiturage> getUsersHasCovoiturages() {
    return this.usersHasCovoiturages;
  }

  public void setUsersHasCovoiturages(Set<UsersHasCovoiturage> usersHasCovoiturages) {
    this.usersHasCovoiturages = usersHasCovoiturages;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "covoiturage")
  public Set<CityWaypoints> getCityWaypointses() {
    return this.cityWaypointses;
  }

  public void setCityWaypointses(Set<CityWaypoints> cityWaypointses) {
    this.cityWaypointses = cityWaypointses;
  }



}


