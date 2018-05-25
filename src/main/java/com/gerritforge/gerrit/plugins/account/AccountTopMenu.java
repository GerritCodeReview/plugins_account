
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
