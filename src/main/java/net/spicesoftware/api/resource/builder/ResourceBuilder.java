package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.Builder;
import net.spicesoftware.api.resource.Resource;
import net.spicesoftware.api.util.DeepCopyable;

/**
 * リソースを作成するビルダーです。
 *
 * @since 2014/12/23
 */
public interface ResourceBuilder<T extends Resource> extends DeepCopyable, Builder<T> {

    @Override
    ResourceBuilder copyDeeply();
}
