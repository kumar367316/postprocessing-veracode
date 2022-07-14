package com.custom.postprocessing.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author kumar.charanswain
 *
 */

@Component
public class PostProcessUtil {
	
	Logger logger = LoggerFactory.getLogger(PostProcessUtil.class);

	public String getFileType(String fileType) {
		if (fileType.matches(".*[0-9].*")) {
			fileType = "page" + fileType;
		}
		return fileType;
	}
}
