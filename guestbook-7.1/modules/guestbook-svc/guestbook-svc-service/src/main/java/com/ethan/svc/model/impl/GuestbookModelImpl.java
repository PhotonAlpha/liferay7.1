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

import com.ethan.svc.model.Guestbook;
import com.ethan.svc.model.GuestbookModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Guestbook service. Represents a row in the &quot;gb_Guestbook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>GuestbookModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GuestbookImpl}.
 * </p>
 *
 * @author ethan
 * @see GuestbookImpl
 * @generated
 */
public class GuestbookModelImpl
	extends BaseModelImpl<Guestbook> implements GuestbookModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a guestbook model instance should use the <code>Guestbook</code> interface instead.
	 */
	public static final String TABLE_NAME = "gb_Guestbook";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"guestbookId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"status", Types.INTEGER},
		{"statusByUserId", Types.BIGINT}, {"statusByUserName", Types.VARCHAR},
		{"statusDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("guestbookId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statusByUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("statusByUserName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table gb_Guestbook (uuid_ VARCHAR(75) null,guestbookId LONG not null primary key,name VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table gb_Guestbook";

	public static final String ORDER_BY_JPQL =
		" ORDER BY guestbook.guestbookId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY gb_Guestbook.guestbookId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.ethan.svc.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.ethan.svc.model.Guestbook"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.ethan.svc.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.ethan.svc.model.Guestbook"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.ethan.svc.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.ethan.svc.model.Guestbook"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long GUESTBOOKID_COLUMN_BITMASK = 8L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.ethan.svc.service.util.ServiceProps.get(
			"lock.expiration.time.com.ethan.svc.model.Guestbook"));

	public GuestbookModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _guestbookId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGuestbookId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _guestbookId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Guestbook.class;
	}

	@Override
	public String getModelClassName() {
		return Guestbook.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Guestbook, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Guestbook, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Guestbook, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Guestbook)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Guestbook, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Guestbook, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Guestbook)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Guestbook, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Guestbook, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Guestbook>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Guestbook.class.getClassLoader(), Guestbook.class,
			ModelWrapper.class);

		try {
			Constructor<Guestbook> constructor =
				(Constructor<Guestbook>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Guestbook, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Guestbook, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Guestbook, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Guestbook, Object>>();
		Map<String, BiConsumer<Guestbook, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Guestbook, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(Guestbook guestbook, Object uuidObject) {
					guestbook.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"guestbookId",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getGuestbookId();
				}

			});
		attributeSetterBiConsumers.put(
			"guestbookId",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(
					Guestbook guestbook, Object guestbookIdObject) {

					guestbook.setGuestbookId((Long)guestbookIdObject);
				}

			});
		attributeGetterFunctions.put(
			"name",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getName();
				}

			});
		attributeSetterBiConsumers.put(
			"name",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(Guestbook guestbook, Object nameObject) {
					guestbook.setName((String)nameObject);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(Guestbook guestbook, Object groupIdObject) {
					guestbook.setGroupId((Long)groupIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(
					Guestbook guestbook, Object companyIdObject) {

					guestbook.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(Guestbook guestbook, Object userIdObject) {
					guestbook.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(Guestbook guestbook, Object userNameObject) {
					guestbook.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(
					Guestbook guestbook, Object createDateObject) {

					guestbook.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(
					Guestbook guestbook, Object modifiedDateObject) {

					guestbook.setModifiedDate((Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"status",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getStatus();
				}

			});
		attributeSetterBiConsumers.put(
			"status",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(Guestbook guestbook, Object statusObject) {
					guestbook.setStatus((Integer)statusObject);
				}

			});
		attributeGetterFunctions.put(
			"statusByUserId",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getStatusByUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"statusByUserId",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(
					Guestbook guestbook, Object statusByUserIdObject) {

					guestbook.setStatusByUserId((Long)statusByUserIdObject);
				}

			});
		attributeGetterFunctions.put(
			"statusByUserName",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getStatusByUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"statusByUserName",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(
					Guestbook guestbook, Object statusByUserNameObject) {

					guestbook.setStatusByUserName(
						(String)statusByUserNameObject);
				}

			});
		attributeGetterFunctions.put(
			"statusDate",
			new Function<Guestbook, Object>() {

				@Override
				public Object apply(Guestbook guestbook) {
					return guestbook.getStatusDate();
				}

			});
		attributeSetterBiConsumers.put(
			"statusDate",
			new BiConsumer<Guestbook, Object>() {

				@Override
				public void accept(
					Guestbook guestbook, Object statusDateObject) {

					guestbook.setStatusDate((Date)statusDateObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getGuestbookId() {
		return _guestbookId;
	}

	@Override
	public void setGuestbookId(long guestbookId) {
		_guestbookId = guestbookId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getStatusByUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
	}

	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return "";
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Guestbook.class.getName()));
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Guestbook.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Guestbook toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Guestbook>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		GuestbookImpl guestbookImpl = new GuestbookImpl();

		guestbookImpl.setUuid(getUuid());
		guestbookImpl.setGuestbookId(getGuestbookId());
		guestbookImpl.setName(getName());
		guestbookImpl.setGroupId(getGroupId());
		guestbookImpl.setCompanyId(getCompanyId());
		guestbookImpl.setUserId(getUserId());
		guestbookImpl.setUserName(getUserName());
		guestbookImpl.setCreateDate(getCreateDate());
		guestbookImpl.setModifiedDate(getModifiedDate());
		guestbookImpl.setStatus(getStatus());
		guestbookImpl.setStatusByUserId(getStatusByUserId());
		guestbookImpl.setStatusByUserName(getStatusByUserName());
		guestbookImpl.setStatusDate(getStatusDate());

		guestbookImpl.resetOriginalValues();

		return guestbookImpl;
	}

	@Override
	public int compareTo(Guestbook guestbook) {
		long primaryKey = guestbook.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Guestbook)) {
			return false;
		}

		Guestbook guestbook = (Guestbook)object;

		long primaryKey = guestbook.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		_originalUuid = _uuid;

		_originalGroupId = _groupId;

		_setOriginalGroupId = false;

		_originalCompanyId = _companyId;

		_setOriginalCompanyId = false;

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Guestbook> toCacheModel() {
		GuestbookCacheModel guestbookCacheModel = new GuestbookCacheModel();

		guestbookCacheModel.uuid = getUuid();

		String uuid = guestbookCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			guestbookCacheModel.uuid = null;
		}

		guestbookCacheModel.guestbookId = getGuestbookId();

		guestbookCacheModel.name = getName();

		String name = guestbookCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			guestbookCacheModel.name = null;
		}

		guestbookCacheModel.groupId = getGroupId();

		guestbookCacheModel.companyId = getCompanyId();

		guestbookCacheModel.userId = getUserId();

		guestbookCacheModel.userName = getUserName();

		String userName = guestbookCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			guestbookCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			guestbookCacheModel.createDate = createDate.getTime();
		}
		else {
			guestbookCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			guestbookCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			guestbookCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		guestbookCacheModel.status = getStatus();

		guestbookCacheModel.statusByUserId = getStatusByUserId();

		guestbookCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = guestbookCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			guestbookCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			guestbookCacheModel.statusDate = statusDate.getTime();
		}
		else {
			guestbookCacheModel.statusDate = Long.MIN_VALUE;
		}

		return guestbookCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Guestbook, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Guestbook, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Guestbook, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Guestbook)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Guestbook, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Guestbook, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Guestbook, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Guestbook)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Guestbook>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _guestbookId;
	private String _name;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private long _columnBitmask;
	private Guestbook _escapedModel;

}