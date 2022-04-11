/* Generated By:JavaCC: Do not edit this line. GriddyVisitor.java Version 7.0.10 */
package com.company.parser;

import com.company.*;

public interface GriddyVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTStart node, Object data);
  public Object visit(ASTSetup node, Object data);
  public Object visit(ASTGame node, Object data);
  public Object visit(ASTBoard node, Object data);
  public Object visit(ASTAssign node, Object data);
  public Object visit(ASTMul node, Object data);
  public Object visit(ASTDiv node, Object data);
  public Object visit(ASTMod node, Object data);
  public Object visit(ASTAdd node, Object data);
  public Object visit(ASTSub node, Object data);
  public Object visit(ASTIdent node, Object data);
  public Object visit(ASTInteger node, Object data);
  public Object visit(ASTString node, Object data);
  public Object visit(ASTEcho node, Object data);
}
/* JavaCC - OriginalChecksum=ea2514ba40436efe390746feb4055d3d (do not edit this line) */
