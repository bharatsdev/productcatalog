INSERT INTO product(product_name,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES('Shirts',sysdate,'Bharat',sysdate,'bharat'); 
INSERT INTO product(product_name,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES('Pants',sysdate,'Bharat',sysdate,'bharat'); 
INSERT INTO product(product_name,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES('Jeans',sysdate,'Bharat',sysdate,'bharat'); 
INSERT INTO product(product_name,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES('Socks',sysdate,'Bharat',sysdate,'bharat'); 

-- Seller
INSERT INTO seller(seller_name,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES('futureGroup',sysdate,'Bharat',sysdate,'bharat'); 
INSERT INTO seller(seller_name,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES('birla',sysdate,'Bharat',sysdate,'bharat'); 

-- Brand 
INSERT INTO brand(brand_name,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES('Rebook',sysdate,'Bharat',sysdate,'bharat'); 
INSERT INTO brand(brand_name,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES('Splash',sysdate,'Bharat',sysdate,'bharat'); 

-- Product Inventory 
INSERT INTO PRODUCT_CATALOG(BRAND_ID,PRODUCT_ID , PRODUCT_COLOR , PRODUCT_COUNT, PRODUCT_PRICE ,PRODUCT_SIZE, product_sku, SELLER_ID ,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES(1,1 , 'red' , 2, 232 ,21, 232,1, sysdate,'Bharat',sysdate,'bharat' ); 
INSERT INTO PRODUCT_CATALOG(BRAND_ID,PRODUCT_ID , PRODUCT_COLOR , PRODUCT_COUNT, PRODUCT_PRICE ,PRODUCT_SIZE,product_sku,  SELLER_ID ,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES(2,2 , 'red' , 2, 232 ,21, 345,1, sysdate,'Bharat',sysdate,'bharat' ); 
INSERT INTO PRODUCT_CATALOG(BRAND_ID,PRODUCT_ID , PRODUCT_COLOR , PRODUCT_COUNT, PRODUCT_PRICE ,PRODUCT_SIZE, product_sku, SELLER_ID ,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES(1,3 , 'red' , 2, 232 ,21, 567,1, sysdate,'Bharat',sysdate,'bharat' ); 
INSERT INTO PRODUCT_CATALOG(BRAND_ID,PRODUCT_ID , PRODUCT_COLOR , PRODUCT_COUNT, PRODUCT_PRICE ,PRODUCT_SIZE, product_sku ,SELLER_ID ,create_Date_Time,created_By, updated_Date_Time,updated_By) VALUES(2,1 , 'red' , 2, 232 ,21, 876, 2, sysdate,'Bharat',sysdate,'bharat' ); 