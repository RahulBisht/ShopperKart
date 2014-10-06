package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the geozone database table.
 * 
 */
@Entity
@NamedQuery(name="Geozone.findAll", query="SELECT g FROM Geozone g")
public class Geozone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="GEOZONE_ID")
	private String geozoneId;

	@Column(name="GEOZONE_CODE")
	private String geozoneCode;

	@Column(name="GEOZONE_NAME")
	private String geozoneName;

	//bi-directional many-to-one association to Country
	@OneToMany(mappedBy="geozone")
	private List<Country> countries;

	//bi-directional many-to-one association to GeozoneDescription
	@OneToMany(mappedBy="geozone")
	private List<GeozoneDescription> geozoneDescriptions;

	public Geozone() {
	}

	public String getGeozoneId() {
		return this.geozoneId;
	}

	public void setGeozoneId(String geozoneId) {
		this.geozoneId = geozoneId;
	}

	public String getGeozoneCode() {
		return this.geozoneCode;
	}

	public void setGeozoneCode(String geozoneCode) {
		this.geozoneCode = geozoneCode;
	}

	public String getGeozoneName() {
		return this.geozoneName;
	}

	public void setGeozoneName(String geozoneName) {
		this.geozoneName = geozoneName;
	}

	public List<Country> getCountries() {
		return this.countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public Country addCountry(Country country) {
		getCountries().add(country);
		country.setGeozone(this);

		return country;
	}

	public Country removeCountry(Country country) {
		getCountries().remove(country);
		country.setGeozone(null);

		return country;
	}

	public List<GeozoneDescription> getGeozoneDescriptions() {
		return this.geozoneDescriptions;
	}

	public void setGeozoneDescriptions(List<GeozoneDescription> geozoneDescriptions) {
		this.geozoneDescriptions = geozoneDescriptions;
	}

	public GeozoneDescription addGeozoneDescription(GeozoneDescription geozoneDescription) {
		getGeozoneDescriptions().add(geozoneDescription);
		geozoneDescription.setGeozone(this);

		return geozoneDescription;
	}

	public GeozoneDescription removeGeozoneDescription(GeozoneDescription geozoneDescription) {
		getGeozoneDescriptions().remove(geozoneDescription);
		geozoneDescription.setGeozone(null);

		return geozoneDescription;
	}

}