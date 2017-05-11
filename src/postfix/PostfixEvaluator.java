/**
Copyright 2017 prahveen29@gmail.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

* @author Prahveen Thiruchelvam
**
*/

package postfix;

import interfaces.PostfixInterface;
import stack.Stack;

public class PostfixEvaluator implements PostfixInterface{

	private String expr;
	private int lenOfExpr;

	public PostfixEvaluator(){
		//TODO
	}

	@Override
	//TODO What the hell you are doing prahveen -_- , is it good one
	public int evaluate(String postfixExpresion) {
		expr = postfixExpresion;
		lenOfExpr = expr.length();
		Stack stack = new Stack(lenOfExpr);

		int i  = 0;
		while(lenOfExpr > i){
		if(isAnOperator(expr.charAt(i)) != true){
				stack.push(Character.getNumericValue((char) expr.charAt(i)));
			}else {
				int operand1, operand2;
				operand2 = (int)stack.pop();
				operand1 = (int)stack.pop();

				switch(expr.charAt(i)){
					case '+' : stack.push((operand1 + operand2)); break;
					case '-' : stack.push((operand1 - operand2)); break;
					case '/' : stack.push((operand1 / operand2)); break;
					case '*' : stack.push((operand1 * operand2)); break;
				}
			}
			i++;
		}
		return (int) stack.peek();
	}

	//check given character is + - / *
	private boolean isAnOperator(char c){
		switch(c){
			case '+' :
			case '-' :
			case '*' :
			case '/' : return true;
			default  : return false;
		}
	}
}
