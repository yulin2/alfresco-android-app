/*******************************************************************************
 * Copyright (C) 2005-2014 Alfresco Software Limited.
 *
 * This file is part of Alfresco Mobile for Android.
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
 *******************************************************************************/
package org.alfresco.mobile.android.platform.intent;

/**
 * @since 1.2
 * @author Jean Marie Pascal
 */
public interface PrivateIntent
{
    String ALFRESCO_SCHEME_SHORT = "alfresco";

    String ACTION_VIEW = "org.alfresco.mobile.android.intent.ACTION_VIEW";

    String EXTRA_NODE = "org.alfresco.mobile.android.intent.EXTRA_NODE";

    String EXTRA_CONTENT = "org.alfresco.mobile.android.intent.EXTRA_CONTENT";

    String EXTRA_FOLDER = "org.alfresco.mobile.android.intent.EXTRA_FOLDER";

    String EXTRA_FOLDER_ID = "org.alfresco.mobile.android.intent.EXTRA_FOLDER_ID";

    String NODE_TYPE = "org.alfresco.mobile.android/object.node";

    String EXTRA_DOCUMENT = "org.alfresco.mobile.android.intent.EXTRA_DOCUMENT";

    String EXTRA_DOCUMENTS = "org.alfresco.mobile.android.intent.EXTRA_DOCUMENTS";

    String EXTRA_DOCUMENT_ID = "org.alfresco.mobile.android.intent.EXTRA_DOCUMENT_ID";

    String EXTRA_DATA = "org.alfresco.mobile.android.intent.EXTRA_DATA";

    String EXTRA_FILE = "org.alfresco.mobile.android.intent.EXTRA_FILE";

    String EXTRA_FILE_PATH = "org.alfresco.mobile.android.intent.EXTRA_FILE_PATH";

    // ///////////////////////////////////////////////////////////////////////////
    // HELP GUIDE
    // ///////////////////////////////////////////////////////////////////////////
    String HELP_GUIDE = "view_help_guide";

    // ///////////////////////////////////////////////////////////////////////////
    // SIGNUP PROCESS
    // ///////////////////////////////////////////////////////////////////////////
    String CLOUD_SIGNUP = "sign_up_cloud";

    String CLOUD_SIGNUP_I = "sign_up_cloud_i";

    String ACTION_CHECK_SIGNUP = "org.alfresco.mobile.android.intent.ACTION_CHECK_SIGNUP";

    // ///////////////////////////////////////////////////////////////////////////
    // OAUTH MANAGEMENT
    // ///////////////////////////////////////////////////////////////////////////
    String ACTION_USER_AUTHENTICATION = "org.alfresco.mobile.android.intent.ACTION_USER_AUTHENTICATION";

    String CATEGORY_OAUTH = "org.alfresco.mobile.android.intent.CATEGORY_OAUTH";

    String CATEGORY_OAUTH_REFRESH = "org.alfresco.mobile.android.intent.CATEGORY_OAUTH_REFRESH";

    // ///////////////////////////////////////////////////////////////////////////
    // OPERATIONS MANAGEMENT
    // ///////////////////////////////////////////////////////////////////////////

    // ACTION
    String ACTION_DISPLAY_OPERATIONS = "org.alfresco.mobile.android.intent.ACTION_DISPLAY_OPERATIONS";

    // EXTRA
    String EXTRA_OPERATIONS_TYPE = "org.alfresco.mobile.android.intent.EXTRA_OPERATIONS_TYPE";

    // ///////////////////////////////////////////////////////////////////////////
    // ACCOUNT MANAGEMENT
    // ///////////////////////////////////////////////////////////////////////////
    // EXTRA
    String EXTRA_ACCOUNT_ID = "org.alfresco.mobile.android.intent.EXTRA_ACCOUNT_ID";

    String EXTRA_OAUTH_DATA = "org.alfresco.mobile.android.intent.EXTRA_OAUTH_DATA";

    // ///////////////////////////////////////////////////////////////////////////
    // DISPLAY DIALOG
    // ///////////////////////////////////////////////////////////////////////////
    // ACTION
    /** Display dialog with extra bundle */
    String ACTION_DISPLAY_DIALOG = "org.alfresco.mobile.android.intent.ACTION_DISPLAY_DIALOG";

    String ACTION_DISPLAY_ERROR = "org.alfresco.mobile.android.intent.DISPLAY_ERROR";

    String EXTRA_ERROR_DATA = "org.alfresco.mobile.android.intent.EXTRA_ERROR_DATA";

    // ///////////////////////////////////////////////////////////////////////////
    // FILES MANAGEMENT
    // ///////////////////////////////////////////////////////////////////////////
    // ACTION
    String ACTION_PICK_FILE = "org.alfresco.mobile.android.intent.ACTION_PICK_FILE";

    // ///////////////////////////////////////////////////////////////////////////
    // SYNC MANAGEMENT
    // ///////////////////////////////////////////////////////////////////////////
    // ACTION
    String ACTION_SYNCHRO_DISPLAY = "org.alfresco.mobile.android.intent.ACTION_SYNCHRO_DISPLAY";

    // ///////////////////////////////////////////////////////////////////////////
    // SETTINGS
    // ///////////////////////////////////////////////////////////////////////////
    String ACTION_DISPLAY_SETTINGS = "org.alfresco.mobile.android.intent.ACTION_DISPLAY_SETTINGS";

    // ///////////////////////////////////////////////////////////////////////////
    // ENCRYPTION
    // ///////////////////////////////////////////////////////////////////////////
    // BROADCAST
    //String ACTION_ENCRYPT_COMPLETED = "org.alfresco.mobile.android.intent.ACTION_ENCRYPT_COMPLETED";

    //String ACTION_DECRYPT_COMPLETED = "org.alfresco.mobile.android.intent.ACTION_DECRYPT_COMPLETED";

    //String ACTION_ENCRYPT_ALL_COMPLETED = "org.alfresco.mobile.android.intent.ACTION_ENCRYPT_ALL_COMPLETED";

    //String ACTION_DECRYPT_ALL_COMPLETED = "org.alfresco.mobile.android.intent.ACTION_DECRYPT_ALL_COMPLETED";

    // EXTRA
    //String EXTRA_INTENT_ACTION = "org.alfresco.mobile.android.intent.EXTRA_INTENT_ACTION";

    // ///////////////////////////////////////////////////////////////////////////
    // DATA CLEANER
    // ///////////////////////////////////////////////////////////////////////////
    // ACTION
    String ACTION_CLEAN_SHARE_FILE = "org.alfresco.mobile.android.intent.ACTION_CLEAN_SHARE_FILE";

    // ///////////////////////////////////////////////////////////////////////////
    // WORKFLOW MANAGEMENT
    // ///////////////////////////////////////////////////////////////////////////
    // ACTION
    String ACTION_START_PROCESS = "org.alfresco.mobile.android.intent.ACTION_START_PROCESS";
}