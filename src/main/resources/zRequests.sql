select document.id, operator.name
from document inner join operator on document.operator_id = operator.id
