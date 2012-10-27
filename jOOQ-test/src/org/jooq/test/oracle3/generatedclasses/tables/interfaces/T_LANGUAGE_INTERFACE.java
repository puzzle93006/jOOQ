/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_LANGUAGE", schema = "TEST")
public interface T_LANGUAGE_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * The language ISO code
	 */
	public void setCD(java.lang.String value);

	/**
	 * The language ISO code
	 */
	@javax.persistence.Column(name = "CD", nullable = false, length = 2)
	public java.lang.String getCD();

	/**
	 * The language description
	 */
	public void setDESCRIPTION(java.lang.String value);

	/**
	 * The language description
	 */
	@javax.persistence.Column(name = "DESCRIPTION", length = 50)
	public java.lang.String getDESCRIPTION();

	/**
	 * The table column <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	public void setDESCRIPTION_ENGLISH(java.lang.String value);

	/**
	 * The table column <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	@javax.persistence.Column(name = "DESCRIPTION_ENGLISH", length = 50)
	public java.lang.String getDESCRIPTION_ENGLISH();

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setID(java.lang.Integer value);

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();
}