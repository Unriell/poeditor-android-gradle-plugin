/*
 * Copyright 2020 BQ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bq.poeditor.gradle.utils

import org.junit.Assert
import org.junit.Test

class LocaleUtilsTest {
    @Test
    fun `Creating values modifier from standard lang code works`() {
        Assert.assertEquals("es", createValuesModifierFromLangCode("es"))
    }

    @Test
    fun `Creating values modifier from specialized lang code works`() {
        Assert.assertEquals("es-rMX", createValuesModifierFromLangCode("es-mx"))
    }
}