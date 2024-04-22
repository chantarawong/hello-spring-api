// Path: index.js
// Description: This file is the entry point for the server. It sets up the server and handles requests.
// It should use the express module to set up the server.
// It should use the swagger-ui-express and swagger-jsdoc modules to set up the swagger documentation for the api.
// It should use the swagger-config.js file to set up the swagger documentation for the api.
// It should use swagger comments to document the api endpoints.
// It should use the http get method to handle the requests.
// The endpoints should call functions imported from the math-utils folder to implement the math logic
// The server should listen on port 3000

const express = require('express');
// Import math utils
const math_utils_add = require('./math_utils_add');

//import substract module please  
//copilot, please import substract module
const math_utils_substract = require('./math_utils_substract');



// Import swagger
const swaggerUi = require('swagger-ui-express');
const swaggerJsDoc = require('swagger-jsdoc');
const swaggerConfig = require('./swagger-config');
const app = express();

app.use(express.json());

// Swagger setup
const specs = swaggerJsDoc(swaggerConfig);
app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(specs));

// Start the server
app.listen(3000, () => {
  console.log('Server is running on port 3000');
});

// REQUEST HANDLERS

/** 
 * @swagger
 /add:
 get:
 *     summary: Use to request the sum of two numbers
 *     parameters:
 *       - name: a
 *         in: query
 *         description: The first number to add
 *         required: true
 *         type: integer
 *       - name: b
 *         in: query
 *         description: The second number to add
 *         required: true
 *         type: integer
 *     responses:
 *        '200':
 *           description: Successful response
*/
app.get('/add', (req, res) => {
  res.send(math_utils_add(req.query.a, req.query.b).toString());
});



//copilot, please add http get endpoint to substract two numbers
app.get('/substract', (req, res) => {
  res.send(math_utils_substract(req.query.a, req.query.b).toString());
});


