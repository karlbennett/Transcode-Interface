package org.karlbennett.transcode.media.io;


import java.io.IOException;

/**
 * User: karl
 * Date: 21/11/11
 */
public interface TranscodeInputStream {

    /**
     * Read a bytes worth of data from the transcoded stream.
     *
     * @return the byte that was read.
     *
     * @throws IOException if something went wrong wile reading the byte.
     */
    public int read() throws IOException;

    /**
     * Try and read as meany bytes from the transcoded stream that will fit into the provided array .
     *
     * @return the number of bytes read.
     *
     * @throws IOException if something went wrong wile reading the byte.
     */
    public int read(byte[] bytes) throws IOException;

    /**
     * Try and read <code>len</code> bytes from the transcoded stream into the provided byte array, where writing into the provided array
     * will start at <code>off</code> index.
     *
     * @return the number of bytes read.
     *
     * @throws IOException if something went wrong wile reading the byte.
     */
    public int read(byte[] bytes, int off, int len) throws IOException;
}
