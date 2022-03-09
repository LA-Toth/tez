/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.tez.dag.api.oldrecords;

import org.apache.hadoop.yarn.api.records.ContainerId;
import org.apache.tez.common.counters.TezCounters;
import org.apache.tez.dag.records.TezTaskAttemptID;

public interface TaskAttemptReport {
  public abstract TezTaskAttemptID getTaskAttemptId();

  public abstract void setTaskAttemptId(TezTaskAttemptID taskAttemptId);

  public abstract TaskAttemptState getTaskAttemptState();

  public abstract void setTaskAttemptState(TaskAttemptState taskAttemptState);

  public abstract float getProgress();

  public abstract void setProgress(float progress);

  public abstract long getStartTime();

  public abstract void setStartTime(long startTime);

  public abstract long getFinishTime();

  public abstract void setFinishTime(long finishTime);

  /** @return the shuffle finish time. Applicable only for reduce attempts */
  public abstract long getShuffleFinishTime();

  /**
   * Set the shuffle finish time. Applicable only for reduce attempts
   * @param time the time the shuffle finished.
   */
  public abstract void setShuffleFinishTime(long time);

  /** @return the sort/merge finish time. Applicable only for reduce attempts */
  public abstract long getSortFinishTime();

  /**
   * Set the sort/merge finish time. Applicable only for reduce attempts
   * @param time the time the shuffle finished.
   */
  public abstract void setSortFinishTime(long time);

  public abstract TezCounters getCounters();

  public abstract void setCounters(TezCounters counters);

  public abstract String getDiagnosticInfo();

  public abstract void setDiagnosticInfo(String diagnosticInfo);

  public abstract String getStateString();

  public abstract void setStateString(String stateString);

  public abstract String getNodeManagerHost();

  public abstract void setNodeManagerHost(String nmHost);

  public abstract int getNodeManagerPort();

  public abstract void setNodeManagerPort(int nmPort);

  public abstract int getNodeManagerHttpPort();

  public abstract void setNodeManagerHttpPort(int nmHttpPort);

  public abstract ContainerId getContainerId();

  public abstract void setContainerId(ContainerId containerId);
}
