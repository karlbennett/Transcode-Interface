package org.karlbennett.transcode.media.io;

import org.karlbennett.transcode.media.AudioStream;
import org.karlbennett.transcode.media.MediaContainer;
import org.karlbennett.transcode.media.VideoStream;

/**
 * User: karl
 * Date: 21/11/11
 *
 * A media file, it exposes it's absolute URI, media container, audio, and video streams.
 */
public interface MediaFile {

    /**
     * Get the media files absolute URI.
     *
     * @return the media files absolute URI.
     */
    public String getFileUri();

    /**
     * Get the media files media container.
     *
     * @return the media files media container.
     */
    public MediaContainer getMediaContainer();

    /**
     * Get the number of audio streams within the media file.
     *
     * @return the number of audio streams within the media file.
     */
    public int getAudioStreamSize();

    /**
     * Get the audio stream at the provided index.
     *
     * @param i - the index of the audio stream.
     *
     * @return the requested audio stream.
     */
    public AudioStream getAudioStream(int i);

    /**
     * Get the number of video streams within the media file.
     *
     * @return the number of video streams within the media file.
     */
    public int getVideoStreamSize();

    /**
     * Get the video stream at the provided index.
     *
     * @param i - the index of the video stream.
     *
     * @return the requested video stream.
     */
    public VideoStream getVideoStream(int i);
}
