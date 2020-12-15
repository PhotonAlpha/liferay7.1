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

package com.ethan.svc.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.ethan.svc.exception.NoSuchFriendEntryException;
import com.ethan.svc.model.FriendEntry;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the friend entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ethan
 * @see FriendEntryUtil
 * @generated
 */
@ProviderType
public interface FriendEntryPersistence extends BasePersistence<FriendEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FriendEntryUtil} to access the friend entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, FriendEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the friend entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching friend entries
	 */
	public java.util.List<FriendEntry> findByUuid(String uuid);

	/**
	 * Returns a range of all the friend entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @return the range of matching friend entries
	 */
	public java.util.List<FriendEntry> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the friend entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching friend entries
	 */
	public java.util.List<FriendEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the friend entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching friend entries
	 */
	public java.util.List<FriendEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first friend entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching friend entry
	 * @throws NoSuchFriendEntryException if a matching friend entry could not be found
	 */
	public FriendEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
				orderByComparator)
		throws NoSuchFriendEntryException;

	/**
	 * Returns the first friend entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching friend entry, or <code>null</code> if a matching friend entry could not be found
	 */
	public FriendEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator);

	/**
	 * Returns the last friend entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching friend entry
	 * @throws NoSuchFriendEntryException if a matching friend entry could not be found
	 */
	public FriendEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
				orderByComparator)
		throws NoSuchFriendEntryException;

	/**
	 * Returns the last friend entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching friend entry, or <code>null</code> if a matching friend entry could not be found
	 */
	public FriendEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator);

	/**
	 * Returns the friend entries before and after the current friend entry in the ordered set where uuid = &#63;.
	 *
	 * @param entryId the primary key of the current friend entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next friend entry
	 * @throws NoSuchFriendEntryException if a friend entry with the primary key could not be found
	 */
	public FriendEntry[] findByUuid_PrevAndNext(
			long entryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
				orderByComparator)
		throws NoSuchFriendEntryException;

	/**
	 * Removes all the friend entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of friend entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching friend entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the friend entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFriendEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching friend entry
	 * @throws NoSuchFriendEntryException if a matching friend entry could not be found
	 */
	public FriendEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchFriendEntryException;

	/**
	 * Returns the friend entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching friend entry, or <code>null</code> if a matching friend entry could not be found
	 */
	public FriendEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the friend entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching friend entry, or <code>null</code> if a matching friend entry could not be found
	 */
	public FriendEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the friend entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the friend entry that was removed
	 */
	public FriendEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchFriendEntryException;

	/**
	 * Returns the number of friend entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching friend entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the friend entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching friend entries
	 */
	public java.util.List<FriendEntry> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the friend entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @return the range of matching friend entries
	 */
	public java.util.List<FriendEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the friend entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching friend entries
	 */
	public java.util.List<FriendEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the friend entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching friend entries
	 */
	public java.util.List<FriendEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first friend entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching friend entry
	 * @throws NoSuchFriendEntryException if a matching friend entry could not be found
	 */
	public FriendEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
				orderByComparator)
		throws NoSuchFriendEntryException;

	/**
	 * Returns the first friend entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching friend entry, or <code>null</code> if a matching friend entry could not be found
	 */
	public FriendEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator);

	/**
	 * Returns the last friend entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching friend entry
	 * @throws NoSuchFriendEntryException if a matching friend entry could not be found
	 */
	public FriendEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
				orderByComparator)
		throws NoSuchFriendEntryException;

	/**
	 * Returns the last friend entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching friend entry, or <code>null</code> if a matching friend entry could not be found
	 */
	public FriendEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator);

	/**
	 * Returns the friend entries before and after the current friend entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param entryId the primary key of the current friend entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next friend entry
	 * @throws NoSuchFriendEntryException if a friend entry with the primary key could not be found
	 */
	public FriendEntry[] findByUuid_C_PrevAndNext(
			long entryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
				orderByComparator)
		throws NoSuchFriendEntryException;

	/**
	 * Removes all the friend entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of friend entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching friend entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the friend entry in the entity cache if it is enabled.
	 *
	 * @param friendEntry the friend entry
	 */
	public void cacheResult(FriendEntry friendEntry);

	/**
	 * Caches the friend entries in the entity cache if it is enabled.
	 *
	 * @param friendEntries the friend entries
	 */
	public void cacheResult(java.util.List<FriendEntry> friendEntries);

	/**
	 * Creates a new friend entry with the primary key. Does not add the friend entry to the database.
	 *
	 * @param entryId the primary key for the new friend entry
	 * @return the new friend entry
	 */
	public FriendEntry create(long entryId);

	/**
	 * Removes the friend entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the friend entry
	 * @return the friend entry that was removed
	 * @throws NoSuchFriendEntryException if a friend entry with the primary key could not be found
	 */
	public FriendEntry remove(long entryId) throws NoSuchFriendEntryException;

	public FriendEntry updateImpl(FriendEntry friendEntry);

	/**
	 * Returns the friend entry with the primary key or throws a <code>NoSuchFriendEntryException</code> if it could not be found.
	 *
	 * @param entryId the primary key of the friend entry
	 * @return the friend entry
	 * @throws NoSuchFriendEntryException if a friend entry with the primary key could not be found
	 */
	public FriendEntry findByPrimaryKey(long entryId)
		throws NoSuchFriendEntryException;

	/**
	 * Returns the friend entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the friend entry
	 * @return the friend entry, or <code>null</code> if a friend entry with the primary key could not be found
	 */
	public FriendEntry fetchByPrimaryKey(long entryId);

	/**
	 * Returns all the friend entries.
	 *
	 * @return the friend entries
	 */
	public java.util.List<FriendEntry> findAll();

	/**
	 * Returns a range of all the friend entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @return the range of friend entries
	 */
	public java.util.List<FriendEntry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the friend entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of friend entries
	 */
	public java.util.List<FriendEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the friend entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FriendEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of friend entries
	 * @param end the upper bound of the range of friend entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of friend entries
	 */
	public java.util.List<FriendEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FriendEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the friend entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of friend entries.
	 *
	 * @return the number of friend entries
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}