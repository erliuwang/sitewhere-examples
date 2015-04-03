/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.examples.airtraffic.client;

import java.util.ArrayList;
import java.util.List;

import com.sitewhere.rest.model.asset.HardwareAsset;
import com.sitewhere.rest.model.search.SearchResults;

/**
 * Search results that contain hardware assets. Needed so that JSON marshaling has a
 * concrete class to inflate.
 * 
 * @author dadams
 */
public class HardwareAssetSearchResults extends SearchResults<HardwareAsset> {

	public HardwareAssetSearchResults() {
		super(new ArrayList<HardwareAsset>());
	}

	public HardwareAssetSearchResults(List<HardwareAsset> results) {
		super(results);
	}
}