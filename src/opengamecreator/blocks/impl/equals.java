/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opengamecreator.blocks.impl;

import edu.mit.blocks.codeblocks.Block;
import edu.mit.blocks.workspace.Workspace;
import opengamecreator.blocks.Maths;

/**
 *
 * @author Campbell Suter
 */
public class equals {

    public static String eval(Block b, Workspace w) {
        String[] d = Maths.socks(b, w);
        return "compare(" + d[0] + "," + d[1] + ")";
    }
}
