package net.spicesoftware.api.resource.builder;

import net.spicesoftware.api.resource.ResourceFromFile;

import java.io.File;

/**
 * @since 2014/12/23
 */
public interface ResourceFromFileBuilder extends ResourceBuilder {

    /**
     * 設定されているファイルを返します
     *
     * @return 設定されているファイル
     */
    File getFile();

    /**
     * ファイルを設定します
     *
     * @param file 設定するファイル
     */
    void setFile(File file);

    @Override
    ResourceFromFile build() throws IllegalStateException;

    @Override
    ResourceFromFileBuilder copy();
}
