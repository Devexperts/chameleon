package com.devexperts.chameleon.dto;

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

import java.util.List;

public class PaletteViewDTO {
    private final List<PaletteDTO> columns;
    private final List<SaveVariableDTO> rows;

    public PaletteViewDTO(List<PaletteDTO> columns, List<SaveVariableDTO> rows) {
        this.columns = columns;
        this.rows = rows;
    }

    public List<PaletteDTO> getColumns() {
        return columns;
    }

    public List<SaveVariableDTO> getRows() {
        return rows;
    }
}
