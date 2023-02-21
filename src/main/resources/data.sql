

INSERT INTO Product (product_id, title, brand,description,partnumber, size_guide, warranty_information,delivery_message,submission_time,id)
VALUES ('P123456', 'Ruched Sleeve Blazer', 'Brand A', 'Throw on this easy-to-wear crepe blazer to instantly smarten up on casual days. Designed in a laid-back relaxed fit with 3/4 length ruched sleeves. Edge-to-edge design with no fastenings. Flap pockets and peaked lapels. Fully lined for comfort.', '12345',
 'Our Standard womenswear range has been designed for a woman whose height is 168cm (5ft 6") and who has an inside leg of 79cm. The fit of a garment may vary depending on the cut, style and fabric.', 'Warranty information for product 1', 'No questions asked returns: For full-price and reduced price merchandise: ', '2023-02-21 10:00:00', 'T59/5939J');

INSERT INTO Photo (photo_id, client, logo_image_url, name, product_id)
VALUES ('100', 'Client A','https://asset1.cxnmarksandspencer.com/is/image/mands/SD_01_T59_5939J_Y0_X_EC_0?$PDP_MAIN_CAR_SM$', 'Product 1 image 1','P123456');
INSERT INTO Photo (photo_id, client, logo_image_url, name, product_id)
VALUES ('101', 'Client A','https://asset1.cxnmarksandspencer.com/is/image/mands/SD_01_T59_5939J_Y0_X_EC_0?$PDP_MAIN_CAR_SM$', 'Product 1 image 2','P123456');
INSERT INTO Photo (photo_id, client, logo_image_url, name, product_id)
VALUES ('102', 'Client A','https://asset1.cxnmarksandspencer.com/is/image/mands/SD_01_T59_5939J_Y0_X_EC_0?$PDP_MAIN_CAR_SM$', 'Product 1 image 3','P123456');
INSERT INTO Photo (photo_id, client, logo_image_url, name, product_id)
VALUES ('103', 'Client A','https://asset1.cxnmarksandspencer.com/is/image/mands/SD_01_T59_5939J_Y0_X_EC_0?$PDP_MAIN_CAR_SM$', 'Product 1 image 2','P123456');

INSERT INTO Price (product_id,offer_price,offer_text,sale_price,sale_text)
VALUES ('P123456', 19.99, 'Limited time offer', 14.99, 'Sale!');

INSERT INTO Inventory (product_id, count, stock_in_transit, stock_in_transit_date )
VALUES ('P123456', 100, true, '2023-02-21');

INSERT INTO Reviews (product_id,negative_feedback_count,positive_feedback_count,total_feedback_count )
VALUES ('P123456', 12, 8, 20);

INSERT INTO IND_REVIEWS (product_id,review_id,is_ratings_only,is_recommended,user_nickname ,review_text,rating)
VALUES ('P123456', 'review1', true, false, 'John', 'This is a positive review.', 4.5);
INSERT INTO IND_REVIEWS (product_id,review_id,is_ratings_only,is_recommended,user_nickname ,review_text,rating)
VALUES ('P123456', 'review2', true, false, 'Doe', 'This is a negative review.', 1.0);
INSERT INTO IND_REVIEWS (product_id,review_id,is_ratings_only,is_recommended,user_nickname ,review_text,rating)
VALUES ('P123456', 'review3', true, false, 'Rock', 'This is a positive review 2.', 4.0);
INSERT INTO IND_REVIEWS (product_id,review_id,is_ratings_only,is_recommended,user_nickname ,review_text,rating)
VALUES ('P123456', 'review4', true, false, 'John Wick', 'This is not positive review.', 3.5);
INSERT INTO IND_REVIEWS (product_id,review_id,is_ratings_only,is_recommended,user_nickname ,review_text,rating)
VALUES ('P123456', 'review5', true, false, 'Tom', 'This is a positive ii review.', 3.2);
