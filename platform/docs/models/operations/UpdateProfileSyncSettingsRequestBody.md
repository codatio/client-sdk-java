# UpdateProfileSyncSettingsRequestBody

Include a `syncSetting` object for each data type.
`syncFromWindow`, `syncFromUTC` & `monthsToSync` only need to be included if you wish to set a value for them.


## Fields

| Field                                                                                                                       | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `clientId`                                                                                                                  | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | Unique identifier for your client in Codat.                                                                                 |
| `overridesDefaults`                                                                                                         | *Optional<? extends Boolean>*                                                                                               | :heavy_minus_sign:                                                                                                          | Set to `True` if you want to override default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings). |
| `settings`                                                                                                                  | List<[io.codat.platform.models.shared.SyncSetting](../../models/shared/SyncSetting.md)>                                     | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |