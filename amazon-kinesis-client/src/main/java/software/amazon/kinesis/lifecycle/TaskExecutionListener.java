/*
 *  Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the License.
 *  A copy of the License is located at
 *
 *  http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package software.amazon.kinesis.lifecycle;

import software.amazon.kinesis.lifecycle.events.TaskExecutionListenerInput;

/**
 * A listener for callbacks on task execution lifecycle for for a shard. The implementation for this interface should
 * not perform any blocking operation like remote service calls, because that would block subsequent task executions.
 */
public interface TaskExecutionListener {

    void onTaskBegin(TaskExecutionListenerInput input);

    void onTaskEnd(TaskExecutionListenerInput input);
}