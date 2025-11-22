def Calculator(s) -> int:
    copy = str(s)
    list = copy.split(" ")
    
    operators = ('+', '-', '*', '/', '^')
    
    stack = []
    
    for token in list:
        if token in operators:
            temp_1 = stack.pop()
            temp_2 = stack.pop()
            
            result = 0
            
            condition = not (token == '/' & temp_2 == 0)
            assert condition, "can not divide numbers by zero!"
            
            results = {'+': (temp_1 + temp_2), '-': (temp_1 - temp_2),
                       '*': (temp_1 * temp_2), '/': (temp_1 / temp_2),
                       '^': (temp_1 ** temp_2)}
            
            result = results[token]
            
            stack.append(result)
            
        else:
            stack.append(int(token))
            
    out = stack.pop()
    
    return out