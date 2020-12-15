create index IX_16312B2A on gb_FriendEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B57E742C on gb_FriendEntry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A97F2947 on gb_Guestbook (groupId);
create index IX_3635ADF7 on gb_Guestbook (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4E6F4639 on gb_Guestbook (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6010EEFD on gb_GuestbookEntry (groupId, guestbookId);
create index IX_C907DBEF on gb_GuestbookEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C9649231 on gb_GuestbookEntry (uuid_[$COLUMN_LENGTH:75$], groupId);