create table board
  (
     id             SERIAL PRIMARY KEY,
     name			text
     
  );
 
create table columns
	(
		id			SERIAL PRIMARY KEY,
		name		text,
		board_id	integer
	);

create table tasks
	(
		id			SERIAL PRIMARY KEY,
		name		text,
		description	text,
		column_id	integer,
		sequence	integer
	);
	
alter table columns
  ADD CONSTRAINT board_id_pk_constraint_columns FOREIGN KEY (
  board_id) REFERENCES board;

alter table tasks
  ADD CONSTRAINT column_id_pk_constraint_tasks FOREIGN KEY (
  column_id) REFERENCES columns;
