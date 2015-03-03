package net.spicesoftware.api.resource;

import net.spicesoftware.api.marker.Markable;
import net.spicesoftware.api.util.DeepCopyable;

import java.io.Serializable;

/**
 * リソースです。
 *
 * @since 2014/10/05
 */
public interface Resource extends Markable, Serializable, DeepCopyable {

    @Override
    Resource copyDeeply();
}
