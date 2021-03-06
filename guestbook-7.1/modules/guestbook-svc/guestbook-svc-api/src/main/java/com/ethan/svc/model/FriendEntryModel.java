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

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the FriendEntry service. Represents a row in the &quot;gb_FriendEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.ethan.svc.model.impl.FriendEntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.ethan.svc.model.impl.FriendEntryImpl</code>.
 * </p>
 *
 * @author ethan
 * @see FriendEntry
 * @generated
 */
@ProviderType
public interface FriendEntryModel
	extends BaseModel<FriendEntry>, GroupedModel, ShardedModel,
			StagedAuditedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a friend entry model instance should use the {@link FriendEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this friend entry.
	 *
	 * @return the primary key of this friend entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this friend entry.
	 *
	 * @param primaryKey the primary key of this friend entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this friend entry.
	 *
	 * @return the uuid of this friend entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this friend entry.
	 *
	 * @param uuid the uuid of this friend entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the entry ID of this friend entry.
	 *
	 * @return the entry ID of this friend entry
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this friend entry.
	 *
	 * @param entryId the entry ID of this friend entry
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the name of this friend entry.
	 *
	 * @return the name of this friend entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this friend entry.
	 *
	 * @param name the name of this friend entry
	 */
	public void setName(String name);

	/**
	 * Returns the email of this friend entry.
	 *
	 * @return the email of this friend entry
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this friend entry.
	 *
	 * @param email the email of this friend entry
	 */
	public void setEmail(String email);

	/**
	 * Returns the message of this friend entry.
	 *
	 * @return the message of this friend entry
	 */
	@AutoEscape
	public String getMessage();

	/**
	 * Sets the message of this friend entry.
	 *
	 * @param message the message of this friend entry
	 */
	public void setMessage(String message);

	/**
	 * Returns the guestbook ID of this friend entry.
	 *
	 * @return the guestbook ID of this friend entry
	 */
	public long getGuestbookId();

	/**
	 * Sets the guestbook ID of this friend entry.
	 *
	 * @param guestbookId the guestbook ID of this friend entry
	 */
	public void setGuestbookId(long guestbookId);

	/**
	 * Returns the group ID of this friend entry.
	 *
	 * @return the group ID of this friend entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this friend entry.
	 *
	 * @param groupId the group ID of this friend entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this friend entry.
	 *
	 * @return the company ID of this friend entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this friend entry.
	 *
	 * @param companyId the company ID of this friend entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this friend entry.
	 *
	 * @return the user ID of this friend entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this friend entry.
	 *
	 * @param userId the user ID of this friend entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this friend entry.
	 *
	 * @return the user uuid of this friend entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this friend entry.
	 *
	 * @param userUuid the user uuid of this friend entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this friend entry.
	 *
	 * @return the user name of this friend entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this friend entry.
	 *
	 * @param userName the user name of this friend entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this friend entry.
	 *
	 * @return the create date of this friend entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this friend entry.
	 *
	 * @param createDate the create date of this friend entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this friend entry.
	 *
	 * @return the modified date of this friend entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this friend entry.
	 *
	 * @param modifiedDate the modified date of this friend entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this friend entry.
	 *
	 * @return the status of this friend entry
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this friend entry.
	 *
	 * @param status the status of this friend entry
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this friend entry.
	 *
	 * @return the status by user ID of this friend entry
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this friend entry.
	 *
	 * @param statusByUserId the status by user ID of this friend entry
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this friend entry.
	 *
	 * @return the status by user uuid of this friend entry
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this friend entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this friend entry
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this friend entry.
	 *
	 * @return the status by user name of this friend entry
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this friend entry.
	 *
	 * @param statusByUserName the status by user name of this friend entry
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this friend entry.
	 *
	 * @return the status date of this friend entry
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this friend entry.
	 *
	 * @param statusDate the status date of this friend entry
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this friend entry is approved.
	 *
	 * @return <code>true</code> if this friend entry is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this friend entry is denied.
	 *
	 * @return <code>true</code> if this friend entry is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this friend entry is a draft.
	 *
	 * @return <code>true</code> if this friend entry is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this friend entry is expired.
	 *
	 * @return <code>true</code> if this friend entry is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this friend entry is inactive.
	 *
	 * @return <code>true</code> if this friend entry is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this friend entry is incomplete.
	 *
	 * @return <code>true</code> if this friend entry is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this friend entry is pending.
	 *
	 * @return <code>true</code> if this friend entry is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this friend entry is scheduled.
	 *
	 * @return <code>true</code> if this friend entry is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(FriendEntry friendEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<FriendEntry> toCacheModel();

	@Override
	public FriendEntry toEscapedModel();

	@Override
	public FriendEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}