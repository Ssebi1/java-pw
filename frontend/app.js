var express = require('express');

var app = express();
const {createProxyMiddleware} = require('http-proxy-middleware')
app.use(
  '/api',
  createProxyMiddleware({
    target: 'http://localhost:8080',
    changeOrigin: true,
  }),
);

app.set('views', 'views');
app.set('view engine', 'ejs');
app.use(express.json())
app.use(express.urlencoded({ extended: true }))
app.use(express.static('./public'));

app.get('/login', (req, res) => {
    res.render('login', { title: 'Login' });
});

app.get('/register', (req, res) => {
    res.render('register', { title: 'Register' });
});

app.listen(8282, function () {
    console.log('Frontend started!');
})