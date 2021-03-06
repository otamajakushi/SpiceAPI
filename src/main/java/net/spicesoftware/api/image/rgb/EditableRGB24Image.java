package net.spicesoftware.api.image.rgb;

import net.spicesoftware.api.SpiceStatic;
import net.spicesoftware.api.decoration.fill.RGB24Color;
import net.spicesoftware.api.image.ImageEditable;
import net.spicesoftware.api.util.vector.Vector2i;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 内容の編集可能なRGBのイメージです。
 *
 * @since 2015/01/17
 */
public interface EditableRGB24Image extends RGB24Image, ImageEditable {

    static Builder builder() {
        return SpiceStatic.getRegistry().createBuilder(Builder.class);
    }

    /**
     * この{@code EditableRGB24Image}の指定されたx, yの位置にRGB24の{@code int}を指定して色を設定します。
     *
     * @param x     色を設定するx位置
     * @param y     色を設定するy位置
     * @param color 設定するRGB24形式の色
     */
    void setColor(@Min(0) int x, @Min(0) int y, @Min(0) @Max(0xFFFFFF) int color);

    /**
     * この{@code EditableRGB24Image}の指定された{@link Vector2i}の位置にRGB24の{@code int}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color    設定するRGB24形式の色
     */
    void setColor(Vector2i position, @Min(0) @Max(0xFFFFFF) int color);

    /**
     * この{@code EditableRGB24Image}の指定されたx, yの位置に{@link RGB24Color}を指定して色を設定します。
     *
     * @param x     色を設定するx位置
     * @param y     色を設定するy位置
     * @param color 設定する色
     */
    void setColor(@Min(0) int x, @Min(0) int y, RGB24Color color);

    /**
     * この{@code EditableRGB24Image}の指定された{@link Vector2i}の位置に{@link RGB24Color}を指定して色を設定します。
     *
     * @param position 色を設定する位置
     * @param color    設定する色
     */
    void setColor(Vector2i position, RGB24Color color);

    @Override
    CachedRGB24Image makeImage();

    @Override
    EditableRGB24Image copyDeeply();

    /**
     * @since 2015/11/14
     */
    interface Builder extends RGB24ImageBuilder<EditableRGB24Image> {

        @Override
        Builder background(RGB24Color backgroundColor);

        @Override
        Builder background(@Min(0) @Max(0xFFFFFF) int backgroundColor) throws IllegalArgumentException;

        @Override
        Builder size(@Min(0) int width, @Min(0) int height) throws IllegalArgumentException;

        @Override
        Builder size(Vector2i size) throws IllegalArgumentException;
    }
}
