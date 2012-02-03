/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Productmodel extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> {

	private static final long serialVersionUID = -1126060153;

	/**
	 * The singleton instance of ProductModel
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel PRODUCTMODEL = new org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord, java.lang.Integer> PRODUCTMODELID = createField("ProductModelID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord, java.lang.Object> CATALOGDESCRIPTION = createField("CatalogDescription", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord, java.lang.Object> INSTRUCTIONS = createField("Instructions", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Productmodel() {
		super("ProductModel", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Productmodel(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_ProductModel;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductModel_ProductModelID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductModel_ProductModelID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel(alias);
	}
}
