create table business (
    id                  integer      primary key autoincrement,
    name                varchar (80) not null,
    document_number     numeric (11) not null,
    created_by          varchar(10),
    created_date        datetime,
    last_modified_by    varchar(10),
    last_modified_date  datetime,
    version             integer

);