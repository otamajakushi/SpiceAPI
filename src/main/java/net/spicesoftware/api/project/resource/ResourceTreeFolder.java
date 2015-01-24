package net.spicesoftware.api.project.resource;

import javax.validation.constraints.Size;

/**
 * リソースツリーのフォルダです。
 *
 * @since 2014/12/23
 */
public interface ResourceTreeFolder extends ResourceTreeElement {

    String getFolderName();

    void setFolderName(@Size(min = 1) String name);
}
