/* 
 * This file is compatible with the Deterministic Network Calculator (DNC) v2.5.
 *
 * The Deterministic Network Calculator (DNC) is free software;
 * you can redistribute it and/or modify it under the terms of the 
 * GNU Lesser General Public License as published by the Free Software Foundation; 
 * either version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 * 
 */ 

package default;

import java.util.LinkedList;

import org.networkcalculus.dnc.AnalysisConfig.Multiplexing;
import org.networkcalculus.dnc.curves.Curve;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.network.server_graph.ServerGraph;
import org.networkcalculus.dnc.network.server_graph.ServerGraphFactory;

public class GLP20_u_70.0 implements ServerGraphFactory {
	private ServerGraph sg;
	private static Curve factory = Curve.getFactory();

	public void createServers1( ServerGraph sg, Server[] servers ) throws Exception {
		servers[10] = sg.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),271.42857142857144}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[32] = sg.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),114.28571428571429}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[0] = sg.addServer( "s34", factory.createServiceCurve( "SC{(0.0,0.0),200.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[35] = sg.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),128.57142857142858}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[6] = sg.addServer( "s28", factory.createServiceCurve( "SC{(0.0,0.0),85.71428571428572}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[36] = sg.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[3] = sg.addServer( "s31", factory.createServiceCurve( "SC{(0.0,0.0),192.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[1] = sg.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),71.42857142857143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[30] = sg.addServer( "s24", factory.createServiceCurve( "SC{(0.0,0.0),242.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[31] = sg.addServer( "s33", factory.createServiceCurve( "SC{(0.0,0.0),42.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[37] = sg.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),157.14285714285714}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[5] = sg.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),71.42857142857143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[25] = sg.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),250.00000000000003}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[8] = sg.addServer( "s37", factory.createServiceCurve( "SC{(0.0,0.0),71.42857142857143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[24] = sg.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),171.42857142857144}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[26] = sg.addServer( "s36", factory.createServiceCurve( "SC{(0.0,0.0),200.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[18] = sg.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),142.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[34] = sg.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),78.57142857142857}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[2] = sg.addServer( "s29", factory.createServiceCurve( "SC{(0.0,0.0),121.42857142857143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[4] = sg.addServer( "s30", factory.createServiceCurve( "SC{(0.0,0.0),42.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[11] = sg.addServer( "s32", factory.createServiceCurve( "SC{(0.0,0.0),278.5714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[22] = sg.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),164.2857142857143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[29] = sg.addServer( "s26", factory.createServiceCurve( "SC{(0.0,0.0),42.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[27] = sg.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),92.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[17] = sg.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),57.142857142857146}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[19] = sg.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),100.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[21] = sg.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),342.8571428571429}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[28] = sg.addServer( "s35", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[13] = sg.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),221.42857142857144}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[20] = sg.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),371.42857142857144}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[16] = sg.addServer( "s25", factory.createServiceCurve( "SC{(0.0,0.0),92.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[7] = sg.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),21.42857142857143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[15] = sg.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),42.85714285714286}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[9] = sg.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),35.714285714285715}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[33] = sg.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[14] = sg.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[23] = sg.addServer( "s27", factory.createServiceCurve( "SC{(0.0,0.0),71.42857142857143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[12] = sg.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),121.42857142857143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
	}

	public void createTurns1( ServerGraph sg, Server[] servers ) throws Exception {
		sg.addTurn( "t38", servers[29], servers[11] );
		sg.addTurn( "t47", servers[22], servers[0] );
		sg.addTurn( "t41", servers[0], servers[4] );
		sg.addTurn( "t5", servers[20], servers[36] );
		sg.addTurn( "t1", servers[17], servers[22] );
		sg.addTurn( "t45", servers[3], servers[14] );
		sg.addTurn( "t28", servers[21], servers[20] );
		sg.addTurn( "t13", servers[1], servers[6] );
		sg.addTurn( "t15", servers[7], servers[30] );
		sg.addTurn( "t34", servers[5], servers[30] );
		sg.addTurn( "t24", servers[25], servers[31] );
		sg.addTurn( "t14", servers[7], servers[35] );
		sg.addTurn( "t17", servers[9], servers[10] );
		sg.addTurn( "t50", servers[26], servers[20] );
		sg.addTurn( "t44", servers[3], servers[35] );
		sg.addTurn( "t2", servers[17], servers[13] );
		sg.addTurn( "t20", servers[37], servers[12] );
		sg.addTurn( "t48", servers[22], servers[28] );
		sg.addTurn( "t11", servers[19], servers[14] );
		sg.addTurn( "t53", servers[12], servers[23] );
		sg.addTurn( "t39", servers[2], servers[28] );
		sg.addTurn( "t42", servers[30], servers[11] );
		sg.addTurn( "t25", servers[11], servers[21] );
		sg.addTurn( "t32", servers[18], servers[24] );
		sg.addTurn( "t26", servers[13], servers[25] );
		sg.addTurn( "t18", servers[9], servers[24] );
		sg.addTurn( "t51", servers[26], servers[13] );
		sg.addTurn( "t52", servers[6], servers[32] );
		sg.addTurn( "t8", servers[24], servers[13] );
		sg.addTurn( "t36", servers[15], servers[2] );
		sg.addTurn( "t23", servers[25], servers[3] );
		sg.addTurn( "t35", servers[5], servers[16] );
		sg.addTurn( "t22", servers[8], servers[26] );
		sg.addTurn( "t29", servers[21], servers[22] );
		sg.addTurn( "t12", servers[19], servers[30] );
		sg.addTurn( "t33", servers[5], servers[14] );
		sg.addTurn( "t49", servers[26], servers[33] );
		sg.addTurn( "t16", servers[7], servers[16] );
		sg.addTurn( "t31", servers[18], servers[36] );
		sg.addTurn( "t6", servers[24], servers[33] );
		sg.addTurn( "t10", servers[19], servers[35] );
		sg.addTurn( "t40", servers[2], servers[26] );
		sg.addTurn( "t9", servers[16], servers[27] );
		sg.addTurn( "t46", servers[3], servers[16] );
		sg.addTurn( "t19", servers[32], servers[18] );
		sg.addTurn( "t37", servers[29], servers[3] );
		sg.addTurn( "t27", servers[21], servers[33] );
		sg.addTurn( "t7", servers[24], servers[22] );
		sg.addTurn( "t43", servers[30], servers[31] );
		sg.addTurn( "t3", servers[34], servers[19] );
		sg.addTurn( "t0", servers[17], servers[20] );
		sg.addTurn( "t4", servers[20], servers[10] );
		sg.addTurn( "t30", servers[10], servers[37] );
		sg.addTurn( "t21", servers[8], servers[0] );
	}

	public void createFlows1( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f94", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f111", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f121", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f99", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f131", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f125", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f50", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f81", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f138", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f106", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f140", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f74", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f127", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f143", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f54", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f112", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f68", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f126", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f64", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f135", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f136", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f118", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f128", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f107", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		sg.addFlow( "f116", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f51", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f117", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f49", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f130", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		sg.addFlow( "f104", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f88", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f87", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f80", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f123", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f93", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f67", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		sg.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f82", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f96", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f146", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f119", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f141", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f92", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f113", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f53", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f79", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows2( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f137", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f85", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f101", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f56", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f110", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f103", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f114", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f61", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f122", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f98", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f65", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f86", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f129", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f73", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f132", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f63", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f144", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f83", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f120", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f52", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		sg.addFlow( "f60", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f47", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f145", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f151", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f76", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f109", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f75", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f66", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f48", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f71", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f89", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f148", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f100", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f108", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f124", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f78", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f115", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f142", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f133", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f97", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f84", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f90", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f57", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f59", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f55", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f102", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f77", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f134", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows3( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f91", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f62", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f70", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f95", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f69", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f58", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f149", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f147", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f105", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f139", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f150", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f72", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public GLP20_u_70.0() {
		sg = createServerGraph();
	}

	public ServerGraph createServerGraph() {
		Server[] servers = new Server[38];
		sg = new ServerGraph();
		try{
			createServers1( sg, servers );
			createTurns1( sg, servers );
			createFlows1( sg, servers );
			createFlows2( sg, servers );
			createFlows3( sg, servers );
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sg;
	}

	public ServerGraph getServerGraph() {
		return sg;
	}

	public void reinitializeCurves() {
		sg = createServerGraph();
	}
}
