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

package org.apache.tez.dag.app.dag;

import java.util.List;

import org.apache.hadoop.yarn.api.records.ApplicationId;
import org.apache.tez.dag.api.oldrecords.AMInfo;

public abstract class DAGReport {
  public abstract ApplicationId getDAGId();

  public abstract void setDAGId(ApplicationId dagId);

  public abstract DAGState getDAGState();

  public abstract float getMapProgress();

  public abstract void setMapProgress(float progress);

  public abstract float getReduceProgress();

  public abstract void setReduceProgress(float progress);

  public abstract float getCleanupProgress();

  public abstract void setCleanupProgress(float progress);

  public abstract float getSetupProgress();

  public abstract void setSetupProgress(float progress);

  public abstract long getSubmitTime();

  public abstract void setSubmitTime(long submitTime);

  public abstract long getStartTime();

  public abstract void setStartTime(long startTime);

  public abstract long getFinishTime();

  public abstract void setFinishTime(long finishTime);

  public abstract String getUser();

  public abstract void setUser(String user);

  public abstract String getJobName();

  public abstract void setJobName(String jobName);

  public abstract String getTrackingUrl();

  public abstract void setTrackingUrl(String trackingUrl);

  public abstract String getDiagnostics();

  public abstract void setDiagnostics(String diagnostics);

  public abstract String getJobFile();

  public abstract void setJobFile(String jobFile);

  public abstract List<AMInfo> getAMInfos();

  public abstract void setAMInfos(List<AMInfo> amInfos);

  public abstract boolean isUber();

  public abstract void setJobState(DAGState dagState);

  public abstract void setIsUber(boolean isUber);
}
