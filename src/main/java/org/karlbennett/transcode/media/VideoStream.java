package org.karlbennett.transcode.media;

/**
 * User: karl
 * Date: 20/11/11
 *
 * The video stream of a media file. It exposes the mime type, width, height, and framerate for the audio stream.
 */
public interface VideoStream extends MediaStream {

    /**
     * Get the width in pixels of the video streams frame.
     *
     * @return the videos streams frame width.
     */
    public int getWidth();

    /**
     * Get the height in pixels of the video streams frame.
     *
     * @return  the videos streams frame height.
     */
    public int getHeight();

    /**
     * Get the framerate of the video stream.
     *
     * @return the videos streams framerate.
     */
    public int getFramerate();
}
