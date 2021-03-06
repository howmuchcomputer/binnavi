/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.FilterPanel.FilterExpressions.AbstractTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an AND expression in the filter tree.
 */
public final class CAbstractAndExpression implements IAbstractNode {
  /**
   * The children of the AND expression.
   */
  private final List<IAbstractNode> m_children;

  /**
   * Creates a new AND expression.
   * 
   * @param children The children of the AND expression.
   */
  public CAbstractAndExpression(final List<IAbstractNode> children) {
    m_children = new ArrayList<IAbstractNode>(children);
  }

  /**
   * Returns the children of the AND expression.
   * 
   * @return The children of the AND expression.
   */
  public List<IAbstractNode> getChildren() {
    return new ArrayList<IAbstractNode>(m_children);
  }
}
