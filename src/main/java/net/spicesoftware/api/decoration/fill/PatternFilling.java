package net.spicesoftware.api.decoration.fill;

import net.spicesoftware.api.decoration.Decoration;

/**
 * パターンです。
 *
 * @since 2015/01/26
 */
public interface PatternFilling extends Decoration {

    @Override
    PatternFilling copyDeeply();
}
