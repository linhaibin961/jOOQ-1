/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
public class Purchaseorderdetail extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord> {

	private static final long serialVersionUID = 660224766;

	/**
	 * The singleton instance of PurchaseOrderDetail
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail PURCHASEORDERDETAIL = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderDetail.PurchaseOrderID]
	 * REFERENCES PurchaseOrderHeader [Purchasing.PurchaseOrderHeader.PurchaseOrderID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.lang.Integer> PURCHASEORDERID = createField("PurchaseOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.lang.Integer> PURCHASEORDERDETAILID = createField("PurchaseOrderDetailID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.sql.Timestamp> DUEDATE = createField("DueDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.lang.Short> ORDERQTY = createField("OrderQty", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.PurchaseOrderDetail.ProductID]
	 * REFERENCES Product [Production.Product.ProductID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.lang.Integer> PRODUCTID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.math.BigDecimal> UNITPRICE = createField("UnitPrice", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.math.BigDecimal> LINETOTAL = createField("LineTotal", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.math.BigDecimal> RECEIVEDQTY = createField("ReceivedQty", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.math.BigDecimal> REJECTEDQTY = createField("RejectedQty", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.math.BigDecimal> STOCKEDQTY = createField("StockedQty", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Purchaseorderdetail() {
		super("PurchaseOrderDetail", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.PURCHASING);
	}

	/**
	 * No further instances allowed
	 */
	private Purchaseorderdetail(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.PURCHASING, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail.PURCHASEORDERDETAIL);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.IDENTITY_PurchaseOrderDetail;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_PurchaseOrderDetail_PurchaseOrderID_PurchaseOrderDetailID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_PurchaseOrderDetail_PurchaseOrderID_PurchaseOrderDetailID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseorderdetailRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_PurchaseOrderDetail_PurchaseOrderHeader_PurchaseOrderID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_PurchaseOrderDetail_Product_ProductID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Purchaseorderdetail(alias);
	}
}
