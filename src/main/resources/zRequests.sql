select document.id, document.name, operator.name
from document inner join operator on document.operator_id = operator.id;
--
select document.name, category.name
from document inner join category on document.cat_id = category.id;
--
select category.name, field.name
from category inner join field on category.id = field.cat_id;
--
select document.id AS numDoc, document.name as name, field.name as field, value.info as valuee
from value left join field on value.field_id = field.id right join document on value.doc_id = document.id

select field.id, field.name, field.cat_id
from category left join field on category.id = cat_id
where cat_id=?