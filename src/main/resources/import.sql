INSERT INTO app_user(password,username) VALUES ("admin","admin");
INSERT INTO role(name) VALUES ("ADMIN");
INSERT INTO user_role(user_id,role_id) VALUES (1,1);

INSERT INTO patient(first_name,last_name,birth_day,pesel) VALUES ("Jan","Kowalski","11-12-1995","90121306123");
INSERT INTO patient(first_name,last_name,birth_day,pesel) VALUES ("Jan","Kowalski","11-12-1995","90121306123");
INSERT INTO patient(first_name,last_name,birth_day,pesel) VALUES ("Jan","Kowalski","11-12-1995","90121306123");
INSERT INTO patient(first_name,last_name,birth_day,pesel) VALUES ("Jan","Kowalski","11-12-1995","90121306123");
INSERT INTO patient(first_name,last_name,birth_day,pesel) VALUES ("Jan","Kowalski","11-12-1995","90121306123");
INSERT INTO patient(first_name,last_name,birth_day,pesel) VALUES ("Jan","Kowalski","11-12-1995","90121306123");



INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (1,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (2,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (3,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (4,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (5,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (6,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (7,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (8,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (9,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (10,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (11,"etat","2014-01-01","2020-01-01",12000.0);
INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (12,"etat","2014-01-01","2020-01-01",12000.0);



INSERT INTO warehouse_employees(id,max_number_of_employees) VALUES (1,40);

INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Jan","Kowalski","lekarz",1,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Jan","Kowalski","lekarz",2,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Jan","Kowalski","lekarz",3,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Jan","Kowalski","lekarz",4,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Jan","Kowalski","lekarz",5,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Jan","Kowalski","lekarz",6,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Katarzyna","Nazwisko","pielegniarka",7,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Katarzyna","Nazwisko","pielegniarka",8,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Katarzyna","Nazwisko","pielegniarka",9,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Katarzyna","Nazwisko","pielegniarka",10,1);


INSERT INTO stocktaking(code,date,name,founder,unit,unit_price,quantity,value,description) VALUES (123,"01-01-2018","komputer","Jan Kowalski","sztuka",500.0,5,2500,"opis");
INSERT INTO stocktaking(code,date,name,founder,unit,unit_price,quantity,value,description) VALUES (123,"01-01-2018","komputer","Jan Kowalski","sztuka",500.0,5,2500,"opis");
INSERT INTO stocktaking(code,date,name,founder,unit,unit_price,quantity,value,description) VALUES (123,"01-01-2018","komputer","Jan Kowalski","sztuka",500.0,5,2500,"opis");
INSERT INTO stocktaking(code,date,name,founder,unit,unit_price,quantity,value,description) VALUES (123,"01-01-2018","komputer","Jan Kowalski","sztuka",500.0,5,2500,"opis");
INSERT INTO stocktaking(code,date,name,founder,unit,unit_price,quantity,value,description) VALUES (123,"01-01-2018","komputer","Jan Kowalski","sztuka",500.0,5,2500,"opis");
INSERT INTO stocktaking(code,date,name,founder,unit,unit_price,quantity,value,description) VALUES (123,"01-01-2018","komputer","Jan Kowalski","sztuka",500.0,5,2500,"opis");
INSERT INTO stocktaking(code,date,name,founder,unit,unit_price,quantity,value,description) VALUES (123,"01-01-2018","komputer","Jan Kowalski","sztuka",500.0,5,2500,"opis");
INSERT INTO stocktaking(code,date,name,founder,unit,unit_price,quantity,value,description) VALUES (123,"01-01-2018","komputer","Jan Kowalski","sztuka",500.0,5,2500,"opis");




