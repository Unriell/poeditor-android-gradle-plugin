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

package com.bq.poeditor.gradle

/**
 * Only for testing purposes.
 */
@Suppress("MagicNumber")
fun main() {
    val apiToken = "your_api_token"
    val projectId = 1234567890
    val resDirPath = "your_res_dir_path"
    val defaultLanguage = "en"

    PoEditorStringsImporter.importPoEditorStrings(apiToken, projectId, defaultLanguage, resDirPath)
}