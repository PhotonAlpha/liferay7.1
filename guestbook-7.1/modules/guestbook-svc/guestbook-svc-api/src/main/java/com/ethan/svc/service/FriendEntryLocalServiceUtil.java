/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ethan.svc.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for FriendEntry. This utility wraps
 * <code>com.ethan.svc.service.impl.FriendEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ethan
 * @see FriendEntryLocalService
 * @generated
 */
public class FriendEntryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.ethan.svc.service.impl.FriendEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the friend entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FriendEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param friendEntry the friend entry
	 * @return the friend entry that was added
	 */
	public static com.ethan.svc.model.FriendEntry addFriendEntry(
		com.ethan.svc.model.FriendEntry friendEntry) {

		return getService().addFriendEntry(friendEntry);
	}

	/**
	 * Creates a new friend entry with the primary key. Does not add the friend entry to the database.
	 *
	 * @param entryId the primary key for the new friend entry
	 * @return the new friend entry
	 */
	public static com.ethan.svc.model.FriendEntry createFriendEntry(
		long entryId) {

		return getService().createFriendEntry(entryId);
	}

	/**
	 * Deletes the friend entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FriendEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param friendEntry the friend entry
	 * @return the friend entry that was removed
	 */
	public static com.ethan.svc.model.FriendEntry deleteFriendEntry(
		com.ethan.svc.model.FriendEntry friendEntry) {

		return getService().deleteFriendEntry(friendEntry);
	}

	/**
	 * Deletes the friend entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FriendEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entryId the primary key of the friend entry
	 * @return the friend entry that was removed
	 * @throws PortalException if a friend entry with the primary key could not be found
	 */
	public static com.ethan.svc.model.FriendEntry deleteFriendEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteFriendEntry(entryId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ethan.svc.model.impl.FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ethan.svc.model.impl.FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.ethan.svc.model.FriendEntry fetchFriendEntry(
		long entryId) {

		return getService().fetchFriendEntry(entryId);
	}

	/**
	 * Returns the friend entry matching the UUID and group.
	 *
	 * @param uuid the friend entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching friend entry, or <code>null</code> if a matching friend entry could not be found
	 */
	public static com.ethan.svc.model.FriendEntry
		fetchFriendEntryByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchFriendEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns a range of all the friend entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.ethan.svc.model.impl.FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @return the range of friend entries
	 */
	public static java.util.List<com.ethan.svc.model.FriendEntry>
		getFriendEntries(int start, int end) {

		return getService().getFriendEntries(start, end);
	}

	/**
	 * Returns all the friend entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the friend entries
	 * @param companyId the primary key of the company
	 * @return the matching friend entries, or an empty list if no matches were found
	 */
	public static java.util.List<com.ethan.svc.model.FriendEntry>
		getFriendEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getFriendEntriesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of friend entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the friend entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching friend entries, or an empty list if no matches were found
	 */
	public static java.util.List<com.ethan.svc.model.FriendEntry>
		getFriendEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.ethan.svc.model.FriendEntry> orderByComparator) {

		return getService().getFriendEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of friend entries.
	 *
	 * @return the number of friend entries
	 */
	public static int getFriendEntriesCount() {
		return getService().getFriendEntriesCount();
	}

	/**
	 * Returns the friend entry with the primary key.
	 *
	 * @param entryId the primary key of the friend entry
	 * @return the friend entry
	 * @throws PortalException if a friend entry with the primary key could not be found
	 */
	public static com.ethan.svc.model.FriendEntry getFriendEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFriendEntry(entryId);
	}

	/**
	 * Returns the friend entry matching the UUID and group.
	 *
	 * @param uuid the friend entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching friend entry
	 * @throws PortalException if a matching friend entry could not be found
	 */
	public static com.ethan.svc.model.FriendEntry
			getFriendEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getFriendEntryByUuidAndGroupId(uuid, groupId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the friend entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FriendEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param friendEntry the friend entry
	 * @return the friend entry that was updated
	 */
	public static com.ethan.svc.model.FriendEntry updateFriendEntry(
		com.ethan.svc.model.FriendEntry friendEntry) {

		return getService().updateFriendEntry(friendEntry);
	}

	public static FriendEntryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<FriendEntryLocalService, FriendEntryLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FriendEntryLocalService.class);

		ServiceTracker<FriendEntryLocalService, FriendEntryLocalService>
			serviceTracker =
				new ServiceTracker
					<FriendEntryLocalService, FriendEntryLocalService>(
						bundle.getBundleContext(),
						FriendEntryLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}