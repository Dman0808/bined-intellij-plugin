/*
 * Copyright (C) ExBin Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.exbin.bined.intellij;

import com.intellij.ide.scratch.RootType;
import com.intellij.ide.scratch.ScratchRootType;
import com.intellij.openapi.extensions.ExtensionPointName;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Scratch root type for binary files.
 *
 * @author ExBin Project (https://exbin.org)
 */
@ParametersAreNonnullByDefault
public class BinaryRootType extends RootType {

    private static final String ID = "org.exbin.bined.intellij.BinaryRootType";
    public static final ExtensionPointName<BinaryRootType> ROOT_EP = new ExtensionPointName<>(ID);

    public BinaryRootType() {
        super(ID, "Binary File (BinEd plugin)");
    }

    @NotNull
    public static BinaryRootType getInstance() {
        return findByClass(BinaryRootType.class);
    }
}
