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

package com.liferay.demo.apiai.service;

import aQute.bnd.annotation.ProviderType;
import com.liferay.demo.apiai.model.ApiAiData;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;
import java.util.List;

/**
 * Provides the local service interface for ApiAiData. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataLocalServiceUtil
 * @see com.liferay.demo.apiai.service.base.ApiAiDataLocalServiceBaseImpl
 * @see com.liferay.demo.apiai.service.impl.ApiAiDataLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ApiAiDataLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApiAiDataLocalServiceUtil} to access the api ai data local service. Add custom service methods to {@link com.liferay.demo.apiai.service.impl.ApiAiDataLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the api ai data to the database. Also notifies the appropriate model listeners.
	*
	* @param apiAiData the api ai data
	* @return the api ai data that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ApiAiData addApiAiData(ApiAiData apiAiData);

	public String addApiAiData(ServiceContext serviceContext, String query,
		String authtoken, String speech, String action, String fulfillment,
		String result);

	/**
	* Creates a new api ai data with the primary key. Does not add the api ai data to the database.
	*
	* @param apiAiDataId the primary key for the new api ai data
	* @return the new api ai data
	*/
	@Transactional(enabled = false)
	public ApiAiData createApiAiData(long apiAiDataId);

	/**
	* Deletes the api ai data from the database. Also notifies the appropriate model listeners.
	*
	* @param apiAiData the api ai data
	* @return the api ai data that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ApiAiData deleteApiAiData(ApiAiData apiAiData);

	/**
	* Deletes the api ai data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apiAiDataId the primary key of the api ai data
	* @return the api ai data that was removed
	* @throws PortalException if a api ai data with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ApiAiData deleteApiAiData(long apiAiDataId)
		throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.demo.apiai.model.impl.ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.demo.apiai.model.impl.ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ApiAiData fetchApiAiData(long apiAiDataId);

	/**
	* Returns the api ai data matching the UUID and group.
	*
	* @param uuid the api ai data's UUID
	* @param groupId the primary key of the group
	* @return the matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ApiAiData fetchApiAiDataByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the api ai data with the primary key.
	*
	* @param apiAiDataId the primary key of the api ai data
	* @return the api ai data
	* @throws PortalException if a api ai data with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ApiAiData getApiAiData(long apiAiDataId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApiAiData> getApiAiDataByUserId(long userId);

	/**
	* Returns the api ai data matching the UUID and group.
	*
	* @param uuid the api ai data's UUID
	* @param groupId the primary key of the group
	* @return the matching api ai data
	* @throws PortalException if a matching api ai data could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ApiAiData getApiAiDataByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	* Returns a range of all the api ai datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.demo.apiai.model.impl.ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @return the range of api ai datas
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApiAiData> getApiAiDatas(int start, int end);

	/**
	* Returns all the api ai datas matching the UUID and company.
	*
	* @param uuid the UUID of the api ai datas
	* @param companyId the primary key of the company
	* @return the matching api ai datas, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApiAiData> getApiAiDatasByUuidAndCompanyId(String uuid,
		long companyId);

	/**
	* Returns a range of api ai datas matching the UUID and company.
	*
	* @param uuid the UUID of the api ai datas
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching api ai datas, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApiAiData> getApiAiDatasByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<ApiAiData> orderByComparator);

	/**
	* Returns the number of api ai datas.
	*
	* @return the number of api ai datas
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getApiAiDatasCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApiAiData> getRecentConversation(
		ServiceContext serviceContext, int records);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ApiAiData> getRecentConversation(
		ServiceContext serviceContext, int records, String sortOrder);

	/**
	* Updates the api ai data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param apiAiData the api ai data
	* @return the api ai data that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ApiAiData updateApiAiData(ApiAiData apiAiData);
}