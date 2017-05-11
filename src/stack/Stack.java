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

package stack;

import java.util.Arrays;

import interfaces.StackInterface;

public class Stack implements StackInterface{
	private int stacktop;
	private int maxsize;
	private Object[] stack;

	public Stack(int size){
		maxsize = size;
		stacktop = -1;
		stack = new Object[maxsize];
	}

	@Override
	public void push(Object x) {
		if(isFull() != true) {
			stack[++stacktop] = x;
		} else {
			System.err.println("Stack Overfloor");
		}
	}

	@Override
	public Object pop() {
		if(isEmpty() != true){
			return stack[stacktop--];
		} else {
			return null;
		}
	}

	@Override
	public Object peek() {
		if(isEmpty() == true){
			return null;
		}else{
			return stack[stacktop];
		}
	}

	@Override
	public boolean isEmpty() {
		return (stacktop == -1);
	}

	@Override
	public boolean isFull() {
		return stacktop == maxsize - 1;
	}
	
}
