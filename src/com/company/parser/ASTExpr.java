/* Generated By:JJTree: Do not edit this line. ASTExpr.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.company.parser;

import com.company.*;

public
class ASTExpr extends SimpleNode {
  public ASTExpr(int id) {
    super(id);
  }

  public ASTExpr(Griddy p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GriddyVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=22982de66f19108c280d9bd08f439aa2 (do not edit this line) */