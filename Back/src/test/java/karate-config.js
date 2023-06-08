function fn() {
  var env = karate.env;
  karate.log('karate.env system property was:', env);
  var config = {
    env: env,
    myVarName: 'someValue'
  }
    config.url = 'https://dummy.restapiexample.com/api/v1/'
  return config;
}