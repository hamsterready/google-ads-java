// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/policy.proto

package com.google.ads.googleads.v3.common;

public interface PolicyTopicConstraintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.PolicyTopicConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Countries where the resource cannot serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList country_constraint_list = 1;</code>
   */
  boolean hasCountryConstraintList();
  /**
   * <pre>
   * Countries where the resource cannot serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList country_constraint_list = 1;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList getCountryConstraintList();
  /**
   * <pre>
   * Countries where the resource cannot serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList country_constraint_list = 1;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintListOrBuilder getCountryConstraintListOrBuilder();

  /**
   * <pre>
   * Reseller constraint.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.ResellerConstraint reseller_constraint = 2;</code>
   */
  boolean hasResellerConstraint();
  /**
   * <pre>
   * Reseller constraint.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.ResellerConstraint reseller_constraint = 2;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicConstraint.ResellerConstraint getResellerConstraint();
  /**
   * <pre>
   * Reseller constraint.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.ResellerConstraint reseller_constraint = 2;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicConstraint.ResellerConstraintOrBuilder getResellerConstraintOrBuilder();

  /**
   * <pre>
   * Countries where a certificate is required for serving.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList certificate_missing_in_country_list = 3;</code>
   */
  boolean hasCertificateMissingInCountryList();
  /**
   * <pre>
   * Countries where a certificate is required for serving.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList certificate_missing_in_country_list = 3;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList getCertificateMissingInCountryList();
  /**
   * <pre>
   * Countries where a certificate is required for serving.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList certificate_missing_in_country_list = 3;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintListOrBuilder getCertificateMissingInCountryListOrBuilder();

  /**
   * <pre>
   * Countries where the resource's domain is not covered by the
   * certificates associated with it.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList certificate_domain_mismatch_in_country_list = 4;</code>
   */
  boolean hasCertificateDomainMismatchInCountryList();
  /**
   * <pre>
   * Countries where the resource's domain is not covered by the
   * certificates associated with it.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList certificate_domain_mismatch_in_country_list = 4;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList getCertificateDomainMismatchInCountryList();
  /**
   * <pre>
   * Countries where the resource's domain is not covered by the
   * certificates associated with it.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintList certificate_domain_mismatch_in_country_list = 4;</code>
   */
  com.google.ads.googleads.v3.common.PolicyTopicConstraint.CountryConstraintListOrBuilder getCertificateDomainMismatchInCountryListOrBuilder();

  public com.google.ads.googleads.v3.common.PolicyTopicConstraint.ValueCase getValueCase();
}
