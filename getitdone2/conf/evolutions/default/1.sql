# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                        integer auto_increment not null,
  name                      varchar(255),
  description               varchar(255),
  constraint pk_category primary key (id))
;

create table feedback (
  feedback_id               integer auto_increment not null,
  task_task_id              integer,
  commentary                varchar(255),
  stars                     integer,
  reciever_name             varchar(255),
  constraint pk_feedback primary key (feedback_id))
;

create table message (
  message_id                integer auto_increment not null,
  title                     varchar(255),
  message                   varchar(255),
  sender_name               varchar(255),
  receiver_name             varchar(255),
  constraint pk_message primary key (message_id))
;

create table request (
  request_id                integer auto_increment not null,
  message                   varchar(255),
  accepted                  integer,
  task_task_id              integer,
  requester_name            varchar(255),
  constraint pk_request primary key (request_id))
;

create table task (
  task_id                   integer auto_increment not null,
  title                     varchar(255),
  done                      boolean,
  description               varchar(255),
  category                  integer,
  zipcode                   varchar(255),
  reward                    varchar(255),
  due_date                  timestamp,
  assigned_to_name          varchar(255),
  worker_name               varchar(255),
  constraint pk_task primary key (task_id))
;

create table account (
  name                      varchar(255) not null,
  email                     varchar(255),
  password                  varchar(255),
  zipcode                   integer,
  constraint pk_account primary key (name))
;

create sequence account_seq;

alter table feedback add constraint fk_feedback_task_1 foreign key (task_task_id) references task (task_id) on delete restrict on update restrict;
create index ix_feedback_task_1 on feedback (task_task_id);
alter table feedback add constraint fk_feedback_reciever_2 foreign key (reciever_name) references account (name) on delete restrict on update restrict;
create index ix_feedback_reciever_2 on feedback (reciever_name);
alter table message add constraint fk_message_sender_3 foreign key (sender_name) references account (name) on delete restrict on update restrict;
create index ix_message_sender_3 on message (sender_name);
alter table message add constraint fk_message_receiver_4 foreign key (receiver_name) references account (name) on delete restrict on update restrict;
create index ix_message_receiver_4 on message (receiver_name);
alter table request add constraint fk_request_task_5 foreign key (task_task_id) references task (task_id) on delete restrict on update restrict;
create index ix_request_task_5 on request (task_task_id);
alter table request add constraint fk_request_requester_6 foreign key (requester_name) references account (name) on delete restrict on update restrict;
create index ix_request_requester_6 on request (requester_name);
alter table task add constraint fk_task_assigned_to_7 foreign key (assigned_to_name) references account (name) on delete restrict on update restrict;
create index ix_task_assigned_to_7 on task (assigned_to_name);
alter table task add constraint fk_task_worker_8 foreign key (worker_name) references account (name) on delete restrict on update restrict;
create index ix_task_worker_8 on task (worker_name);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists category;

drop table if exists feedback;

drop table if exists message;

drop table if exists request;

drop table if exists task;

drop table if exists account;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists account_seq;

