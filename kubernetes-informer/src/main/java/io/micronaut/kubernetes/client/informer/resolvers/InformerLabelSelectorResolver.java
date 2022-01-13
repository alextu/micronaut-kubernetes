/*
 * Copyright 2017-2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.kubernetes.client.informer.resolvers;

import io.micronaut.context.annotation.DefaultImplementation;
import io.micronaut.core.annotation.AnnotationValue;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.kubernetes.client.informer.Informer;

/**
 * Informer label selector resolver.
 *
 * @author Pavol Gressa
 * @since 3.3
 */
@DefaultImplementation(DefaultInformerLabelSelectorResolver.class)
public interface InformerLabelSelectorResolver {

    /**
     * Resolves the informer's watched resources label selector.
     *
     * @param informer the informer
     * @return resource label selector or null
     */
    @Nullable
    String resolveInformerLabels(@NonNull AnnotationValue<Informer> informer);
}
