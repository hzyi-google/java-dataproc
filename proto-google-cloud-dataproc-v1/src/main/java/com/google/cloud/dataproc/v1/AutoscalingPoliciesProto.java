/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

public final class AutoscalingPoliciesProto {
  private AutoscalingPoliciesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/dataproc/v1/autoscaling_p"
          + "olicies.proto\022\030google.cloud.dataproc.v1\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032\036goog"
          + "le/protobuf/duration.proto\032\033google/proto"
          + "buf/empty.proto\"\250\004\n\021AutoscalingPolicy\022\n\n"
          + "\002id\030\001 \001(\t\022\021\n\004name\030\002 \001(\tB\003\340A\003\022S\n\017basic_al"
          + "gorithm\030\003 \001(\01323.google.cloud.dataproc.v1"
          + ".BasicAutoscalingAlgorithmB\003\340A\002H\000\022Z\n\rwor"
          + "ker_config\030\004 \001(\0132>.google.cloud.dataproc"
          + ".v1.InstanceGroupAutoscalingPolicyConfig"
          + "B\003\340A\002\022d\n\027secondary_worker_config\030\005 \001(\0132>"
          + ".google.cloud.dataproc.v1.InstanceGroupA"
          + "utoscalingPolicyConfigB\003\340A\001:\317\001\352A\313\001\n)data"
          + "proc.googleapis.com/AutoscalingPolicy\022Pp"
          + "rojects/{project}/locations/{location}/a"
          + "utoscalingPolicies/{autoscaling_policy}\022"
          + "Lprojects/{project}/regions/{region}/aut"
          + "oscalingPolicies/{autoscaling_policy}B\013\n"
          + "\talgorithm\"\244\001\n\031BasicAutoscalingAlgorithm"
          + "\022N\n\013yarn_config\030\001 \001(\01324.google.cloud.dat"
          + "aproc.v1.BasicYarnAutoscalingConfigB\003\340A\002"
          + "\0227\n\017cooldown_period\030\002 \001(\0132\031.google.proto"
          + "buf.DurationB\003\340A\001\"\371\001\n\032BasicYarnAutoscali"
          + "ngConfig\022E\n\035graceful_decommission_timeou"
          + "t\030\005 \001(\0132\031.google.protobuf.DurationB\003\340A\002\022"
          + "\034\n\017scale_up_factor\030\001 \001(\001B\003\340A\002\022\036\n\021scale_d"
          + "own_factor\030\002 \001(\001B\003\340A\002\022)\n\034scale_up_min_wo"
          + "rker_fraction\030\003 \001(\001B\003\340A\001\022+\n\036scale_down_m"
          + "in_worker_fraction\030\004 \001(\001B\003\340A\001\"s\n$Instanc"
          + "eGroupAutoscalingPolicyConfig\022\032\n\rmin_ins"
          + "tances\030\001 \001(\005B\003\340A\001\022\032\n\rmax_instances\030\002 \001(\005"
          + "B\003\340A\002\022\023\n\006weight\030\003 \001(\005B\003\340A\001\"\240\001\n\036CreateAut"
          + "oscalingPolicyRequest\022A\n\006parent\030\001 \001(\tB1\340"
          + "A\002\372A+\022)dataproc.googleapis.com/Autoscali"
          + "ngPolicy\022;\n\006policy\030\002 \001(\0132+.google.cloud."
          + "dataproc.v1.AutoscalingPolicy\"^\n\033GetAuto"
          + "scalingPolicyRequest\022?\n\004name\030\001 \001(\tB1\340A\002\372"
          + "A+\n)dataproc.googleapis.com/AutoscalingP"
          + "olicy\"b\n\036UpdateAutoscalingPolicyRequest\022"
          + "@\n\006policy\030\001 \001(\0132+.google.cloud.dataproc."
          + "v1.AutoscalingPolicyB\003\340A\002\"a\n\036DeleteAutos"
          + "calingPolicyRequest\022?\n\004name\030\001 \001(\tB1\340A\002\372A"
          + "+\n)dataproc.googleapis.com/AutoscalingPo"
          + "licy\"\224\001\n\036ListAutoscalingPoliciesRequest\022"
          + "A\n\006parent\030\001 \001(\tB1\340A\002\372A+\022)dataproc.google"
          + "apis.com/AutoscalingPolicy\022\026\n\tpage_size\030"
          + "\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"\203\001\n\037"
          + "ListAutoscalingPoliciesResponse\022B\n\010polic"
          + "ies\030\001 \003(\0132+.google.cloud.dataproc.v1.Aut"
          + "oscalingPolicyB\003\340A\003\022\034\n\017next_page_token\030\002"
          + " \001(\tB\003\340A\0032\256\013\n\030AutoscalingPolicyService\022\234"
          + "\002\n\027CreateAutoscalingPolicy\0228.google.clou"
          + "d.dataproc.v1.CreateAutoscalingPolicyReq"
          + "uest\032+.google.cloud.dataproc.v1.Autoscal"
          + "ingPolicy\"\231\001\202\323\344\223\002\202\001\"7/v1/{parent=project"
          + "s/*/locations/*}/autoscalingPolicies:\006po"
          + "licyZ?\"5/v1/{parent=projects/*/regions/*"
          + "}/autoscalingPolicies:\006policy\332A\rparent,p"
          + "olicy\022\243\002\n\027UpdateAutoscalingPolicy\0228.goog"
          + "le.cloud.dataproc.v1.UpdateAutoscalingPo"
          + "licyRequest\032+.google.cloud.dataproc.v1.A"
          + "utoscalingPolicy\"\240\001\202\323\344\223\002\220\001\032>/v1/{policy."
          + "name=projects/*/locations/*/autoscalingP"
          + "olicies/*}:\006policyZF\032</v1/{policy.name=p"
          + "rojects/*/regions/*/autoscalingPolicies/"
          + "*}:\006policy\332A\006policy\022\373\001\n\024GetAutoscalingPo"
          + "licy\0225.google.cloud.dataproc.v1.GetAutos"
          + "calingPolicyRequest\032+.google.cloud.datap"
          + "roc.v1.AutoscalingPolicy\"\177\202\323\344\223\002r\0227/v1/{n"
          + "ame=projects/*/locations/*/autoscalingPo"
          + "licies/*}Z7\0225/v1/{name=projects/*/region"
          + "s/*/autoscalingPolicies/*}\332A\004name\022\222\002\n\027Li"
          + "stAutoscalingPolicies\0228.google.cloud.dat"
          + "aproc.v1.ListAutoscalingPoliciesRequest\032"
          + "9.google.cloud.dataproc.v1.ListAutoscali"
          + "ngPoliciesResponse\"\201\001\202\323\344\223\002r\0227/v1/{parent"
          + "=projects/*/locations/*}/autoscalingPoli"
          + "ciesZ7\0225/v1/{parent=projects/*/regions/*"
          + "}/autoscalingPolicies\332A\006parent\022\354\001\n\027Delet"
          + "eAutoscalingPolicy\0228.google.cloud.datapr"
          + "oc.v1.DeleteAutoscalingPolicyRequest\032\026.g"
          + "oogle.protobuf.Empty\"\177\202\323\344\223\002r*7/v1/{name="
          + "projects/*/locations/*/autoscalingPolici"
          + "es/*}Z7*5/v1/{name=projects/*/regions/*/"
          + "autoscalingPolicies/*}\332A\004name\032K\312A\027datapr"
          + "oc.googleapis.com\322A.https://www.googleap"
          + "is.com/auth/cloud-platformB\304\001\n\034com.googl"
          + "e.cloud.dataproc.v1B\030AutoscalingPolicies"
          + "ProtoP\001Z@google.golang.org/genproto/goog"
          + "leapis/cloud/dataproc/v1;dataproc\352AE\n\036da"
          + "taproc.googleapis.com/Region\022#projects/{"
          + "project}/regions/{region}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor,
            new java.lang.String[] {
              "Id", "Name", "BasicAlgorithm", "WorkerConfig", "SecondaryWorkerConfig", "Algorithm",
            });
    internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor,
            new java.lang.String[] {
              "YarnConfig", "CooldownPeriod",
            });
    internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor,
            new java.lang.String[] {
              "GracefulDecommissionTimeout",
              "ScaleUpFactor",
              "ScaleDownFactor",
              "ScaleUpMinWorkerFraction",
              "ScaleDownMinWorkerFraction",
            });
    internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor,
            new java.lang.String[] {
              "MinInstances", "MaxInstances", "Weight",
            });
    internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Policy",
            });
    internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Policy",
            });
    internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor,
            new java.lang.String[] {
              "Policies", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
