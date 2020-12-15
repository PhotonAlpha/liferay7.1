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

package com.ethan.svc.model.impl;

import com.ethan.svc.model.FriendEntry;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FriendEntry in entity cache.
 *
 * @author ethan
 * @generated
 */
public class FriendEntryCacheModel
	implements CacheModel<FriendEntry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FriendEntryCacheModel)) {
			return false;
		}

		FriendEntryCacheModel friendEntryCacheModel =
			(FriendEntryCacheModel)object;

		if (entryId == friendEntryCacheModel.entryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, entryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", message=");
		sb.append(message);
		sb.append(", guestbookId=");
		sb.append(guestbookId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FriendEntry toEntityModel() {
		FriendEntryImpl friendEntryImpl = new FriendEntryImpl();

		if (uuid == null) {
			friendEntryImpl.setUuid("");
		}
		else {
			friendEntryImpl.setUuid(uuid);
		}

		friendEntryImpl.setEntryId(entryId);

		if (name == null) {
			friendEntryImpl.setName("");
		}
		else {
			friendEntryImpl.setName(name);
		}

		if (email == null) {
			friendEntryImpl.setEmail("");
		}
		else {
			friendEntryImpl.setEmail(email);
		}

		if (message == null) {
			friendEntryImpl.setMessage("");
		}
		else {
			friendEntryImpl.setMessage(message);
		}

		friendEntryImpl.setGuestbookId(guestbookId);
		friendEntryImpl.setGroupId(groupId);
		friendEntryImpl.setCompanyId(companyId);
		friendEntryImpl.setUserId(userId);

		if (userName == null) {
			friendEntryImpl.setUserName("");
		}
		else {
			friendEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			friendEntryImpl.setCreateDate(null);
		}
		else {
			friendEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			friendEntryImpl.setModifiedDate(null);
		}
		else {
			friendEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		friendEntryImpl.setStatus(status);
		friendEntryImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			friendEntryImpl.setStatusByUserName("");
		}
		else {
			friendEntryImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			friendEntryImpl.setStatusDate(null);
		}
		else {
			friendEntryImpl.setStatusDate(new Date(statusDate));
		}

		friendEntryImpl.resetOriginalValues();

		return friendEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		entryId = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		message = objectInput.readUTF();

		guestbookId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(entryId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}

		objectOutput.writeLong(guestbookId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long entryId;
	public String name;
	public String email;
	public String message;
	public long guestbookId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}