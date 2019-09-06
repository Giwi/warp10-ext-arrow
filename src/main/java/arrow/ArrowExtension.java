//
//   Copyright 2019  SenX S.A.S.
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
//

package arrow;

import arrow.warpscriptFunctions.ARROWTO;
import arrow.warpscriptFunctions.TOARROW;
import io.warp10.script.NamedWarpScriptFunction;
import io.warp10.warp.sdk.WarpScriptExtension;

import java.util.HashMap;
import java.util.Map;

public class ArrowExtension extends WarpScriptExtension {

  private static final Map<String, Object> functions;

  public static final String TOARROW = "->ARROW";
  public static final String ARROWTO = "ARROW->";

  static {
    functions = new HashMap<String, Object>();

    addFunction(new TOARROW(TOARROW));
    addFunction(new ARROWTO(ARROWTO));
  }

  private static void addFunction(NamedWarpScriptFunction fun) {
    functions.put(fun.getName(), fun);
  }
  public Map<String, Object> getFunctions() { return functions; }
  public static Map<String, Object> staticGetFunctions() { return functions; }
}
