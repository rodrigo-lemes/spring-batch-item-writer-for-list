package com.rodrigo.soukef.batch.domain;

public class CatalogColor {

	//private Long id;
	private String className;
	private String value;
	private String description;
	private Long id_catalog;

	/**
	 * @return the id
	 *//*
	public Long getId() {
		return id;
	}

	*//**
	 * @param id
	 *            the id to set
	 *//*
	public void setId(Long id) {
		this.id = id;
	}*/

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className
	 *            the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the id_catalog
	 */
	public Long getId_catalog() {
		return id_catalog;
	}

	/**
	 * @param id_catalog
	 *            the id_catalog to set
	 */
	public void setId_catalog(Long id_catalog) {
		this.id_catalog = id_catalog;
	}

}
