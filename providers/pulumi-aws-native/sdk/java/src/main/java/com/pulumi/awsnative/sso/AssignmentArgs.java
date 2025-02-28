// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso;

import com.pulumi.awsnative.sso.enums.AssignmentPrincipalType;
import com.pulumi.awsnative.sso.enums.AssignmentTargetType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssignmentArgs Empty = new AssignmentArgs();

    /**
     * The sso instance that the permission set is owned.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    /**
     * @return The sso instance that the permission set is owned.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The permission set that the assignemt will be assigned
     * 
     */
    @Import(name="permissionSetArn", required=true)
    private Output<String> permissionSetArn;

    /**
     * @return The permission set that the assignemt will be assigned
     * 
     */
    public Output<String> permissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * The assignee&#39;s identifier, user id/group id
     * 
     */
    @Import(name="principalId", required=true)
    private Output<String> principalId;

    /**
     * @return The assignee&#39;s identifier, user id/group id
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }

    /**
     * The assignee&#39;s type, user/group
     * 
     */
    @Import(name="principalType", required=true)
    private Output<AssignmentPrincipalType> principalType;

    /**
     * @return The assignee&#39;s type, user/group
     * 
     */
    public Output<AssignmentPrincipalType> principalType() {
        return this.principalType;
    }

    /**
     * The account id to be provisioned.
     * 
     */
    @Import(name="targetId", required=true)
    private Output<String> targetId;

    /**
     * @return The account id to be provisioned.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    /**
     * The type of resource to be provsioned to, only aws account now
     * 
     */
    @Import(name="targetType", required=true)
    private Output<AssignmentTargetType> targetType;

    /**
     * @return The type of resource to be provsioned to, only aws account now
     * 
     */
    public Output<AssignmentTargetType> targetType() {
        return this.targetType;
    }

    private AssignmentArgs() {}

    private AssignmentArgs(AssignmentArgs $) {
        this.instanceArn = $.instanceArn;
        this.permissionSetArn = $.permissionSetArn;
        this.principalId = $.principalId;
        this.principalType = $.principalType;
        this.targetId = $.targetId;
        this.targetType = $.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignmentArgs $;

        public Builder() {
            $ = new AssignmentArgs();
        }

        public Builder(AssignmentArgs defaults) {
            $ = new AssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceArn The sso instance that the permission set is owned.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The sso instance that the permission set is owned.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        /**
         * @param permissionSetArn The permission set that the assignemt will be assigned
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(Output<String> permissionSetArn) {
            $.permissionSetArn = permissionSetArn;
            return this;
        }

        /**
         * @param permissionSetArn The permission set that the assignemt will be assigned
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(String permissionSetArn) {
            return permissionSetArn(Output.of(permissionSetArn));
        }

        /**
         * @param principalId The assignee&#39;s identifier, user id/group id
         * 
         * @return builder
         * 
         */
        public Builder principalId(Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The assignee&#39;s identifier, user id/group id
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param principalType The assignee&#39;s type, user/group
         * 
         * @return builder
         * 
         */
        public Builder principalType(Output<AssignmentPrincipalType> principalType) {
            $.principalType = principalType;
            return this;
        }

        /**
         * @param principalType The assignee&#39;s type, user/group
         * 
         * @return builder
         * 
         */
        public Builder principalType(AssignmentPrincipalType principalType) {
            return principalType(Output.of(principalType));
        }

        /**
         * @param targetId The account id to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder targetId(Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The account id to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        /**
         * @param targetType The type of resource to be provsioned to, only aws account now
         * 
         * @return builder
         * 
         */
        public Builder targetType(Output<AssignmentTargetType> targetType) {
            $.targetType = targetType;
            return this;
        }

        /**
         * @param targetType The type of resource to be provsioned to, only aws account now
         * 
         * @return builder
         * 
         */
        public Builder targetType(AssignmentTargetType targetType) {
            return targetType(Output.of(targetType));
        }

        public AssignmentArgs build() {
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            $.permissionSetArn = Objects.requireNonNull($.permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.principalType = Objects.requireNonNull($.principalType, "expected parameter 'principalType' to be non-null");
            $.targetId = Objects.requireNonNull($.targetId, "expected parameter 'targetId' to be non-null");
            $.targetType = Objects.requireNonNull($.targetType, "expected parameter 'targetType' to be non-null");
            return $;
        }
    }

}
