INSERT INTO app_user(password,username) VALUES ("admin","admin");
INSERT INTO role(name) VALUES ("ADMIN");
INSERT INTO user_role(user_id,role_id) VALUES (1,1);

INSERT INTO patient(id,first_name,last_name,birth_day,pesel) VALUES (1,"tomasz","Taksk","11-12-1995","123123123");
INSERT INTO patient(id,first_name,last_name,birth_day,pesel) VALUES (2,"wwsa","aasdasd","12-12-2001","123123123");

INSERT INTO contract_type(id,name,start_date,end_date,salary) VALUES (1,"etat","11-015-1212","11-20-1212",12000.0);

INSERT INTO warehouse_employees(id,max_number_of_employees) VALUES (1,40);

INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Tomasz","Baran","lekarz",1,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("Krystyna","Baran","lekarz",1,1);
INSERT INTO employee(first_name,last_name,position,contract_type_id,warehouse_employees_id) VALUES ("waclawa","Baran","pielegniarka",1,1);

INSERT INTO item(name,unit,unit_price,comments,quantity,value) VALUES ("miotla",3,123.0,"ta miotla jest najlepsza",1,122);
INSERT INTO item(name,unit,unit_price,comments,quantity,value) VALUES ("szczotka",1,13.0,"ta miotla jest najlepsza",12,3121);
INSERT INTO item(name,unit,unit_price,comments,quantity,value) VALUES ("wanna",2,1233.0,"ta miotla jest najlepsza",2,124124);

INSERT INTO stocktaking(date,employee_id) VALUES ("2017-01-01",1);
INSERT INTO stocktaking(date,employee_id) VALUES ("2017-01-01",2);
INSERT INTO stocktaking(date,employee_id) VALUES ("2017-01-01",3);


INSERT INTO stocktaking_item_list(stocktaking_id,item_list_id) VALUES (1,1);
INSERT INTO stocktaking_item_list(stocktaking_id,item_list_id) VALUES (1,2);
INSERT INTO stocktaking_item_list(stocktaking_id,item_list_id) VALUES (1,3);



