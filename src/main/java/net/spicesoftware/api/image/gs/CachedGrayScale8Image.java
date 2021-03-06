package net.spicesoftware.api.image.gs;

import net.spicesoftware.api.image.CachedImage;

/**
 * 内容を変更できない読み取り専用のグレースケールイメージです。
 *
 * @since 2015/01/17
 */
public interface CachedGrayScale8Image extends GrayScale8Image, CachedImage {

    @Override
    CachedGrayScale8Image copyDeeply();
}
