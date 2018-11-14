package com.x.face.assemble.control.jaxrs.unit;

import com.x.base.core.project.exception.PromptException;

class ExceptionUnitNotExist extends PromptException {

	private static final long serialVersionUID = 4132300948670472899L;

	ExceptionUnitNotExist(String flag) {
		super("组织:{}, 不存在.", flag);
	}
}
