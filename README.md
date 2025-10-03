# DEPRECATION NOTICE

GerritForge has decided to [change the license to BSL](https://gitenterprise.me/2025/09/30/re-licensing-gerritforge-plugins-welcome-to-gerrit-enterprise/)
therefore the Apache 2.0 version of this plugin is deprecated.
The recommended version of the account plugin is on [GitHub](https://github.com/GerritForge/account)
and the development continues on [GerritHub.io](https://review.gerrithub.io/admin/repos/GerritForge/account,general).

# Account management plugin for Gerrit Code Review (DEPRECATED)

A plugin that allows accounts to be deleted from Gerrit via an SSH command or
REST API.

## How to build

To build this plugin you need to have Bazel and Gerrit source tree. See the
[detailed instructions](/src/main/resources/Documentation/build.md) on how to build it.

## Commands

This plugin adds an new [SSH command](/src/main/resources/Documentation/cmd-delete.md)
and a [REST API](/src/main/resources/Documentation/rest-api-accounts.md) for removing
accounts from Gerrit.
