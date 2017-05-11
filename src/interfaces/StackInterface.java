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

package interfaces;

public interface StackInterface {
	public void push(Object x); //Insert into the stack
	public Object pop(); // remove form the stack
	public Object peek(); // stacktop (Top of the element)
	public boolean isEmpty(); //if stack is empty
	public boolean isFull(); //is stack is Full
}
