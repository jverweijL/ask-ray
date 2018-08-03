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

package com.liferay.demo.apiai.service.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.demo.apiai.model.ApiAiData;
import com.liferay.demo.apiai.service.ApiAiDataService;
import com.liferay.demo.apiai.service.ApiAiDataServiceUtil;
import com.liferay.demo.apiai.service.base.ApiAiDataServiceBaseImpl;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

/**
 * The implementation of the api ai data remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ApiAiDataService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataServiceBaseImpl
 * @see ApiAiDataServiceUtil
 */
@ProviderType
public class ApiAiDataServiceImpl extends ApiAiDataServiceBaseImpl {

	
	public List<ApiAiData> getRecentConversation(ServiceContext serviceContext, int records ) {
		List<ApiAiData>	apiAiData = apiAiDataLocalService.getRecentConversation(serviceContext, records);
		return apiAiData;		
	}
	
	public String addApiAiDataPersistence(ServiceContext serviceContext, String query, String authtoken, String speech, String action, String fulfillment, String result) {
		String response = apiAiDataLocalService.addApiAiData(serviceContext, query, authtoken, speech, action, fulfillment, result);
		return response;		
	}
	
	
}