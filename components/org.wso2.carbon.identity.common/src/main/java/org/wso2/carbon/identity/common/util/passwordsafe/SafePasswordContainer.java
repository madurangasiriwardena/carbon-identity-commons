/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.common.util.passwordsafe;

import java.io.Serializable;

/**
 * Class maintains an array where all the RandomPasswords are kept in an array.
 * This class is stored in distributed cache.
 */
public class SafePasswordContainer implements Serializable {

    private static final long serialVersionUID = -5282260905622533906L;

    private SafePassword[] safePasswords;
    private String uniqueID;

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public SafePassword[] getSafePasswords() {
        return safePasswords;
    }

    public void setSafePasswords(SafePassword[] safePasswords) {
        this.safePasswords = safePasswords;
    }


}
