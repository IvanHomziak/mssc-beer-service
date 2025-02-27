package com.ihomziak.msscbeerservice.web.model;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/**
 * Created by Ivan Homziak on 2025-02-27
 */
public class BeerPageList extends PageImpl<BeerDto> {

	public BeerPageList(final List<BeerDto> content, final Pageable pageable, final long total) {
		super(content, pageable, total);
	}

	public BeerPageList(final List<BeerDto> content) {
		super(content);
	}
}
