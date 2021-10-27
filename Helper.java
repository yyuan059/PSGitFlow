package com.prontoforms.testutil;

import java.util.List;

public class Helper {

	public static String getNewDataRecordId(List<String> oldIdList, List<String> newIdList) {
		String diff_id = null;
		for (String id : newIdList) {
			if (!oldIdList.contains(id)) {
				diff_id = id;
				break;
			}
		}

		return diff_id;
	}

	public static boolean isTimeOut(Long startTime, Long dueInMillis) {
		return (startTime + dueInMillis) < System.currentTimeMillis();
	}
	public String output(){
		return System.out.print("Hello");
	}
}
