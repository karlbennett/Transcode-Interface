package org.karlbennett.transcode.media;

/**
 * User: karl
 * Date: 20/11/11
 *
 * The container for a media file. It exposes the mime type and a description for the container.
 */
public interface MediaContainer extends MediaStream {

    /**
     * Get a description for this container.
     *
     * @return a description fo the container.
     */
    public String getDescription();
}
