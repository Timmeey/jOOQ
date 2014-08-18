/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle4.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthorDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle4.generatedclasses.tables.records.TAuthorRecord, org.jooq.test.oracle4.generatedclasses.tables.pojos.TAuthor, java.lang.Integer> {

	/**
	 * Create a new TAuthorDao without any configuration
	 */
	public TAuthorDao() {
		super(org.jooq.test.oracle4.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.oracle4.generatedclasses.tables.pojos.TAuthor.class);
	}

	/**
	 * Create a new TAuthorDao with an attached configuration
	 */
	public TAuthorDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle4.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.oracle4.generatedclasses.tables.pojos.TAuthor.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle4.generatedclasses.tables.pojos.TAuthor object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle4.generatedclasses.tables.pojos.TAuthor> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle4.generatedclasses.tables.TAuthor.T_AUTHOR.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.oracle4.generatedclasses.tables.pojos.TAuthor fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.oracle4.generatedclasses.tables.TAuthor.T_AUTHOR.ID, value);
	}
}