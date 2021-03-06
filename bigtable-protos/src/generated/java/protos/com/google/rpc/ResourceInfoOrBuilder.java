// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

public interface ResourceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.ResourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string resource_type = 1;</code>
   *
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "https://types.googleapis.com/com.google.Calendar".
   * </pre>
   */
  java.lang.String getResourceType();
  /**
   * <code>optional string resource_type = 1;</code>
   *
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "https://types.googleapis.com/com.google.Calendar".
   * </pre>
   */
  com.google.protobuf.ByteString
      getResourceTypeBytes();

  /**
   * <code>optional string resource_name = 2;</code>
   *
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is PERMISSION_DENIED.
   * </pre>
   */
  java.lang.String getResourceName();
  /**
   * <code>optional string resource_name = 2;</code>
   *
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is PERMISSION_DENIED.
   * </pre>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <code>optional string owner = 3;</code>
   *
   * <pre>
   * The owner of the resource.
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   */
  java.lang.String getOwner();
  /**
   * <code>optional string owner = 3;</code>
   *
   * <pre>
   * The owner of the resource.
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>optional string description = 4;</code>
   *
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 4;</code>
   *
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
