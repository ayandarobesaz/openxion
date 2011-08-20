/*
 * Copyright &copy; 2009-2011 Rebecca G. Bettencourt / Kreative Software
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
 * @since XIONDoc 1.0
 * @author Rebecca G. Bettencourt, Kreative Software
 */

package com.kreative.xiondoc.xdom;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;
import com.kreative.xiondoc.sdom.Section;

/**
 * A complete set of XIONDoc documentation.
 * @since XIONDoc 1.0
 * @author Rebecca G. Bettencourt, Kreative Software
 */
public class DocumentationSet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String summary;
	private Section description;
	private List<Dialect> dialects;
	private List<Article> articles;
	private TermCollection terms;
	
	public DocumentationSet() {
		this.summary = null;
		this.description = null;
		this.dialects = new Vector<Dialect>();
		this.articles = new Vector<Article>();
		this.terms = new TermCollection();
	}
	
	public boolean hasSummary() {
		return (summary != null && summary.length() > 0);
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public void appendSummary(String summary) {
		if (this.summary == null) this.summary = summary;
		else this.summary += " " + summary;
	}
	
	public boolean hasDescription() {
		return (description != null && !description.isEmpty());
	}
	
	public Section getDescription() {
		return description;
	}
	
	public void setDescription(Section description) {
		this.description = description;
	}
	
	public void appendDescription(Section description) {
		if (this.description == null) this.description = description;
		else this.description.addAll(description);
	}

	public List<Dialect> dialects() {
		return dialects;
	}

	public List<Article> articles() {
		return articles;
	}

	public TermCollection terms() {
		return terms;
	}
}
