// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.pubsub.SubscriptionArgs;
import com.pulumi.gcp.pubsub.inputs.SubscriptionState;
import com.pulumi.gcp.pubsub.outputs.SubscriptionDeadLetterPolicy;
import com.pulumi.gcp.pubsub.outputs.SubscriptionExpirationPolicy;
import com.pulumi.gcp.pubsub.outputs.SubscriptionPushConfig;
import com.pulumi.gcp.pubsub.outputs.SubscriptionRetryPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A named resource representing the stream of messages from a single,
 * specific topic, to be delivered to the subscribing application.
 * 
 * To get more information about Subscription, see:
 * 
 * * [API documentation](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions)
 * * How-to Guides
 *     * [Managing Subscriptions](https://cloud.google.com/pubsub/docs/admin#managing_subscriptions)
 * 
 * &gt; **Note:** You can retrieve the email of the Google Managed Pub/Sub Service Account used for forwarding
 * by using the `gcp.projects.ServiceIdentity` resource.
 * 
 * ## Example Usage
 * ### Pubsub Subscription Push
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;);
 * 
 *         var exampleSubscription = new Subscription(&#34;exampleSubscription&#34;, SubscriptionArgs.builder()        
 *             .topic(exampleTopic.getName())
 *             .ackDeadlineSeconds(20)
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .pushConfig(SubscriptionPushConfig.builder()
 *                 .pushEndpoint(&#34;https://example.com/push&#34;)
 *                 .attributes(Map.of(&#34;x-goog-version&#34;, &#34;v1&#34;))
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Pubsub Subscription Pull
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;);
 * 
 *         var exampleSubscription = new Subscription(&#34;exampleSubscription&#34;, SubscriptionArgs.builder()        
 *             .topic(exampleTopic.getName())
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .messageRetentionDuration(&#34;1200s&#34;)
 *             .retainAckedMessages(true)
 *             .ackDeadlineSeconds(20)
 *             .expirationPolicy(SubscriptionExpirationPolicy.builder()
 *                 .ttl(&#34;300000.5s&#34;)
 *                 .build())
 *             .retryPolicy(SubscriptionRetryPolicy.builder()
 *                 .minimumBackoff(&#34;10s&#34;)
 *                 .build())
 *             .enableMessageOrdering(false)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Pubsub Subscription Different Project
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;, TopicArgs.builder()        
 *             .project(&#34;topic-project&#34;)
 *             .build());
 * 
 *         var exampleSubscription = new Subscription(&#34;exampleSubscription&#34;, SubscriptionArgs.builder()        
 *             .project(&#34;subscription-project&#34;)
 *             .topic(exampleTopic.getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Pubsub Subscription Dead Letter
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;);
 * 
 *         var exampleDeadLetter = new Topic(&#34;exampleDeadLetter&#34;);
 * 
 *         var exampleSubscription = new Subscription(&#34;exampleSubscription&#34;, SubscriptionArgs.builder()        
 *             .topic(exampleTopic.getName())
 *             .deadLetterPolicy(SubscriptionDeadLetterPolicy.builder()
 *                 .deadLetterTopic(exampleDeadLetter.getId())
 *                 .maxDeliveryAttempts(10)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Subscription can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/subscription:Subscription default projects/{{project}}/subscriptions/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/subscription:Subscription default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:pubsub/subscription:Subscription default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:pubsub/subscription:Subscription")
public class Subscription extends com.pulumi.resources.CustomResource {
    /**
     * This value is the maximum time after a subscriber receives a message
     * before the subscriber should acknowledge the message. After message
     * delivery but before the ack deadline expires and before the message is
     * acknowledged, it is an outstanding message and will not be delivered
     * again during that time (on a best-effort basis).
     * For pull subscriptions, this value is used as the initial value for
     * the ack deadline. To override this value for a given message, call
     * subscriptions.modifyAckDeadline with the corresponding ackId if using
     * pull. The minimum custom deadline you can specify is 10 seconds. The
     * maximum custom deadline you can specify is 600 seconds (10 minutes).
     * If this parameter is 0, a default value of 10 seconds is used.
     * For push delivery, this value is also used to set the request timeout
     * for the call to the push endpoint.
     * If the subscriber never acknowledges the message, the Pub/Sub system
     * will eventually redeliver the message.
     * 
     */
    @Export(name="ackDeadlineSeconds", type=Integer.class, parameters={})
    private Output<Integer> ackDeadlineSeconds;

    /**
     * @return This value is the maximum time after a subscriber receives a message
     * before the subscriber should acknowledge the message. After message
     * delivery but before the ack deadline expires and before the message is
     * acknowledged, it is an outstanding message and will not be delivered
     * again during that time (on a best-effort basis).
     * For pull subscriptions, this value is used as the initial value for
     * the ack deadline. To override this value for a given message, call
     * subscriptions.modifyAckDeadline with the corresponding ackId if using
     * pull. The minimum custom deadline you can specify is 10 seconds. The
     * maximum custom deadline you can specify is 600 seconds (10 minutes).
     * If this parameter is 0, a default value of 10 seconds is used.
     * For push delivery, this value is also used to set the request timeout
     * for the call to the push endpoint.
     * If the subscriber never acknowledges the message, the Pub/Sub system
     * will eventually redeliver the message.
     * 
     */
    public Output<Integer> ackDeadlineSeconds() {
        return this.ackDeadlineSeconds;
    }
    /**
     * A policy that specifies the conditions for dead lettering messages in
     * this subscription. If dead_letter_policy is not set, dead lettering
     * is disabled.
     * The Cloud Pub/Sub service account associated with this subscription&#39;s
     * parent project (i.e.,
     * service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have
     * permission to Acknowledge() messages on this subscription.
     * Structure is documented below.
     * 
     */
    @Export(name="deadLetterPolicy", type=SubscriptionDeadLetterPolicy.class, parameters={})
    private Output</* @Nullable */ SubscriptionDeadLetterPolicy> deadLetterPolicy;

    /**
     * @return A policy that specifies the conditions for dead lettering messages in
     * this subscription. If dead_letter_policy is not set, dead lettering
     * is disabled.
     * The Cloud Pub/Sub service account associated with this subscription&#39;s
     * parent project (i.e.,
     * service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have
     * permission to Acknowledge() messages on this subscription.
     * Structure is documented below.
     * 
     */
    public Output<Optional<SubscriptionDeadLetterPolicy>> deadLetterPolicy() {
        return Codegen.optional(this.deadLetterPolicy);
    }
    /**
     * If `true`, Pub/Sub provides the following guarantees for the delivery
     * of a message with a given value of messageId on this Subscriptions&#39;:
     * - The message sent to a subscriber is guaranteed not to be resent before the message&#39;s acknowledgement deadline expires.
     * - An acknowledged message will not be resent to a subscriber.
     *   Note that subscribers may still receive multiple copies of a message when `enable_exactly_once_delivery`
     *   is true if the message was published multiple times by a publisher client. These copies are considered distinct by Pub/Sub and have distinct messageId values
     * 
     */
    @Export(name="enableExactlyOnceDelivery", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableExactlyOnceDelivery;

    /**
     * @return If `true`, Pub/Sub provides the following guarantees for the delivery
     * of a message with a given value of messageId on this Subscriptions&#39;:
     * - The message sent to a subscriber is guaranteed not to be resent before the message&#39;s acknowledgement deadline expires.
     * - An acknowledged message will not be resent to a subscriber.
     *   Note that subscribers may still receive multiple copies of a message when `enable_exactly_once_delivery`
     *   is true if the message was published multiple times by a publisher client. These copies are considered distinct by Pub/Sub and have distinct messageId values
     * 
     */
    public Output<Optional<Boolean>> enableExactlyOnceDelivery() {
        return Codegen.optional(this.enableExactlyOnceDelivery);
    }
    /**
     * If `true`, messages published with the same orderingKey in PubsubMessage will be delivered to
     * the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they
     * may be delivered in any order.
     * 
     */
    @Export(name="enableMessageOrdering", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableMessageOrdering;

    /**
     * @return If `true`, messages published with the same orderingKey in PubsubMessage will be delivered to
     * the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they
     * may be delivered in any order.
     * 
     */
    public Output<Optional<Boolean>> enableMessageOrdering() {
        return Codegen.optional(this.enableMessageOrdering);
    }
    /**
     * A policy that specifies the conditions for this subscription&#39;s expiration.
     * A subscription is considered active as long as any connected subscriber
     * is successfully consuming messages from the subscription or is issuing
     * operations on the subscription. If expirationPolicy is not set, a default
     * policy with ttl of 31 days will be used.  If it is set but ttl is &#34;&#34;, the
     * resource never expires.  The minimum allowed value for expirationPolicy.ttl
     * is 1 day.
     * Structure is documented below.
     * 
     */
    @Export(name="expirationPolicy", type=SubscriptionExpirationPolicy.class, parameters={})
    private Output<SubscriptionExpirationPolicy> expirationPolicy;

    /**
     * @return A policy that specifies the conditions for this subscription&#39;s expiration.
     * A subscription is considered active as long as any connected subscriber
     * is successfully consuming messages from the subscription or is issuing
     * operations on the subscription. If expirationPolicy is not set, a default
     * policy with ttl of 31 days will be used.  If it is set but ttl is &#34;&#34;, the
     * resource never expires.  The minimum allowed value for expirationPolicy.ttl
     * is 1 day.
     * Structure is documented below.
     * 
     */
    public Output<SubscriptionExpirationPolicy> expirationPolicy() {
        return this.expirationPolicy;
    }
    /**
     * The subscription only delivers the messages that match the filter.
     * Pub/Sub automatically acknowledges the messages that don&#39;t match the filter. You can filter messages
     * by their attributes. The maximum length of a filter is 256 bytes. After creating the subscription,
     * you can&#39;t modify the filter.
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output</* @Nullable */ String> filter;

    /**
     * @return The subscription only delivers the messages that match the filter.
     * Pub/Sub automatically acknowledges the messages that don&#39;t match the filter. You can filter messages
     * by their attributes. The maximum length of a filter is 256 bytes. After creating the subscription,
     * you can&#39;t modify the filter.
     * 
     */
    public Output<Optional<String>> filter() {
        return Codegen.optional(this.filter);
    }
    /**
     * A set of key/value label pairs to assign to this Subscription.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this Subscription.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * How long to retain unacknowledged messages in the subscription&#39;s
     * backlog, from the moment a message is published. If
     * retain_acked_messages is true, then this also configures the retention
     * of acknowledged messages, and thus configures how far back in time a
     * subscriptions.seek can be done. Defaults to 7 days. Cannot be more
     * than 7 days (`&#34;604800s&#34;`) or less than 10 minutes (`&#34;600s&#34;`).
     * A duration in seconds with up to nine fractional digits, terminated
     * by &#39;s&#39;. Example: `&#34;600.5s&#34;`.
     * 
     */
    @Export(name="messageRetentionDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> messageRetentionDuration;

    /**
     * @return How long to retain unacknowledged messages in the subscription&#39;s
     * backlog, from the moment a message is published. If
     * retain_acked_messages is true, then this also configures the retention
     * of acknowledged messages, and thus configures how far back in time a
     * subscriptions.seek can be done. Defaults to 7 days. Cannot be more
     * than 7 days (`&#34;604800s&#34;`) or less than 10 minutes (`&#34;600s&#34;`).
     * A duration in seconds with up to nine fractional digits, terminated
     * by &#39;s&#39;. Example: `&#34;600.5s&#34;`.
     * 
     */
    public Output<Optional<String>> messageRetentionDuration() {
        return Codegen.optional(this.messageRetentionDuration);
    }
    /**
     * Name of the subscription.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the subscription.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * If push delivery is used with this subscription, this field is used to
     * configure it. An empty pushConfig signifies that the subscriber will
     * pull and ack messages using API methods.
     * Structure is documented below.
     * 
     */
    @Export(name="pushConfig", type=SubscriptionPushConfig.class, parameters={})
    private Output</* @Nullable */ SubscriptionPushConfig> pushConfig;

    /**
     * @return If push delivery is used with this subscription, this field is used to
     * configure it. An empty pushConfig signifies that the subscriber will
     * pull and ack messages using API methods.
     * Structure is documented below.
     * 
     */
    public Output<Optional<SubscriptionPushConfig>> pushConfig() {
        return Codegen.optional(this.pushConfig);
    }
    /**
     * Indicates whether to retain acknowledged messages. If `true`, then
     * messages are not expunged from the subscription&#39;s backlog, even if
     * they are acknowledged, until they fall out of the
     * messageRetentionDuration window.
     * 
     */
    @Export(name="retainAckedMessages", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> retainAckedMessages;

    /**
     * @return Indicates whether to retain acknowledged messages. If `true`, then
     * messages are not expunged from the subscription&#39;s backlog, even if
     * they are acknowledged, until they fall out of the
     * messageRetentionDuration window.
     * 
     */
    public Output<Optional<Boolean>> retainAckedMessages() {
        return Codegen.optional(this.retainAckedMessages);
    }
    /**
     * A policy that specifies how Pub/Sub retries message delivery for this subscription.
     * If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers.
     * RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message
     * Structure is documented below.
     * 
     */
    @Export(name="retryPolicy", type=SubscriptionRetryPolicy.class, parameters={})
    private Output</* @Nullable */ SubscriptionRetryPolicy> retryPolicy;

    /**
     * @return A policy that specifies how Pub/Sub retries message delivery for this subscription.
     * If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers.
     * RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message
     * Structure is documented below.
     * 
     */
    public Output<Optional<SubscriptionRetryPolicy>> retryPolicy() {
        return Codegen.optional(this.retryPolicy);
    }
    /**
     * A reference to a Topic resource.
     * 
     */
    @Export(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return A reference to a Topic resource.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscription(String name) {
        this(name, SubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscription(String name, SubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscription(String name, SubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/subscription:Subscription", name, args == null ? SubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subscription(String name, Output<String> id, @Nullable SubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/subscription:Subscription", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Subscription get(String name, Output<String> id, @Nullable SubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subscription(name, id, state, options);
    }
}
