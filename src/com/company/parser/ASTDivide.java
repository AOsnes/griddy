/* Generated By:JJTree: Do not edit this line. ASTDivide.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.company.parser;

import com.company.*;

public
class ASTDivide extends SimpleNode {
  public ASTDivide(int id) {
    super(id);
  }

  public ASTDivide(Griddy p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GriddyVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4033d12d674cd16a4b6d6b2e32c8a41d (do not edit this line) */
