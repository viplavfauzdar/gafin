package com.gafinance.db;

// Generated Jul 15, 2013 1:05:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Location generated by hbm2java
 */
public class Location implements java.io.Serializable {

	private Integer id;
	private Integer userId;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String website;
	private String facebook;
	private String googlePlus;
	private String twitter;
	private String linkedin;
	private Date createdate;
	private Date updatedate;
	private Boolean deletedind;

	public Location() {
	}

	public Location(Integer userId, String address, String city, String state,
			String zip, String country, String website, String facebook,
			String googlePlus, String twitter, String linkedin,
			Date createdate, Date updatedate, Boolean deletedind) {
		this.userId = userId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.website = website;
		this.facebook = facebook;
		this.googlePlus = googlePlus;
		this.twitter = twitter;
		this.linkedin = linkedin;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.deletedind = deletedind;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getGooglePlus() {
		return this.googlePlus;
	}

	public void setGooglePlus(String googlePlus) {
		this.googlePlus = googlePlus;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getLinkedin() {
		return this.linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public Boolean getDeletedind() {
		return this.deletedind;
	}

	public void setDeletedind(Boolean deletedind) {
		this.deletedind = deletedind;
	}

}
