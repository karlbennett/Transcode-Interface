package org.karlbennett.transcode.media;

/**
 * User: karl
 * Date: 20/11/11
 *
 * A media files media stream. It exposes the mime type for the stream.
 */
public interface MediaStream {

    /**
     * Get the mime type for this media stream.
     *
     * @return the mime type for this media stream.
     */
    public String getMimeType();
}
