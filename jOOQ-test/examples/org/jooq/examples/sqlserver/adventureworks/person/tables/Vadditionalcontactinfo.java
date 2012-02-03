/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class Vadditionalcontactinfo extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord> {

	private static final long serialVersionUID = -865746020;

	/**
	 * The singleton instance of vAdditionalContactInfo
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.Vadditionalcontactinfo VADDITIONALCONTACTINFO = new org.jooq.examples.sqlserver.adventureworks.person.tables.Vadditionalcontactinfo();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.Integer> CONTACTID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> MIDDLENAME = createField("MiddleName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> LASTNAME = createField("LastName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> TELEPHONENUMBER = createField("TelephoneNumber", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> TELEPHONESPECIALINSTRUCTIONS = createField("TelephoneSpecialInstructions", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> STREET = createField("Street", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> CITY = createField("City", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> STATEPROVINCE = createField("StateProvince", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> POSTALCODE = createField("PostalCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> COUNTRYREGION = createField("CountryRegion", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> HOMEADDRESSSPECIALINSTRUCTIONS = createField("HomeAddressSpecialInstructions", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> EMAILADDRESS = createField("EMailAddress", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> EMAILSPECIALINSTRUCTIONS = createField("EMailSpecialInstructions", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> EMAILTELEPHONENUMBER = createField("EMailTelephoneNumber", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Vadditionalcontactinfo() {
		super("vAdditionalContactInfo", org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON);
	}

	/**
	 * No further instances allowed
	 */
	private Vadditionalcontactinfo(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON, org.jooq.examples.sqlserver.adventureworks.person.tables.Vadditionalcontactinfo.VADDITIONALCONTACTINFO);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.VadditionalcontactinfoRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_vAdditionalContactInfo;
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.Vadditionalcontactinfo as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.Vadditionalcontactinfo(alias);
	}
}
