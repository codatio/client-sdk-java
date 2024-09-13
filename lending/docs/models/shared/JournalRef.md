# JournalRef

Links journal entries to the relevant journal in accounting integrations that use multi-book accounting (multiple journals).


## Fields

| Field                           | Type                            | Required                        | Description                     |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `id`                            | *String*                        | :heavy_check_mark:              | GUID of the underlying journal. |
| `name`                          | *JsonNullable<String>*          | :heavy_minus_sign:              | Name of journal                 |