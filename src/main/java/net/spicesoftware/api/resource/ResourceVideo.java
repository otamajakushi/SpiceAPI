package net.spicesoftware.api.resource;

import net.spicesoftware.api.SpiceStatic;

/**
 * 映像のリソースです。
 *
 * @since 2014/10/05
 */
public interface ResourceVideo extends ResourceFromFile {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    @Override
    ResourceVideo copyDeeply();

    /**
     * 映像リソースを作成するビルダーです。
     *
     * @since 2014/12/23
     */
    interface Builder extends ResourceFromFileBuilder<ResourceVideo> {

        @Override
        ResourceFromFileBuilder copyDeeply();
    }
}
