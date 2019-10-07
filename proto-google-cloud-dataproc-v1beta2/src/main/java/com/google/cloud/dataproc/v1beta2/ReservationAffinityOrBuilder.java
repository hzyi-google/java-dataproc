// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface ReservationAffinityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.ReservationAffinity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Type of reservation to consume
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getConsumeReservationTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. Type of reservation to consume
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.ReservationAffinity.Type getConsumeReservationType();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of reservation resource.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of reservation resource.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<java.lang.String> getValuesList();
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getValues(int index);
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getValuesBytes(int index);
}
