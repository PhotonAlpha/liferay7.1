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

package com.ethan.svc.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link GuestbookEntry}.
 * </p>
 *
 * @author ethan
 * @see GuestbookEntry
 * @generated
 */
public class GuestbookEntryWrapper
	implements GuestbookEntry, ModelWrapper<GuestbookEntry> {

	public GuestbookEntryWrapper(GuestbookEntry guestbookEntry) {
		_guestbookEntry = guestbookEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return GuestbookEntry.class;
	}

	@Override
	public String getModelClassName() {
		return GuestbookEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entryId", getEntryId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("message", getMessage());
		attributes.put("guestbookId", getGuestbookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public Object clone() {
		return new GuestbookEntryWrapper(
			(GuestbookEntry)_guestbookEntry.clone());
	}

	@Override
	public int compareTo(GuestbookEntry guestbookEntry) {
		return _guestbookEntry.compareTo(guestbookEntry);
	}

	/**
	 * Returns the company ID of this guestbook entry.
	 *
	 * @return the company ID of this guestbook entry
	 */
	@Override
	public long getCompanyId() {
		return _guestbookEntry.getCompanyId();
	}

	/**
	 * Returns the create date of this guestbook entry.
	 *
	 * @return the create date of this guestbook entry
	 */
	@Override
	public Date getCreateDate() {
		return _guestbookEntry.getCreateDate();
	}

	/**
	 * Returns the email of this guestbook entry.
	 *
	 * @return the email of this guestbook entry
	 */
	@Override
	public String getEmail() {
		return _guestbookEntry.getEmail();
	}

	/**
	 * Returns the entry ID of this guestbook entry.
	 *
	 * @return the entry ID of this guestbook entry
	 */
	@Override
	public long getEntryId() {
		return _guestbookEntry.getEntryId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _guestbookEntry.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this guestbook entry.
	 *
	 * @return the group ID of this guestbook entry
	 */
	@Override
	public long getGroupId() {
		return _guestbookEntry.getGroupId();
	}

	/**
	 * Returns the guestbook ID of this guestbook entry.
	 *
	 * @return the guestbook ID of this guestbook entry
	 */
	@Override
	public long getGuestbookId() {
		return _guestbookEntry.getGuestbookId();
	}

	/**
	 * Returns the message of this guestbook entry.
	 *
	 * @return the message of this guestbook entry
	 */
	@Override
	public String getMessage() {
		return _guestbookEntry.getMessage();
	}

	/**
	 * Returns the modified date of this guestbook entry.
	 *
	 * @return the modified date of this guestbook entry
	 */
	@Override
	public Date getModifiedDate() {
		return _guestbookEntry.getModifiedDate();
	}

	/**
	 * Returns the name of this guestbook entry.
	 *
	 * @return the name of this guestbook entry
	 */
	@Override
	public String getName() {
		return _guestbookEntry.getName();
	}

	/**
	 * Returns the primary key of this guestbook entry.
	 *
	 * @return the primary key of this guestbook entry
	 */
	@Override
	public long getPrimaryKey() {
		return _guestbookEntry.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _guestbookEntry.getPrimaryKeyObj();
	}

	/**
	 * Returns the status of this guestbook entry.
	 *
	 * @return the status of this guestbook entry
	 */
	@Override
	public int getStatus() {
		return _guestbookEntry.getStatus();
	}

	/**
	 * Returns the status by user ID of this guestbook entry.
	 *
	 * @return the status by user ID of this guestbook entry
	 */
	@Override
	public long getStatusByUserId() {
		return _guestbookEntry.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this guestbook entry.
	 *
	 * @return the status by user name of this guestbook entry
	 */
	@Override
	public String getStatusByUserName() {
		return _guestbookEntry.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this guestbook entry.
	 *
	 * @return the status by user uuid of this guestbook entry
	 */
	@Override
	public String getStatusByUserUuid() {
		return _guestbookEntry.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this guestbook entry.
	 *
	 * @return the status date of this guestbook entry
	 */
	@Override
	public Date getStatusDate() {
		return _guestbookEntry.getStatusDate();
	}

	/**
	 * Returns the user ID of this guestbook entry.
	 *
	 * @return the user ID of this guestbook entry
	 */
	@Override
	public long getUserId() {
		return _guestbookEntry.getUserId();
	}

	/**
	 * Returns the user name of this guestbook entry.
	 *
	 * @return the user name of this guestbook entry
	 */
	@Override
	public String getUserName() {
		return _guestbookEntry.getUserName();
	}

	/**
	 * Returns the user uuid of this guestbook entry.
	 *
	 * @return the user uuid of this guestbook entry
	 */
	@Override
	public String getUserUuid() {
		return _guestbookEntry.getUserUuid();
	}

	/**
	 * Returns the uuid of this guestbook entry.
	 *
	 * @return the uuid of this guestbook entry
	 */
	@Override
	public String getUuid() {
		return _guestbookEntry.getUuid();
	}

	@Override
	public int hashCode() {
		return _guestbookEntry.hashCode();
	}

	/**
	 * Returns <code>true</code> if this guestbook entry is approved.
	 *
	 * @return <code>true</code> if this guestbook entry is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return _guestbookEntry.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _guestbookEntry.isCachedModel();
	}

	/**
	 * Returns <code>true</code> if this guestbook entry is denied.
	 *
	 * @return <code>true</code> if this guestbook entry is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return _guestbookEntry.isDenied();
	}

	/**
	 * Returns <code>true</code> if this guestbook entry is a draft.
	 *
	 * @return <code>true</code> if this guestbook entry is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return _guestbookEntry.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _guestbookEntry.isEscapedModel();
	}

	/**
	 * Returns <code>true</code> if this guestbook entry is expired.
	 *
	 * @return <code>true</code> if this guestbook entry is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return _guestbookEntry.isExpired();
	}

	/**
	 * Returns <code>true</code> if this guestbook entry is inactive.
	 *
	 * @return <code>true</code> if this guestbook entry is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return _guestbookEntry.isInactive();
	}

	/**
	 * Returns <code>true</code> if this guestbook entry is incomplete.
	 *
	 * @return <code>true</code> if this guestbook entry is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return _guestbookEntry.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _guestbookEntry.isNew();
	}

	/**
	 * Returns <code>true</code> if this guestbook entry is pending.
	 *
	 * @return <code>true</code> if this guestbook entry is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return _guestbookEntry.isPending();
	}

	/**
	 * Returns <code>true</code> if this guestbook entry is scheduled.
	 *
	 * @return <code>true</code> if this guestbook entry is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return _guestbookEntry.isScheduled();
	}

	@Override
	public void persist() {
		_guestbookEntry.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_guestbookEntry.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this guestbook entry.
	 *
	 * @param companyId the company ID of this guestbook entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		_guestbookEntry.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this guestbook entry.
	 *
	 * @param createDate the create date of this guestbook entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_guestbookEntry.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this guestbook entry.
	 *
	 * @param email the email of this guestbook entry
	 */
	@Override
	public void setEmail(String email) {
		_guestbookEntry.setEmail(email);
	}

	/**
	 * Sets the entry ID of this guestbook entry.
	 *
	 * @param entryId the entry ID of this guestbook entry
	 */
	@Override
	public void setEntryId(long entryId) {
		_guestbookEntry.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_guestbookEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_guestbookEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_guestbookEntry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this guestbook entry.
	 *
	 * @param groupId the group ID of this guestbook entry
	 */
	@Override
	public void setGroupId(long groupId) {
		_guestbookEntry.setGroupId(groupId);
	}

	/**
	 * Sets the guestbook ID of this guestbook entry.
	 *
	 * @param guestbookId the guestbook ID of this guestbook entry
	 */
	@Override
	public void setGuestbookId(long guestbookId) {
		_guestbookEntry.setGuestbookId(guestbookId);
	}

	/**
	 * Sets the message of this guestbook entry.
	 *
	 * @param message the message of this guestbook entry
	 */
	@Override
	public void setMessage(String message) {
		_guestbookEntry.setMessage(message);
	}

	/**
	 * Sets the modified date of this guestbook entry.
	 *
	 * @param modifiedDate the modified date of this guestbook entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_guestbookEntry.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this guestbook entry.
	 *
	 * @param name the name of this guestbook entry
	 */
	@Override
	public void setName(String name) {
		_guestbookEntry.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_guestbookEntry.setNew(n);
	}

	/**
	 * Sets the primary key of this guestbook entry.
	 *
	 * @param primaryKey the primary key of this guestbook entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_guestbookEntry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_guestbookEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the status of this guestbook entry.
	 *
	 * @param status the status of this guestbook entry
	 */
	@Override
	public void setStatus(int status) {
		_guestbookEntry.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this guestbook entry.
	 *
	 * @param statusByUserId the status by user ID of this guestbook entry
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_guestbookEntry.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this guestbook entry.
	 *
	 * @param statusByUserName the status by user name of this guestbook entry
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_guestbookEntry.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this guestbook entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this guestbook entry
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_guestbookEntry.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this guestbook entry.
	 *
	 * @param statusDate the status date of this guestbook entry
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		_guestbookEntry.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this guestbook entry.
	 *
	 * @param userId the user ID of this guestbook entry
	 */
	@Override
	public void setUserId(long userId) {
		_guestbookEntry.setUserId(userId);
	}

	/**
	 * Sets the user name of this guestbook entry.
	 *
	 * @param userName the user name of this guestbook entry
	 */
	@Override
	public void setUserName(String userName) {
		_guestbookEntry.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this guestbook entry.
	 *
	 * @param userUuid the user uuid of this guestbook entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_guestbookEntry.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this guestbook entry.
	 *
	 * @param uuid the uuid of this guestbook entry
	 */
	@Override
	public void setUuid(String uuid) {
		_guestbookEntry.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<GuestbookEntry>
		toCacheModel() {

		return _guestbookEntry.toCacheModel();
	}

	@Override
	public GuestbookEntry toEscapedModel() {
		return new GuestbookEntryWrapper(_guestbookEntry.toEscapedModel());
	}

	@Override
	public String toString() {
		return _guestbookEntry.toString();
	}

	@Override
	public GuestbookEntry toUnescapedModel() {
		return new GuestbookEntryWrapper(_guestbookEntry.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _guestbookEntry.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GuestbookEntryWrapper)) {
			return false;
		}

		GuestbookEntryWrapper guestbookEntryWrapper =
			(GuestbookEntryWrapper)object;

		if (Objects.equals(
				_guestbookEntry, guestbookEntryWrapper._guestbookEntry)) {

			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _guestbookEntry.getStagedModelType();
	}

	@Override
	public GuestbookEntry getWrappedModel() {
		return _guestbookEntry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _guestbookEntry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _guestbookEntry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_guestbookEntry.resetOriginalValues();
	}

	private final GuestbookEntry _guestbookEntry;

}