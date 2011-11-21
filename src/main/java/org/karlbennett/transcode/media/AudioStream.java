package org.karlbennett.transcode.media;

/**
 * User: karl
 * Date: 20/11/11
 *
 * The audio stream of a media file. It exposes the mime type, sample rate, and channels for the audio stream.
 */
public interface AudioStream extends MediaStream {

    /**
     * Get the audio streams sample rate.
     *
     * @return the audio streams sample rate.
     */
    public int getSampleRate();

    /**
     * Get the audio streams channel.
     *
     * @return the audio streams channel.
     */
    public int getChannels();
}
