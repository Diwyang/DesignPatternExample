package org.designPattern.example.cd;

import org.designPattern.example.company.Samsung;
import org.designPattern.example.company.Sony;

public class CDBuilder {

	public CDType buildSonyCD() {
		CDType cds = new CDType();
		cds.addItem(new Sony());
		return cds;
	}

	public CDType buildSamsungCD() {
		CDType cds = new CDType();
		cds.addItem(new Samsung());
		return cds;
	}

}
