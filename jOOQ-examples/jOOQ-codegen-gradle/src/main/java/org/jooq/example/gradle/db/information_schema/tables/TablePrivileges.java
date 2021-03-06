/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablePrivileges extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord> {

	private static final long serialVersionUID = -119131659;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.TablePrivileges TABLE_PRIVILEGES = new org.jooq.example.gradle.db.information_schema.tables.TablePrivileges();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.GRANTOR</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord, java.lang.String> GRANTOR = createField("GRANTOR", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.GRANTEE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord, java.lang.String> GRANTEE = createField("GRANTEE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord, java.lang.String> PRIVILEGE_TYPE = createField("PRIVILEGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord, java.lang.String> IS_GRANTABLE = createField("IS_GRANTABLE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code> table reference
	 */
	public TablePrivileges() {
		this("TABLE_PRIVILEGES", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code> table reference
	 */
	public TablePrivileges(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES);
	}

	private TablePrivileges(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord> aliased) {
		this(alias, aliased, null);
	}

	private TablePrivileges(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.TablePrivilegesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.TablePrivileges as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.TablePrivileges(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.TablePrivileges rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.TablePrivileges(name, null);
	}
}
