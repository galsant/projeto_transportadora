const proxy = [
    {
      context: '/',
      target: 'http://localhost:8080',
      secure: false,
      changeOrigin: true
    }
  ];
  module.exports = proxy;