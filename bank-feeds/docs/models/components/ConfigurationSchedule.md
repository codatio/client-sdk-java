# ConfigurationSchedule


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `frequencyOptions`                                        | List<*String*>                                            | :heavy_minus_sign:                                        | The available sync frequencies.                           |
| `selectedFrequency`                                       | *Optional<? extends String>*                              | :heavy_minus_sign:                                        | The sync frequency.                                       |
| `startDate`                                               | *Optional<? extends String>*                              | :heavy_minus_sign:                                        | The datetime in UTC you want to start syncing from.       |
| `syncHourUtc`                                             | *Optional<? extends Long>*                                | :heavy_minus_sign:                                        | The hour in which the sync is initiated.                  |
| `timeZoneIanaId`                                          | *Optional<? extends String>*                              | :heavy_minus_sign:                                        | The [IANA](https://www.iana.org/time-zones) time zone ID. |