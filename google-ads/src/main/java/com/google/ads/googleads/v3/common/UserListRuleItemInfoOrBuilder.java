// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/user_lists.proto

package com.google.ads.googleads.v3.common;

public interface UserListRuleItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.UserListRuleItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Rule variable name. It should match the corresponding key name fired
   * by the pixel.
   * A name must begin with US-ascii letters or underscore or UTF8 code that is
   * greater than 127 and consist of US-ascii letters or digits or underscore or
   * UTF8 code that is greater than 127.
   * For websites, there are two built-in variable URL (name = 'url__') and
   * referrer URL (name = 'ref_url__').
   * This field must be populated when creating a new rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 1;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Rule variable name. It should match the corresponding key name fired
   * by the pixel.
   * A name must begin with US-ascii letters or underscore or UTF8 code that is
   * greater than 127 and consist of US-ascii letters or digits or underscore or
   * UTF8 code that is greater than 127.
   * For websites, there are two built-in variable URL (name = 'url__') and
   * referrer URL (name = 'ref_url__').
   * This field must be populated when creating a new rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 1;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Rule variable name. It should match the corresponding key name fired
   * by the pixel.
   * A name must begin with US-ascii letters or underscore or UTF8 code that is
   * greater than 127 and consist of US-ascii letters or digits or underscore or
   * UTF8 code that is greater than 127.
   * For websites, there are two built-in variable URL (name = 'url__') and
   * referrer URL (name = 'ref_url__').
   * This field must be populated when creating a new rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * An atomic rule fragment composed of a number operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListNumberRuleItemInfo number_rule_item = 2;</code>
   */
  boolean hasNumberRuleItem();
  /**
   * <pre>
   * An atomic rule fragment composed of a number operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListNumberRuleItemInfo number_rule_item = 2;</code>
   */
  com.google.ads.googleads.v3.common.UserListNumberRuleItemInfo getNumberRuleItem();
  /**
   * <pre>
   * An atomic rule fragment composed of a number operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListNumberRuleItemInfo number_rule_item = 2;</code>
   */
  com.google.ads.googleads.v3.common.UserListNumberRuleItemInfoOrBuilder getNumberRuleItemOrBuilder();

  /**
   * <pre>
   * An atomic rule fragment composed of a string operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListStringRuleItemInfo string_rule_item = 3;</code>
   */
  boolean hasStringRuleItem();
  /**
   * <pre>
   * An atomic rule fragment composed of a string operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListStringRuleItemInfo string_rule_item = 3;</code>
   */
  com.google.ads.googleads.v3.common.UserListStringRuleItemInfo getStringRuleItem();
  /**
   * <pre>
   * An atomic rule fragment composed of a string operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListStringRuleItemInfo string_rule_item = 3;</code>
   */
  com.google.ads.googleads.v3.common.UserListStringRuleItemInfoOrBuilder getStringRuleItemOrBuilder();

  /**
   * <pre>
   * An atomic rule fragment composed of a date operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListDateRuleItemInfo date_rule_item = 4;</code>
   */
  boolean hasDateRuleItem();
  /**
   * <pre>
   * An atomic rule fragment composed of a date operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListDateRuleItemInfo date_rule_item = 4;</code>
   */
  com.google.ads.googleads.v3.common.UserListDateRuleItemInfo getDateRuleItem();
  /**
   * <pre>
   * An atomic rule fragment composed of a date operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserListDateRuleItemInfo date_rule_item = 4;</code>
   */
  com.google.ads.googleads.v3.common.UserListDateRuleItemInfoOrBuilder getDateRuleItemOrBuilder();

  public com.google.ads.googleads.v3.common.UserListRuleItemInfo.RuleItemCase getRuleItemCase();
}
