insert into customer
values(default, 'Konstantin_Turov'),
      (default, 'Evgeniy_Ipin'),
      (default, 'Robert_Pakov'),
      (default, 'Mihail_Volkov'),
      (default, 'Mark_Lipkin'),
      (default, 'Sergey_Rokinov'),
      (default, 'Viktor_Bulkin'),
      (default, 'Ekaterina_Nesterova'),
      (default, 'Anastasiya_Matina');


insert into product
values (default, 'Microwave_P-2000', 13000),
       (default, 'TV_Samsung', 35499),
       (default, 'Table_IKEA', 15000),
       (default, 'Book_JavaForBeginners', 1000),
       (default, 'Fridge_H-300', 50000),
       (default, 'Coffee_Maker_DeLonghi', 75499),
       (default, 'Toaster_K-500', 2400),
       (default, 'Lamp', 1500);

insert into customer_product
values (default, 13000, 1, 1),
       (default, 13000, 2, 1),
       (default, 13000, 3, 1),
       (default, 35499, 4, 2),
       (default, 35499, 5, 2),
       (default, 35499, 6, 2),
       (default, 15000, 7, 3),
       (default, 15000, 8, 3),
       (default, 15000, 9, 3),
       (default, 1000, 1, 4),
       (default, 1000, 2, 4),
       (default, 1000, 3, 4),
       (default, 50000, 4, 5),
       (default, 50000, 5, 5),
       (default, 50000, 6, 5),
       (default, 75499, 7, 6),
       (default, 75499, 8, 6),
       (default, 75499, 9, 6),
       (default, 2400, 1, 7),
       (default, 2400, 2, 7),
       (default, 2400, 3, 7),
       (default, 1500, 4, 8),
       (default, 1500, 5, 8),
       (default, 1500, 6, 8);

select * from customer_product;