package org.karlbennett.transcode.media.io;


import java.io.IOException;

/**
 * User: karl
 * Date: 21/11/11
 * <p/>
 * Input stream that takes a media file as it's input and produces a transcoded stream as it's output.
 */
public interface TranscodeInputStream {

    /**
     * Read a bytes worth of data from the transcoded stream.
     *
     * @return the byte that was read.
     * @throws IOException if something went wrong wile reading the byte.
     */
    public int read() throws IOException;

    /**
     * Try and read as meany bytes from the transcoded stream that will fit into the provided array .
     *
     * @param bytes - the array to hold the bytes that were read.
     * @return the number of bytes read.
     * @throws IOException if something went wrong wile reading the byte.
     */
    public int read(byte[] bytes) throws IOException;

    /**
     * Try and read <code>len</code> bytes from the transcoded stream into the provided byte array, where writing into the provided array
     * will start at <code>off</code> index.
     *
     * @param bytes - the array to hold the bytes that were read.
     * @param off   - the offset within the bytes array where the bytes should start being inserted.
     * @param len   - the maximum number of bytes that should be read.
     * @return the number of bytes read.
     * @throws IOException if something went wrong wile reading the byte.
     */
    public int read(byte[] bytes, int off, int len) throws IOException;

    /**
     * Close the <code>TranscodeInputStream</code>.
     *
     * @throws IOException if something went wrong wile reading the byte.
     */
    public void close() throws IOException;
}
