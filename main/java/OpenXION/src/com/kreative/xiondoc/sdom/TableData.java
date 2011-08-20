/*
 * Copyright &copy; 2011 Rebecca G. Bettencourt / Kreative Software
 * <p>
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * <a href="http://www.mozilla.org/MPL/">http://www.mozilla.org/MPL/</a>
 * <p>
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * <p>
 * Alternatively, the contents of this file may be used under the terms
 * of the GNU Lesser General Public License (the "LGPL License"), in which
 * case the provisions of LGPL License are applicable instead of those
 * above. If you wish to allow use of your version of this file only
 * under the terms of the LGPL License and not to allow others to use
 * your version of this file under the MPL, indicate your decision by
 * deleting the provisions above and replace them with the notice and
 * other provisions required by the LGPL License. If you do not delete
 * the provisions above, a recipient may use your version of this file
 * under either the MPL or the LGPL License.
 * @since XIONDoc 1.3
 * @author Rebecca G. Bettencourt, Kreative Software
 */

package com.kreative.xiondoc.sdom;

import java.util.Vector;

/**
 * A table data cell.
 * The content is the text that should appear in the cell.
 * @since XIONDoc 1.3
 * @author Rebecca G. Bettencourt, Kreative Software
 */
public class TableData extends Vector<Span> implements TableCell {
	private static final long serialVersionUID = 1L;
	
	private int colspan;
	private int rowspan;
	
	public TableData() {
		this.colspan = 1;
		this.rowspan = 1;
	}
	
	public TableData(int colspan) {
		this.colspan = colspan;
		this.rowspan = 1;
	}
	
	public TableData(int colspan, int rowspan) {
		this.colspan = colspan;
		this.rowspan = rowspan;
	}
	
	public int getColSpan() {
		return colspan;
	}
	
	public void setColSpan(int colspan) {
		this.colspan = colspan;
	}
	
	public int getRowSpan() {
		return rowspan;
	}
	
	public void setRowSpan(int rowspan) {
		this.rowspan = rowspan;
	}
}
