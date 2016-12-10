/*
 * Copyright (C) ExBin Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.exbin.utils.binary_data;

import java.io.IOException;

/**
 * Interface for seekable stream.
 *
 * @version 0.1.0 2016/05/24
 * @author ExBin Project (http://exbin.org)
 */
public interface SeekableStream {

    /**
     * Moves position in the stream to given position from the start of the
     * stream.
     *
     * @param position target position
     * @throws IOException if input/output error
     */
    public void seek(long position) throws IOException;

    /**
     * Returns length of the stream.
     *
     * @return length of the stream in bytes, -1 if unable to determine
     */
    public long getStreamSize();
}
