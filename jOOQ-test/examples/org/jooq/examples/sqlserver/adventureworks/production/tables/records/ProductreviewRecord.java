/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class ProductreviewRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductreviewRecord> {

	private static final long serialVersionUID = -1098121779;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setProductreviewid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.PRODUCTREVIEWID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getProductreviewid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.PRODUCTREVIEWID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.ProductReview.ProductID]
	 * REFERENCES Product [Production.Product.ProductID]
	 * </pre></code>
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.ProductReview.ProductID]
	 * REFERENCES Product [Production.Product.ProductID]
	 * </pre></code>
	 */
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.PRODUCTID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.ProductReview.ProductID]
	 * REFERENCES Product [Production.Product.ProductID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord fetchProduct() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.PRODUCTID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setReviewername(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.REVIEWERNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getReviewername() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.REVIEWERNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setReviewdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.REVIEWDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getReviewdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.REVIEWDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setEmailaddress(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.EMAILADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getEmailaddress() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.EMAILADDRESS);
	}

	/**
	 * An uncommented item
	 */
	public void setRating(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.RATING, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getRating() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.RATING);
	}

	/**
	 * An uncommented item
	 */
	public void setComments(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.COMMENTS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getComments() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.COMMENTS);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductreviewRecord
	 */
	public ProductreviewRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW);
	}
}
