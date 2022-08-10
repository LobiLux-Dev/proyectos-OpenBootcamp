const fibonacci = n => {
  if (n === 0)
    return 0

  let result = [1, 1]

  for (let i = 0; i < n - 2; i++) {
    result = [...result, result[i] + result[i + 1]]
  }

  return result
}

console.log(fibonacci(6))
