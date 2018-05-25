// Copyright (C) 2019 GerritForge Ltd
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.gerritforge.gerrit.plugins.account;

import java.util.Arrays;
import java.util.List;

import com.google.gerrit.common.Nullable;
import com.google.gerrit.extensions.annotations.PluginCanonicalWebUrl;
import com.google.gerrit.extensions.client.MenuItem;
import com.google.gerrit.extensions.webui.TopMenu;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class AccountTopMenu implements TopMenu {

  private final Provider<String> pluginUrl;

  @Inject
  public AccountTopMenu(@PluginCanonicalWebUrl @Nullable Provider<String> pluginUrl) {
    this.pluginUrl = pluginUrl;
  }

  @Override
  public List<MenuEntry> getEntries() {
    return Arrays.asList(new MenuEntry("Account",
        Arrays.asList(new MenuItem("Personal Information", pluginUrl.get() + "static/account.html", "_self"))));
  }

}
