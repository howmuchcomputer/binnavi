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
package com.google.security.zynamics.binnavi.API.reil.mono;

// / @cond INTERNAL
/**
 * Interface for influencing nodes.
 *
 * @param <GraphNode> Type of the nodes in the processed graph.
 * @param <ObjectType> Type of the additional objects that are passed around.
 */
// / @endcond
public interface IInfluencingNode<GraphNode, ObjectType>
    extends com.google.security.zynamics.reil.algorithms.mono.interfaces.IInfluencingNode<GraphNode, ObjectType> {
  @Override
  GraphNode getNode();

  @Override
  ObjectType getObject();
}
