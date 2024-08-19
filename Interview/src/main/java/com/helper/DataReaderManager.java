package com.helper;

import java.io.IOException;

public class DataReaderManager {

	private DataReaderManager() {
		// TODO Auto-generated constructor stub
	}

	static DataReaderManager drm;

	DataReader dr;

	public static DataReaderManager getInstanceDRM() {

		if (drm == null) {
			drm = new DataReaderManager();
		}
		return drm;
	}

	public DataReader getInstanceDR() throws IOException {

		if (dr == null) {
			dr = new DataReader();
		}
		return dr;
	}

}
