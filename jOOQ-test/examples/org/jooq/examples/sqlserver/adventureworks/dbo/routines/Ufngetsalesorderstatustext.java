/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class Ufngetsalesorderstatustext extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = 1435616749;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NVARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Byte> STATUS = createParameter("Status", org.jooq.impl.SQLDataType.TINYINT);

	/**
	 * Create a new routine call instance
	 */
	public Ufngetsalesorderstatustext() {
		super(org.jooq.SQLDialect.SQLSERVER, "ufnGetSalesOrderStatusText", org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO, org.jooq.impl.SQLDataType.NVARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(STATUS);
	}

	/**
	 * Set the <code>Status</code> parameter to the routine
	 */
	public void setStatus(java.lang.Byte value) {
		setValue(STATUS, value);
	}

	/**
	 * Set the <code>Status</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setStatus(org.jooq.Field<java.lang.Byte> field) {
		setField(STATUS, field);
	}
}
