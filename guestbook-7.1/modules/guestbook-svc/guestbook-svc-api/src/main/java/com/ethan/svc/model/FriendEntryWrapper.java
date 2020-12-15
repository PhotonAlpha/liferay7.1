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
 * This class is a wrapper for {@link FriendEntry}.
 * </p>
 *
 * @author ethan
 * @see FriendEntry
 * @generated
 */
public class FriendEntryWrapper
	implements FriendEntry, ModelWrapper<FriendEntry> {

	public FriendEntryWrapper(FriendEntry friendEntry) {
		_friendEntry = friendEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return FriendEntry.class;
	}

	@Override
	public String getModelClassName() {
		return FriendEntry.class.getName();
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
		return new FriendEntryWrapper((FriendEntry)_friendEntry.clone());
	}

	@Override
	public int compareTo(FriendEntry friendEntry) {
		return _friendEntry.compareTo(friendEntry);
	}

	/**
	 * Returns the company ID of this friend entry.
	 *
	 * @return the company ID of this friend entry
	 */
	@Override
	public long getCompanyId() {
		return _friendEntry.getCompanyId();
	}

	/**
	 * Returns the create date of this friend entry.
	 *
	 * @return the create date of this friend entry
	 */
	@Override
	public Date getCreateDate() {
		return _friendEntry.getCreateDate();
	}

	/**
	 * Returns the email of this friend entry.
	 *
	 * @return the email of this friend entry
	 */
	@Override
	public String getEmail() {
		return _friendEntry.getEmail();
	}

	/**
	 * Returns the entry ID of this friend entry.
	 *
	 * @return the entry ID of this friend entry
	 */
	@Override
	public long getEntryId() {
		return _friendEntry.getEntryId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _friendEntry.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this friend entry.
	 *
	 * @return the group ID of this friend entry
	 */
	@Override
	public long getGroupId() {
		return _friendEntry.getGroupId();
	}

	/**
	 * Returns the guestbook ID of this friend entry.
	 *
	 * @return the guestbook ID of this friend entry
	 */
	@Override
	public long getGuestbookId() {
		return _friendEntry.getGuestbookId();
	}

	/**
	 * Returns the message of this friend entry.
	 *
	 * @return the message of this friend entry
	 */
	@Override
	public String getMessage() {
		return _friendEntry.getMessage();
	}

	/**
	 * Returns the modified date of this friend entry.
	 *
	 * @return the modified date of this friend entry
	 */
	@Override
	public Date getModifiedDate() {
		return _friendEntry.getModifiedDate();
	}

	/**
	 * Returns the name of this friend entry.
	 *
	 * @return the name of this friend entry
	 */
	@Override
	public String getName() {
		return _friendEntry.getName();
	}

	/**
	 * Returns the primary key of this friend entry.
	 *
	 * @return the primary key of this friend entry
	 */
	@Override
	public long getPrimaryKey() {
		return _friendEntry.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _friendEntry.getPrimaryKeyObj();
	}

	/**
	 * Returns the status of this friend entry.
	 *
	 * @return the status of this friend entry
	 */
	@Override
	public int getStatus() {
		return _friendEntry.getStatus();
	}

	/**
	 * Returns the status by user ID of this friend entry.
	 *
	 * @return the status by user ID of this friend entry
	 */
	@Override
	public long getStatusByUserId() {
		return _friendEntry.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this friend entry.
	 *
	 * @return the status by user name of this friend entry
	 */
	@Override
	public String getStatusByUserName() {
		return _friendEntry.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this friend entry.
	 *
	 * @return the status by user uuid of this friend entry
	 */
	@Override
	public String getStatusByUserUuid() {
		return _friendEntry.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this friend entry.
	 *
	 * @return the status date of this friend entry
	 */
	@Override
	public Date getStatusDate() {
		return _friendEntry.getStatusDate();
	}

	/**
	 * Returns the user ID of this friend entry.
	 *
	 * @return the user ID of this friend entry
	 */
	@Override
	public long getUserId() {
		return _friendEntry.getUserId();
	}

	/**
	 * Returns the user name of this friend entry.
	 *
	 * @return the user name of this friend entry
	 */
	@Override
	public String getUserName() {
		return _friendEntry.getUserName();
	}

	/**
	 * Returns the user uuid of this friend entry.
	 *
	 * @return the user uuid of this friend entry
	 */
	@Override
	public String getUserUuid() {
		return _friendEntry.getUserUuid();
	}

	/**
	 * Returns the uuid of this friend entry.
	 *
	 * @return the uuid of this friend entry
	 */
	@Override
	public String getUuid() {
		return _friendEntry.getUuid();
	}

	@Override
	public int hashCode() {
		return _friendEntry.hashCode();
	}

	/**
	 * Returns <code>true</code> if this friend entry is approved.
	 *
	 * @return <code>true</code> if this friend entry is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return _friendEntry.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _friendEntry.isCachedModel();
	}

	/**
	 * Returns <code>true</code> if this friend entry is denied.
	 *
	 * @return <code>true</code> if this friend entry is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return _friendEntry.isDenied();
	}

	/**
	 * Returns <code>true</code> if this friend entry is a draft.
	 *
	 * @return <code>true</code> if this friend entry is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return _friendEntry.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _friendEntry.isEscapedModel();
	}

	/**
	 * Returns <code>true</code> if this friend entry is expired.
	 *
	 * @return <code>true</code> if this friend entry is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return _friendEntry.isExpired();
	}

	/**
	 * Returns <code>true</code> if this friend entry is inactive.
	 *
	 * @return <code>true</code> if this friend entry is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return _friendEntry.isInactive();
	}

	/**
	 * Returns <code>true</code> if this friend entry is incomplete.
	 *
	 * @return <code>true</code> if this friend entry is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return _friendEntry.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _friendEntry.isNew();
	}

	/**
	 * Returns <code>true</code> if this friend entry is pending.
	 *
	 * @return <code>true</code> if this friend entry is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return _friendEntry.isPending();
	}

	/**
	 * Returns <code>true</code> if this friend entry is scheduled.
	 *
	 * @return <code>true</code> if this friend entry is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return _friendEntry.isScheduled();
	}

	@Override
	public void persist() {
		_friendEntry.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_friendEntry.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this friend entry.
	 *
	 * @param companyId the company ID of this friend entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		_friendEntry.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this friend entry.
	 *
	 * @param createDate the create date of this friend entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_friendEntry.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this friend entry.
	 *
	 * @param email the email of this friend entry
	 */
	@Override
	public void setEmail(String email) {
		_friendEntry.setEmail(email);
	}

	/**
	 * Sets the entry ID of this friend entry.
	 *
	 * @param entryId the entry ID of this friend entry
	 */
	@Override
	public void setEntryId(long entryId) {
		_friendEntry.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_friendEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_friendEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_friendEntry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this friend entry.
	 *
	 * @param groupId the group ID of this friend entry
	 */
	@Override
	public void setGroupId(long groupId) {
		_friendEntry.setGroupId(groupId);
	}

	/**
	 * Sets the guestbook ID of this friend entry.
	 *
	 * @param guestbookId the guestbook ID of this friend entry
	 */
	@Override
	public void setGuestbookId(long guestbookId) {
		_friendEntry.setGuestbookId(guestbookId);
	}

	/**
	 * Sets the message of this friend entry.
	 *
	 * @param message the message of this friend entry
	 */
	@Override
	public void setMessage(String message) {
		_friendEntry.setMessage(message);
	}

	/**
	 * Sets the modified date of this friend entry.
	 *
	 * @param modifiedDate the modified date of this friend entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_friendEntry.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this friend entry.
	 *
	 * @param name the name of this friend entry
	 */
	@Override
	public void setName(String name) {
		_friendEntry.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_friendEntry.setNew(n);
	}

	/**
	 * Sets the primary key of this friend entry.
	 *
	 * @param primaryKey the primary key of this friend entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_friendEntry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_friendEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the status of this friend entry.
	 *
	 * @param status the status of this friend entry
	 */
	@Override
	public void setStatus(int status) {
		_friendEntry.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this friend entry.
	 *
	 * @param statusByUserId the status by user ID of this friend entry
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_friendEntry.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this friend entry.
	 *
	 * @param statusByUserName the status by user name of this friend entry
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_friendEntry.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this friend entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this friend entry
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_friendEntry.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this friend entry.
	 *
	 * @param statusDate the status date of this friend entry
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		_friendEntry.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this friend entry.
	 *
	 * @param userId the user ID of this friend entry
	 */
	@Override
	public void setUserId(long userId) {
		_friendEntry.setUserId(userId);
	}

	/**
	 * Sets the user name of this friend entry.
	 *
	 * @param userName the user name of this friend entry
	 */
	@Override
	public void setUserName(String userName) {
		_friendEntry.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this friend entry.
	 *
	 * @param userUuid the user uuid of this friend entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_friendEntry.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this friend entry.
	 *
	 * @param uuid the uuid of this friend entry
	 */
	@Override
	public void setUuid(String uuid) {
		_friendEntry.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<FriendEntry>
		toCacheModel() {

		return _friendEntry.toCacheModel();
	}

	@Override
	public FriendEntry toEscapedModel() {
		return new FriendEntryWrapper(_friendEntry.toEscapedModel());
	}

	@Override
	public String toString() {
		return _friendEntry.toString();
	}

	@Override
	public FriendEntry toUnescapedModel() {
		return new FriendEntryWrapper(_friendEntry.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _friendEntry.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FriendEntryWrapper)) {
			return false;
		}

		FriendEntryWrapper friendEntryWrapper = (FriendEntryWrapper)object;

		if (Objects.equals(_friendEntry, friendEntryWrapper._friendEntry)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _friendEntry.getStagedModelType();
	}

	@Override
	public FriendEntry getWrappedModel() {
		return _friendEntry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _friendEntry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _friendEntry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_friendEntry.resetOriginalValues();
	}

	private final FriendEntry _friendEntry;

}