/*
 * Copyright (C) 2017 The Android Open Source Project
 * Copyright 2017 Gabriel Ittner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gabrielittner.sqlite;

import android.arch.persistence.db.SupportSQLiteProgram;

import io.requery.android.database.sqlite.SQLiteProgram;

/**
 * An wrapper around {@link SQLiteProgram} to implement {@link SupportSQLiteProgram} API.
 */
class RequerySQLiteProgram implements SupportSQLiteProgram {
    private final SQLiteProgram mDelegate;

    RequerySQLiteProgram(SQLiteProgram delegate) {
        mDelegate = delegate;
    }

    @Override
    public void bindNull(int index) {
        mDelegate.bindNull(index);
    }

    @Override
    public void bindLong(int index, long value) {
        mDelegate.bindLong(index, value);
    }

    @Override
    public void bindDouble(int index, double value) {
        mDelegate.bindDouble(index, value);
    }

    @Override
    public void bindString(int index, String value) {
        mDelegate.bindString(index, value);
    }

    @Override
    public void bindBlob(int index, byte[] value) {
        mDelegate.bindBlob(index, value);
    }

    @Override
    public void clearBindings() {
        mDelegate.clearBindings();
    }

    @Override
    public void close() throws Exception {
        mDelegate.close();
    }
}
