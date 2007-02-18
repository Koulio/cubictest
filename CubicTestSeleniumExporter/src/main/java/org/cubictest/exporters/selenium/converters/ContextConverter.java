/*
 * This software is licensed under the terms of the GNU GENERAL PUBLIC LICENSE
 * Version 2, which can be found at http://www.gnu.org/copyleft/gpl.html
 */
package org.cubictest.exporters.selenium.converters;

import org.cubictest.export.converters.IContextConverter;
import org.cubictest.export.converters.PostContextHandle;
import org.cubictest.export.converters.PreContextHandle;
import org.cubictest.exporters.selenium.holders.SeleneseDocument;
import org.cubictest.model.context.IContext;

/**
 * Converter for contexts.
 * 
 * @author chr_schwarz
 */
public class ContextConverter implements IContextConverter<SeleneseDocument> {

	
	public PreContextHandle handlePreContext(SeleneseDocument doc, IContext ctx) {
		doc.pushContext(ctx);
		return PreContextHandle.CONTINUE;
	}

	public PostContextHandle handlePostContext(SeleneseDocument doc, IContext ctx) {
		doc.popContext();
		return PostContextHandle.DONE;
	}
}