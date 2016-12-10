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
package org.exbin.deltahex.intellij;

import com.intellij.openapi.vfs.VirtualFileAdapter;
import com.intellij.openapi.vfs.VirtualFileEvent;

import javax.swing.*;

/**
 * File listener for hexadecimal editor.
 *
 * @author ExBin Project (http://exbin.org)
 * @version 0.1.0 2016/12/08
 */
public class FileListener extends VirtualFileAdapter {

    private JPanel editor;

    public FileListener(JPanel viewer) {
        this.editor = viewer;
    }

    public void contentsChanged(VirtualFileEvent event) {
//        if (event.getFile().equals(this.editor.getCanvas().getFile())) {
//            this.editor.getCanvas().showSelectedFile();
//        }
    }
}