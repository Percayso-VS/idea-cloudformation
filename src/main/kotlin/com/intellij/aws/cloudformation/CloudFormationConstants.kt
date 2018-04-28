package com.intellij.aws.cloudformation

object CloudFormationConstants {
  val SupportedTemplateFormatVersions = setOf("2010-09-09")

  val awsServerless20161031TransformName = "AWS::Serverless-2016-10-31"

  // from https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html
  val ParameterDescriptionLimit = 4000
  val ParameterTypePropertyName = "Type"

  val CloudFormationInterfaceType = "AWS::CloudFormation::Interface"
  val CloudFormationInterfaceParameterLabels = "ParameterLabels"
  val CloudFormationInterfaceParameterGroups = "ParameterGroups"
  val CloudFormationInterfaceParameters = "Parameters"

  val CustomResourceType = "AWS::CloudFormation::CustomResource"
  val CustomResourceTypePrefix = "Custom::"

  val CommentResourcePropertyName = "Comment"

  val ConditionPropertyName = "Condition"
  val TypePropertyName = "Type"
  val PropertiesPropertyName = "Properties"
  val CreationPolicyPropertyName = "CreationPolicy"
  val DeletionPolicyPropertyName = "DeletionPolicy"
  val DependsOnPropertyName = "DependsOn"
  val MetadataPropertyName = "Metadata"
  val UpdatePolicyPropertyName = "UpdatePolicy"
  val VersionPropertyName = "Version"

  val AllTopLevelResourceProperties = listOf(
      ConditionPropertyName,
      TypePropertyName,
      PropertiesPropertyName,
      CreationPolicyPropertyName,
      DeletionPolicyPropertyName,
      DependsOnPropertyName,
      MetadataPropertyName,
      UpdatePolicyPropertyName,
      VersionPropertyName
  ).toSet()

  // TODO fetch from https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html
  val AwsSpecificParameterTypes = listOf(
      "AWS::EC2::AvailabilityZone::Name",
      "AWS::EC2::Image::Id",
      "AWS::EC2::Instance::Id",
      "AWS::EC2::KeyPair::KeyName",
      "AWS::EC2::SecurityGroup::GroupName",
      "AWS::EC2::SecurityGroup::Id",
      "AWS::EC2::Subnet::Id",
      "AWS::EC2::Volume::Id",
      "AWS::EC2::VPC::Id",
      "AWS::Route53::HostedZone::Id",
      "List<AWS::EC2::AvailabilityZone::Name>",
      "List<AWS::EC2::Image::Id>",
      "List<AWS::EC2::Instance::Id>",
      "List<AWS::EC2::SecurityGroup::GroupName>",
      "List<AWS::EC2::SecurityGroup::Id>",
      "List<AWS::EC2::Subnet::Id>",
      "List<AWS::EC2::Volume::Id>",
      "List<AWS::EC2::VPC::Id>",
      "List<AWS::Route53::HostedZone::Id>"
  )
}
