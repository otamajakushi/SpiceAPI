package net.spicesoftware.api.item;

/**
 * @since 2015/01/26
 */
public interface ItemText extends ItemRenderable {

    /**
     * この{@code ItemText}のテキストを取得します。
     *
     * @return このテキストアイテムのテキスト
     */
    String getText();

    /**
     * この{@code ItemText}のテキストを設定します。
     *
     * @param text このテキストアイテムに設定するテキスト
     */
    void setText(String text);

    @Override
    ItemText copyDeeply();
}
