CREATE TABLE "field" (
	"id" serial NOT NULL,
	"name" varchar NOT NULL UNIQUE,
	"cat_id" int NOT NULL,
	CONSTRAINT field_pk PRIMARY KEY ("id")
) WITH (
OIDS=FALSE
);



CREATE TABLE "category" (
	"id" serial NOT NULL,
	"name" varchar NOT NULL UNIQUE,
	CONSTRAINT category_pk PRIMARY KEY ("id")
) WITH (
OIDS=FALSE
);



CREATE TABLE "value" (
	"id" serial NOT NULL,
	"doc_id" int NOT NULL,
	"field_id" int NOT NULL,
	"info" varchar NOT NULL,
	CONSTRAINT value_pk PRIMARY KEY ("id")
) WITH (
OIDS=FALSE
);



CREATE TABLE "operator" (
	"id" serial NOT NULL,
	"name" varchar NOT NULL UNIQUE,
	CONSTRAINT operator_pk PRIMARY KEY ("id")
) WITH (
OIDS=FALSE
);



CREATE TABLE "document" (
	"id" serial NOT NULL,
	"cat_id" int NOT NULL,
	"operator_id" int NOT NULL,
	CONSTRAINT document_pk PRIMARY KEY ("id")
) WITH (
OIDS=FALSE
);



ALTER TABLE "field" ADD CONSTRAINT "field_fk0" FOREIGN KEY ("cat_id") REFERENCES "category"("id");


ALTER TABLE "value" ADD CONSTRAINT "value_fk0" FOREIGN KEY ("doc_id") REFERENCES "document"("id");
ALTER TABLE "value" ADD CONSTRAINT "value_fk1" FOREIGN KEY ("field_id") REFERENCES "field"("id");


ALTER TABLE "document" ADD CONSTRAINT "document_fk0" FOREIGN KEY ("cat_id") REFERENCES "category"("id");
ALTER TABLE "document" ADD CONSTRAINT "document_fk1" FOREIGN KEY ("operator_id") REFERENCES "operator"("id");
