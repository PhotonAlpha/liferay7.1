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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FriendEntryLocalService}.
 *
 * @author ethan
 * @see FriendEntryLocalService
 * @generated
 */
public class FriendEntryLocalServiceWrapper
	implements FriendEntryLocalService,
			   ServiceWrapper<FriendEntryLocalService> {

	public FriendEntryLocalServiceWrapper(
		FriendEntryLocalService friendEntryLocalService) {

		_friendEntryLocalService = friendEntryLocalService;
	}

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
	@Override
	public com.ethan.svc.model.FriendEntry addFriendEntry(
		com.ethan.svc.model.FriendEntry friendEntry) {

		return _friendEntryLocalService.addFriendEntry(friendEntry);
	}

	/**
	 * Creates a new friend entry with the primary key. Does not add the friend entry to the database.
	 *
	 * @param entryId the primary key for the new friend entry
	 * @return the new friend entry
	 */
	@Override
	public com.ethan.svc.model.FriendEntry createFriendEntry(long entryId) {
		return _friendEntryLocalService.createFriendEntry(entryId);
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
	@Override
	public com.ethan.svc.model.FriendEntry deleteFriendEntry(
		com.ethan.svc.model.FriendEntry friendEntry) {

		return _friendEntryLocalService.deleteFriendEntry(friendEntry);
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
	@Override
	public com.ethan.svc.model.FriendEntry deleteFriendEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _friendEntryLocalService.deleteFriendEntry(entryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _friendEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _friendEntryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _friendEntryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _friendEntryLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _friendEntryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _friendEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _friendEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.ethan.svc.model.FriendEntry fetchFriendEntry(long entryId) {
		return _friendEntryLocalService.fetchFriendEntry(entryId);
	}

	/**
	 * Returns the friend entry matching the UUID and group.
	 *
	 * @param uuid the friend entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching friend entry, or <code>null</code> if a matching friend entry could not be found
	 */
	@Override
	public com.ethan.svc.model.FriendEntry fetchFriendEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return _friendEntryLocalService.fetchFriendEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _friendEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _friendEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
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
	@Override
	public java.util.List<com.ethan.svc.model.FriendEntry> getFriendEntries(
		int start, int end) {

		return _friendEntryLocalService.getFriendEntries(start, end);
	}

	/**
	 * Returns all the friend entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the friend entries
	 * @param companyId the primary key of the company
	 * @return the matching friend entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.ethan.svc.model.FriendEntry>
		getFriendEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _friendEntryLocalService.getFriendEntriesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.ethan.svc.model.FriendEntry>
		getFriendEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.ethan.svc.model.FriendEntry> orderByComparator) {

		return _friendEntryLocalService.getFriendEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of friend entries.
	 *
	 * @return the number of friend entries
	 */
	@Override
	public int getFriendEntriesCount() {
		return _friendEntryLocalService.getFriendEntriesCount();
	}

	/**
	 * Returns the friend entry with the primary key.
	 *
	 * @param entryId the primary key of the friend entry
	 * @return the friend entry
	 * @throws PortalException if a friend entry with the primary key could not be found
	 */
	@Override
	public com.ethan.svc.model.FriendEntry getFriendEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _friendEntryLocalService.getFriendEntry(entryId);
	}

	/**
	 * Returns the friend entry matching the UUID and group.
	 *
	 * @param uuid the friend entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching friend entry
	 * @throws PortalException if a matching friend entry could not be found
	 */
	@Override
	public com.ethan.svc.model.FriendEntry getFriendEntryByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _friendEntryLocalService.getFriendEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _friendEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _friendEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _friendEntryLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.ethan.svc.model.FriendEntry updateFriendEntry(
		com.ethan.svc.model.FriendEntry friendEntry) {

		return _friendEntryLocalService.updateFriendEntry(friendEntry);
	}

	@Override
	public FriendEntryLocalService getWrappedService() {
		return _friendEntryLocalService;
	}

	@Override
	public void setWrappedService(
		FriendEntryLocalService friendEntryLocalService) {

		_friendEntryLocalService = friendEntryLocalService;
	}

	private FriendEntryLocalService _friendEntryLocalService;

}