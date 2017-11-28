package com.rodrigo.soukef.item-processor;





import java.util.ArrayList;

import java.util.List;



import org.springframework.batch.item.ItemProcessor;

import org.springframework.stereotype.Service;



@Service

public class ColorsProcessor implements ItemProcessor<Colors, List<CatalogColor>> {

	public List<CatalogColor> process(Colors colors) throws Exception {

		List<CatalogColor> result = null;

		//result = someMethodToConvertColorsObjectToAColorsList(colors);

		return result;
	}

	private List<CatalogColor> someMethodToConvertColorsObjectToAColorsList(Colors colors){

		List<CatalogColor> result = null;

		//result = logic to populate result list

		return result;
	}
}


