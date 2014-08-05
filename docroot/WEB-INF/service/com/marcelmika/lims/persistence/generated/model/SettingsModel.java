/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.marcelmika.lims.persistence.generated.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Settings service. Represents a row in the &quot;lims_Settings&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.marcelmika.lims.persistence.generated.model.impl.SettingsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.marcelmika.lims.persistence.generated.model.impl.SettingsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Settings
 * @see com.marcelmika.lims.persistence.generated.model.impl.SettingsImpl
 * @see com.marcelmika.lims.persistence.generated.model.impl.SettingsModelImpl
 * @generated
 */
public interface SettingsModel extends BaseModel<Settings> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a settings model instance should use the {@link Settings} interface instead.
	 */

	/**
	 * Returns the primary key of this settings.
	 *
	 * @return the primary key of this settings
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this settings.
	 *
	 * @param primaryKey the primary key of this settings
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sid of this settings.
	 *
	 * @return the sid of this settings
	 */
	public long getSid();

	/**
	 * Sets the sid of this settings.
	 *
	 * @param sid the sid of this settings
	 */
	public void setSid(long sid);

	/**
	 * Returns the user ID of this settings.
	 *
	 * @return the user ID of this settings
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this settings.
	 *
	 * @param userId the user ID of this settings
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this settings.
	 *
	 * @return the user uuid of this settings
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this settings.
	 *
	 * @param userUuid the user uuid of this settings
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the presence of this settings.
	 *
	 * @return the presence of this settings
	 */
	@AutoEscape
	public String getPresence();

	/**
	 * Sets the presence of this settings.
	 *
	 * @param presence the presence of this settings
	 */
	public void setPresence(String presence);

	/**
	 * Returns the mute of this settings.
	 *
	 * @return the mute of this settings
	 */
	public boolean getMute();

	/**
	 * Returns <code>true</code> if this settings is mute.
	 *
	 * @return <code>true</code> if this settings is mute; <code>false</code> otherwise
	 */
	public boolean isMute();

	/**
	 * Sets whether this settings is mute.
	 *
	 * @param mute the mute of this settings
	 */
	public void setMute(boolean mute);

	/**
	 * Returns the chat enabled of this settings.
	 *
	 * @return the chat enabled of this settings
	 */
	public boolean getChatEnabled();

	/**
	 * Returns <code>true</code> if this settings is chat enabled.
	 *
	 * @return <code>true</code> if this settings is chat enabled; <code>false</code> otherwise
	 */
	public boolean isChatEnabled();

	/**
	 * Sets whether this settings is chat enabled.
	 *
	 * @param chatEnabled the chat enabled of this settings
	 */
	public void setChatEnabled(boolean chatEnabled);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Settings settings);

	public int hashCode();

	public CacheModel<Settings> toCacheModel();

	public Settings toEscapedModel();

	public Settings toUnescapedModel();

	public String toString();

	public String toXmlString();
}