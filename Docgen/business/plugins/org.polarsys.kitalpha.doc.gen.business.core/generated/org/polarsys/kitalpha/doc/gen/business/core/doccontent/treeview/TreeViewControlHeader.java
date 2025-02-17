//Generated with EGF 1.6.3.202110291409
package org.polarsys.kitalpha.doc.gen.business.core.doccontent.treeview;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class TreeViewControlHeader {
	protected static String nl;

	public static synchronized TreeViewControlHeader create(String lineSeparator) {
		nl = lineSeparator;
		TreeViewControlHeader result = new TreeViewControlHeader();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;

	protected final String TEXT_1 = "<div id=\"treecontrol\" style=\"float:left\">" + NL + "\t<a href=\"#\">" + NL + "\t\t<img src=\"../../img/open.gif\" alt=\"Collapse All\" style=\"border:0px\"/>"
			+ NL + "\t</a> " + NL + "\t<a href=\"#\">" + NL + "\t\t<img src=\"../../img/closed.gif\" alt=\"Expand All\" style=\"border:0px\"/>" + NL + "\t</a>" + NL + "</div>";

	protected final String TEXT_2 = NL;

	public TreeViewControlHeader() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> treeIDList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {
			for (Object treeIDParameter : treeIDList) {

				this.parameter = (org.eclipse.emf.ecore.EObject) parameterParameter;
				this.treeID = (java.lang.String) treeIDParameter;

				if (preCondition(ctx)) {
					ctx.setNode(new Node.Container(currentNode, getClass()));
					orchestration(ctx);
				}

			}
		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			parameterValues.put("treeID", this.treeID);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.eclipse.emf.ecore.EObject parameter = null;

	public void set_parameter(org.eclipse.emf.ecore.EObject object) {
		this.parameter = object;
	}

	protected java.lang.String treeID = null;

	public void set_treeID(java.lang.String object) {
		this.treeID = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		parameters.put("treeID", this.treeID);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}
