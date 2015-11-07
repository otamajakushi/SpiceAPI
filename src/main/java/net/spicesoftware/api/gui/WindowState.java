package net.spicesoftware.api.gui;

import net.spicesoftware.api.util.vector.Vector2i;

/**
 * @since 2015/10/23
 */
public interface WindowState<WS extends WindowSystem> {

    /**
     * {@link Window}の{@link WindowTitle}を{@link Window#getDefaultTitle()}のものに設定します。
     */
    void setTitleToDefault();

    /**
     * {@link Window}の{@link WindowTitle}を設定します。
     *
     * @param title {@link Window}の{@link WindowTitle}
     */
    void setTitle(WindowTitle title);

    /**
     * {@link Window}の{@link WindowTitle}を返します。
     *
     * @return {@link Window}の{@link WindowTitle}
     */
    WindowTitle getTitle();

    /**
     * {@link Window}の位置の{@link Vector2i}を返します。
     *
     * @return {@link Window}の位置の{@link Vector2i}
     */
    Vector2i getPosition();

    /**
     * {@link Window}の位置を設定します。
     *
     * @param position {@link Window}に設定する位置の{@link Vector2i}
     */
    void setPosition(Vector2i position);

    /**
     * {@link Window}が見えるかどうかを設定します。
     *
     * @param visible 見えるなら{@code true}、見えないなら{@code false}
     */
    void setVisible(boolean visible);
}
