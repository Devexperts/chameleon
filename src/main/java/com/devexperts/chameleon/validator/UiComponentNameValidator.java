package com.devexperts.chameleon.validator;

/*-
 * #%L
 * Chameleon. Color Palette Management Tool
 * %%
 * Copyright (C) 2016 - 2018 Devexperts, LLC
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.devexperts.chameleon.service.UiComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Constraint validator for {@link NotExistingComponentName}. Check if name exist before
 *
 */
@Component
public class UiComponentNameValidator implements ConstraintValidator<NotExistingComponentName, String> {

	@Autowired
	private UiComponentService uiComponentService;

	public void initialize(NotExistingComponentName notExistingComponentName) {
	}

	public boolean isValid(String uiComponentName, ConstraintValidatorContext constraintValidatorContext) {
		return !uiComponentService.isNameExist(uiComponentName);
	}
}