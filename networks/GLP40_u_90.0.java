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

public class GLP40_u_90.0 implements ServerGraphFactory {
	private ServerGraph sg;
	private static Curve factory = Curve.getFactory();

	public void createServers1( ServerGraph sg, Server[] servers ) throws Exception {
		servers[54] = sg.addServer( "s75", factory.createServiceCurve( "SC{(0.0,0.0),38.888888888888886}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[33] = sg.addServer( "s81", factory.createServiceCurve( "SC{(0.0,0.0),44.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[4] = sg.addServer( "s29", factory.createServiceCurve( "SC{(0.0,0.0),11.11111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[46] = sg.addServer( "s45", factory.createServiceCurve( "SC{(0.0,0.0),27.77777777777778}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[8] = sg.addServer( "s36", factory.createServiceCurve( "SC{(0.0,0.0),150.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[3] = sg.addServer( "s88", factory.createServiceCurve( "SC{(0.0,0.0),61.11111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[81] = sg.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[24] = sg.addServer( "s30", factory.createServiceCurve( "SC{(0.0,0.0),66.66666666666667}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[87] = sg.addServer( "s113", factory.createServiceCurve( "SC{(0.0,0.0),55.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[30] = sg.addServer( "s67", factory.createServiceCurve( "SC{(0.0,0.0),66.66666666666667}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[45] = sg.addServer( "s83", factory.createServiceCurve( "SC{(0.0,0.0),72.22222222222221}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[99] = sg.addServer( "s28", factory.createServiceCurve( "SC{(0.0,0.0),94.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[55] = sg.addServer( "s55", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[6] = sg.addServer( "s50", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[77] = sg.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[66] = sg.addServer( "s26", factory.createServiceCurve( "SC{(0.0,0.0),94.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[80] = sg.addServer( "s74", factory.createServiceCurve( "SC{(0.0,0.0),55.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[107] = sg.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[10] = sg.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),33.333333333333336}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[14] = sg.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[112] = sg.addServer( "s115", factory.createServiceCurve( "SC{(0.0,0.0),111.11111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[89] = sg.addServer( "s116", factory.createServiceCurve( "SC{(0.0,0.0),111.11111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[96] = sg.addServer( "s31", factory.createServiceCurve( "SC{(0.0,0.0),61.11111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[70] = sg.addServer( "s84", factory.createServiceCurve( "SC{(0.0,0.0),66.66666666666667}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[88] = sg.addServer( "s79", factory.createServiceCurve( "SC{(0.0,0.0),5.555555555555555}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[12] = sg.addServer( "s111", factory.createServiceCurve( "SC{(0.0,0.0),183.33333333333334}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[95] = sg.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),55.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[82] = sg.addServer( "s69", factory.createServiceCurve( "SC{(0.0,0.0),94.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[1] = sg.addServer( "s44", factory.createServiceCurve( "SC{(0.0,0.0),55.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[22] = sg.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),311.1111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[79] = sg.addServer( "s87", factory.createServiceCurve( "SC{(0.0,0.0),16.666666666666668}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[53] = sg.addServer( "s85", factory.createServiceCurve( "SC{(0.0,0.0),55.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[90] = sg.addServer( "s82", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[40] = sg.addServer( "s97", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[103] = sg.addServer( "s32", factory.createServiceCurve( "SC{(0.0,0.0),88.88888888888889}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[50] = sg.addServer( "s95", factory.createServiceCurve( "SC{(0.0,0.0),22.22222222222222}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[43] = sg.addServer( "s56", factory.createServiceCurve( "SC{(0.0,0.0),55.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[5] = sg.addServer( "s66", factory.createServiceCurve( "SC{(0.0,0.0),55.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[32] = sg.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),22.22222222222222}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[25] = sg.addServer( "s89", factory.createServiceCurve( "SC{(0.0,0.0),183.33333333333334}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[27] = sg.addServer( "s112", factory.createServiceCurve( "SC{(0.0,0.0),61.11111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[28] = sg.addServer( "s49", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[48] = sg.addServer( "s62", factory.createServiceCurve( "SC{(0.0,0.0),22.22222222222222}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[97] = sg.addServer( "s86", factory.createServiceCurve( "SC{(0.0,0.0),44.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[84] = sg.addServer( "s72", factory.createServiceCurve( "SC{(0.0,0.0),77.77777777777777}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[38] = sg.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),5.555555555555555}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[36] = sg.addServer( "s59", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[115] = sg.addServer( "s99", factory.createServiceCurve( "SC{(0.0,0.0),27.77777777777778}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[29] = sg.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),38.888888888888886}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[75] = sg.addServer( "s102", factory.createServiceCurve( "SC{(0.0,0.0),27.77777777777778}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[78] = sg.addServer( "s80", factory.createServiceCurve( "SC{(0.0,0.0),133.33333333333334}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[71] = sg.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),33.333333333333336}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[102] = sg.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),172.22222222222223}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[23] = sg.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),66.66666666666667}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[61] = sg.addServer( "s70", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[35] = sg.addServer( "s100", factory.createServiceCurve( "SC{(0.0,0.0),22.22222222222222}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[109] = sg.addServer( "s42", factory.createServiceCurve( "SC{(0.0,0.0),72.22222222222221}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[34] = sg.addServer( "s71", factory.createServiceCurve( "SC{(0.0,0.0),111.11111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[42] = sg.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[117] = sg.addServer( "s64", factory.createServiceCurve( "SC{(0.0,0.0),27.77777777777778}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[18] = sg.addServer( "s65", factory.createServiceCurve( "SC{(0.0,0.0),133.33333333333334}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[83] = sg.addServer( "s39", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[92] = sg.addServer( "s48", factory.createServiceCurve( "SC{(0.0,0.0),88.88888888888889}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[108] = sg.addServer( "s40", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[60] = sg.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[0] = sg.addServer( "s41", factory.createServiceCurve( "SC{(0.0,0.0),427.77777777777777}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[13] = sg.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),33.333333333333336}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[63] = sg.addServer( "s60", factory.createServiceCurve( "SC{(0.0,0.0),22.22222222222222}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[86] = sg.addServer( "s104", factory.createServiceCurve( "SC{(0.0,0.0),38.888888888888886}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[64] = sg.addServer( "s33", factory.createServiceCurve( "SC{(0.0,0.0),5.555555555555555}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[21] = sg.addServer( "s91", factory.createServiceCurve( "SC{(0.0,0.0),155.55555555555554}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[16] = sg.addServer( "s105", factory.createServiceCurve( "SC{(0.0,0.0),61.11111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[47] = sg.addServer( "s77", factory.createServiceCurve( "SC{(0.0,0.0),100.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[52] = sg.addServer( "s108", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[113] = sg.addServer( "s43", factory.createServiceCurve( "SC{(0.0,0.0),38.888888888888886}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[58] = sg.addServer( "s90", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[41] = sg.addServer( "s109", factory.createServiceCurve( "SC{(0.0,0.0),66.66666666666667}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[62] = sg.addServer( "s61", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[101] = sg.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),272.22222222222223}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[17] = sg.addServer( "s35", factory.createServiceCurve( "SC{(0.0,0.0),88.88888888888889}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[49] = sg.addServer( "s37", factory.createServiceCurve( "SC{(0.0,0.0),83.33333333333333}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[73] = sg.addServer( "s51", factory.createServiceCurve( "SC{(0.0,0.0),100.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[59] = sg.addServer( "s94", factory.createServiceCurve( "SC{(0.0,0.0),72.22222222222221}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[56] = sg.addServer( "s117", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[20] = sg.addServer( "s38", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[76] = sg.addServer( "s110", factory.createServiceCurve( "SC{(0.0,0.0),72.22222222222221}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[93] = sg.addServer( "s68", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[104] = sg.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[72] = sg.addServer( "s103", factory.createServiceCurve( "SC{(0.0,0.0),44.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[105] = sg.addServer( "s96", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[31] = sg.addServer( "s93", factory.createServiceCurve( "SC{(0.0,0.0),66.66666666666667}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[68] = sg.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),72.22222222222221}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[37] = sg.addServer( "s101", factory.createServiceCurve( "SC{(0.0,0.0),44.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[98] = sg.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),72.22222222222221}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[15] = sg.addServer( "s53", factory.createServiceCurve( "SC{(0.0,0.0),127.77777777777777}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[44] = sg.addServer( "s58", factory.createServiceCurve( "SC{(0.0,0.0),116.66666666666666}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[91] = sg.addServer( "s92", factory.createServiceCurve( "SC{(0.0,0.0),38.888888888888886}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[116] = sg.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[9] = sg.addServer( "s57", factory.createServiceCurve( "SC{(0.0,0.0),116.66666666666666}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[51] = sg.addServer( "s63", factory.createServiceCurve( "SC{(0.0,0.0),44.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[110] = sg.addServer( "s46", factory.createServiceCurve( "SC{(0.0,0.0),261.1111111111111}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[85] = sg.addServer( "s25", factory.createServiceCurve( "SC{(0.0,0.0),77.77777777777777}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[11] = sg.addServer( "s34", factory.createServiceCurve( "SC{(0.0,0.0),116.66666666666666}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[74] = sg.addServer( "s52", factory.createServiceCurve( "SC{(0.0,0.0),16.666666666666668}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[111] = sg.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),22.22222222222222}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[2] = sg.addServer( "s24", factory.createServiceCurve( "SC{(0.0,0.0),50.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[67] = sg.addServer( "s114", factory.createServiceCurve( "SC{(0.0,0.0),5.555555555555555}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[65] = sg.addServer( "s76", factory.createServiceCurve( "SC{(0.0,0.0),105.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[7] = sg.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),83.33333333333333}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[69] = sg.addServer( "s78", factory.createServiceCurve( "SC{(0.0,0.0),0.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[100] = sg.addServer( "s98", factory.createServiceCurve( "SC{(0.0,0.0),38.888888888888886}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[114] = sg.addServer( "s54", factory.createServiceCurve( "SC{(0.0,0.0),166.66666666666666}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[94] = sg.addServer( "s73", factory.createServiceCurve( "SC{(0.0,0.0),16.666666666666668}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[26] = sg.addServer( "s47", factory.createServiceCurve( "SC{(0.0,0.0),150.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[106] = sg.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),38.888888888888886}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[19] = sg.addServer( "s106", factory.createServiceCurve( "SC{(0.0,0.0),44.44444444444444}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[57] = sg.addServer( "s27", factory.createServiceCurve( "SC{(0.0,0.0),5.555555555555555}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[39] = sg.addServer( "s107", factory.createServiceCurve( "SC{(0.0,0.0),55.55555555555556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
	}

	public void createTurns1( ServerGraph sg, Server[] servers ) throws Exception {
		sg.addTurn( "t72", servers[70], servers[28] );
		sg.addTurn( "t171", servers[111], servers[82] );
		sg.addTurn( "t380", servers[78], servers[73] );
		sg.addTurn( "t331", servers[65], servers[107] );
		sg.addTurn( "t86", servers[87], servers[113] );
		sg.addTurn( "t330", servers[65], servers[81] );
		sg.addTurn( "t43", servers[37], servers[113] );
		sg.addTurn( "t418", servers[40], servers[22] );
		sg.addTurn( "t207", servers[72], servers[108] );
		sg.addTurn( "t289", servers[0], servers[85] );
		sg.addTurn( "t85", servers[87], servers[109] );
		sg.addTurn( "t245", servers[102], servers[109] );
		sg.addTurn( "t466", servers[45], servers[0] );
		sg.addTurn( "t237", servers[8], servers[95] );
		sg.addTurn( "t236", servers[8], servers[68] );
		sg.addTurn( "t292", servers[0], servers[4] );
		sg.addTurn( "t459", servers[46], servers[33] );
		sg.addTurn( "t206", servers[72], servers[83] );
		sg.addTurn( "t158", servers[94], servers[26] );
		sg.addTurn( "t4", servers[12], servers[78] );
		sg.addTurn( "t257", servers[14], servers[104] );
		sg.addTurn( "t53", servers[64], servers[29] );
		sg.addTurn( "t100", servers[103], servers[113] );
		sg.addTurn( "t357", servers[63], servers[84] );
		sg.addTurn( "t13", servers[44], servers[110] );
		sg.addTurn( "t183", servers[33], servers[10] );
		sg.addTurn( "t343", servers[42], servers[73] );
		sg.addTurn( "t347", servers[42], servers[55] );
		sg.addTurn( "t384", servers[35], servers[9] );
		sg.addTurn( "t462", servers[45], servers[49] );
		sg.addTurn( "t324", servers[16], servers[114] );
		sg.addTurn( "t358", servers[63], servers[94] );
		sg.addTurn( "t164", servers[94], servers[114] );
		sg.addTurn( "t91", servers[49], servers[67] );
		sg.addTurn( "t167", servers[61], servers[98] );
		sg.addTurn( "t208", servers[72], servers[0] );
		sg.addTurn( "t195", servers[117], servers[26] );
		sg.addTurn( "t118", servers[97], servers[102] );
		sg.addTurn( "t160", servers[94], servers[28] );
		sg.addTurn( "t323", servers[16], servers[15] );
		sg.addTurn( "t2", servers[12], servers[69] );
		sg.addTurn( "t77", servers[70], servers[55] );
		sg.addTurn( "t10", servers[92], servers[9] );
		sg.addTurn( "t199", servers[117], servers[74] );
		sg.addTurn( "t423", servers[106], servers[50] );
		sg.addTurn( "t470", servers[27], servers[50] );
		sg.addTurn( "t153", servers[99], servers[95] );
		sg.addTurn( "t24", servers[62], servers[82] );
		sg.addTurn( "t157", servers[94], servers[110] );
		sg.addTurn( "t131", servers[69], servers[85] );
		sg.addTurn( "t106", servers[50], servers[65] );
		sg.addTurn( "t416", servers[40], servers[77] );
		sg.addTurn( "t241", servers[102], servers[20] );
		sg.addTurn( "t266", servers[100], servers[99] );
		sg.addTurn( "t137", servers[57], servers[47] );
		sg.addTurn( "t37", servers[37], servers[8] );
		sg.addTurn( "t295", servers[66], servers[20] );
		sg.addTurn( "t436", servers[25], servers[116] );
		sg.addTurn( "t285", servers[85], servers[13] );
		sg.addTurn( "t136", servers[57], servers[65] );
		sg.addTurn( "t441", servers[86], servers[12] );
		sg.addTurn( "t248", servers[102], servers[46] );
		sg.addTurn( "t439", servers[7], servers[91] );
		sg.addTurn( "t243", servers[102], servers[108] );
		sg.addTurn( "t431", servers[43], servers[106] );
		sg.addTurn( "t115", servers[51], servers[99] );
		sg.addTurn( "t378", servers[78], servers[28] );
		sg.addTurn( "t89", servers[49], servers[12] );
		sg.addTurn( "t450", servers[21], servers[8] );
		sg.addTurn( "t458", servers[21], servers[46] );
		sg.addTurn( "t205", servers[72], servers[20] );
		sg.addTurn( "t231", servers[34], servers[15] );
		sg.addTurn( "t99", servers[103], servers[109] );
		sg.addTurn( "t56", servers[75], servers[30] );
		sg.addTurn( "t211", servers[72], servers[46] );
		sg.addTurn( "t163", servers[94], servers[15] );
		sg.addTurn( "t480", servers[48], servers[98] );
		sg.addTurn( "t373", servers[15], servers[69] );
		sg.addTurn( "t300", servers[66], servers[1] );
		sg.addTurn( "t281", servers[85], servers[77] );
		sg.addTurn( "t220", servers[84], servers[107] );
		sg.addTurn( "t411", servers[53], servers[14] );
		sg.addTurn( "t67", servers[19], servers[113] );
		sg.addTurn( "t104", servers[54], servers[40] );
		sg.addTurn( "t368", servers[11], servers[71] );
		sg.addTurn( "t302", servers[41], servers[25] );
		sg.addTurn( "t144", servers[71], servers[2] );
		sg.addTurn( "t308", servers[89], servers[58] );
		sg.addTurn( "t168", servers[61], servers[116] );
		sg.addTurn( "t301", servers[66], servers[46] );
		sg.addTurn( "t60", servers[19], servers[8] );
		sg.addTurn( "t125", servers[79], servers[54] );
		sg.addTurn( "t62", servers[19], servers[20] );
		sg.addTurn( "t287", servers[85], servers[107] );
		sg.addTurn( "t407", servers[56], servers[13] );
		sg.addTurn( "t391", servers[114], servers[68] );
		sg.addTurn( "t187", servers[76], servers[108] );
		sg.addTurn( "t169", servers[111], servers[30] );
		sg.addTurn( "t433", servers[43], servers[81] );
		sg.addTurn( "t455", servers[21], servers[0] );
		sg.addTurn( "t128", servers[79], servers[69] );
		sg.addTurn( "t288", servers[0], servers[2] );
		sg.addTurn( "t421", servers[40], servers[81] );
		sg.addTurn( "t7", servers[47], servers[67] );
		sg.addTurn( "t293", servers[66], servers[8] );
		sg.addTurn( "t186", servers[76], servers[83] );
		sg.addTurn( "t428", servers[43], servers[23] );
		sg.addTurn( "t375", servers[78], servers[110] );
		sg.addTurn( "t280", servers[104], servers[4] );
		sg.addTurn( "t133", servers[69], servers[99] );
		sg.addTurn( "t346", servers[42], servers[114] );
		sg.addTurn( "t165", servers[94], servers[55] );
		sg.addTurn( "t303", servers[41], servers[58] );
		sg.addTurn( "t318", servers[16], servers[92] );
		sg.addTurn( "t152", servers[99], servers[68] );
		sg.addTurn( "t221", servers[73], servers[30] );
		sg.addTurn( "t42", servers[37], servers[109] );
		sg.addTurn( "t228", servers[34], servers[28] );
		sg.addTurn( "t476", servers[105], servers[112] );
		sg.addTurn( "t174", servers[24], servers[23] );
		sg.addTurn( "t275", servers[30], servers[10] );
		sg.addTurn( "t452", servers[21], servers[20] );
		sg.addTurn( "t242", servers[102], servers[83] );
		sg.addTurn( "t389", servers[114], servers[14] );
		sg.addTurn( "t352", servers[18], servers[67] );
		sg.addTurn( "t191", servers[76], servers[1] );
		sg.addTurn( "t326", servers[65], servers[22] );
		sg.addTurn( "t34", servers[59], servers[114] );
		sg.addTurn( "t256", servers[14], servers[23] );
		sg.addTurn( "t112", servers[51], servers[85] );
		sg.addTurn( "t177", servers[24], servers[106] );
		sg.addTurn( "t229", servers[34], servers[6] );
		sg.addTurn( "t404", servers[56], servers[22] );
		sg.addTurn( "t240", servers[102], servers[49] );
		sg.addTurn( "t393", servers[114], servers[71] );
		sg.addTurn( "t263", servers[100], servers[85] );
		sg.addTurn( "t76", servers[70], servers[114] );
		sg.addTurn( "t390", servers[114], servers[38] );
		sg.addTurn( "t227", servers[34], servers[92] );
		sg.addTurn( "t332", servers[23], servers[54] );
		sg.addTurn( "t181", servers[29], servers[45] );
		sg.addTurn( "t203", servers[72], servers[8] );
		sg.addTurn( "t39", servers[37], servers[20] );
		sg.addTurn( "t1", servers[12], servers[65] );
		sg.addTurn( "t437", servers[7], servers[58] );
		sg.addTurn( "t468", servers[45], servers[113] );
		sg.addTurn( "t202", servers[117], servers[55] );
		sg.addTurn( "t130", servers[69], servers[2] );
		sg.addTurn( "t329", servers[65], servers[13] );
		sg.addTurn( "t119", servers[97], servers[14] );
		sg.addTurn( "t21", servers[44], servers[55] );
		sg.addTurn( "t350", servers[18], servers[27] );
		sg.addTurn( "t44", servers[37], servers[1] );
		sg.addTurn( "t189", servers[76], servers[109] );
		sg.addTurn( "t319", servers[16], servers[28] );
		sg.addTurn( "t434", servers[25], servers[98] );
		sg.addTurn( "t132", servers[69], servers[66] );
		sg.addTurn( "t75", servers[70], servers[15] );
		sg.addTurn( "t69", servers[70], servers[110] );
		sg.addTurn( "t11", servers[92], servers[36] );
		sg.addTurn( "t159", servers[94], servers[92] );
		sg.addTurn( "t184", servers[76], servers[8] );
		sg.addTurn( "t341", servers[42], servers[28] );
		sg.addTurn( "t461", servers[45], servers[8] );
		sg.addTurn( "t151", servers[99], servers[38] );
		sg.addTurn( "t190", servers[76], servers[113] );
		sg.addTurn( "t475", servers[105], servers[67] );
		sg.addTurn( "t219", servers[84], servers[81] );
		sg.addTurn( "t180", servers[29], servers[90] );
		sg.addTurn( "t260", servers[14], servers[81] );
		sg.addTurn( "t65", servers[19], servers[0] );
		sg.addTurn( "t454", servers[21], servers[108] );
		sg.addTurn( "t3", servers[12], servers[88] );
		sg.addTurn( "t17", servers[44], servers[73] );
		sg.addTurn( "t162", servers[94], servers[73] );
		sg.addTurn( "t64", servers[19], servers[108] );
		sg.addTurn( "t103", servers[54], servers[105] );
		sg.addTurn( "t429", servers[43], servers[22] );
		sg.addTurn( "t279", servers[104], servers[99] );
		sg.addTurn( "t469", servers[45], servers[1] );
		sg.addTurn( "t371", servers[15], servers[65] );
		sg.addTurn( "t383", servers[78], servers[55] );
		sg.addTurn( "t398", servers[101], servers[6] );
		sg.addTurn( "t147", servers[71], servers[57] );
		sg.addTurn( "t232", servers[34], servers[114] );
		sg.addTurn( "t412", servers[53], servers[68] );
		sg.addTurn( "t271", servers[32], servers[82] );
		sg.addTurn( "t88", servers[87], servers[46] );
		sg.addTurn( "t80", servers[87], servers[8] );
		sg.addTurn( "t316", servers[16], servers[110] );
		sg.addTurn( "t269", servers[4], servers[40] );
		sg.addTurn( "t479", servers[48], servers[7] );
		sg.addTurn( "t339", servers[42], servers[110] );
		sg.addTurn( "t48", servers[90], servers[7] );
		sg.addTurn( "t427", servers[43], servers[77] );
		sg.addTurn( "t267", servers[4], servers[50] );
		sg.addTurn( "t209", servers[72], servers[113] );
		sg.addTurn( "t262", servers[100], servers[2] );
		sg.addTurn( "t78", servers[3], servers[64] );
		sg.addTurn( "t30", servers[59], servers[6] );
		sg.addTurn( "t146", servers[71], servers[66] );
		sg.addTurn( "t377", servers[78], servers[92] );
		sg.addTurn( "t33", servers[59], servers[15] );
		sg.addTurn( "t138", servers[57], servers[88] );
		sg.addTurn( "t49", servers[90], servers[111] );
		sg.addTurn( "t290", servers[0], servers[57] );
		sg.addTurn( "t9", servers[47], servers[89] );
		sg.addTurn( "t472", servers[27], servers[100] );
		sg.addTurn( "t19", servers[44], servers[15] );
		sg.addTurn( "t422", servers[40], servers[107] );
		sg.addTurn( "t135", servers[57], servers[54] );
		sg.addTurn( "t225", servers[34], servers[110] );
		sg.addTurn( "t395", servers[101], servers[26] );
		sg.addTurn( "t140", servers[39], servers[25] );
		sg.addTurn( "t154", servers[99], servers[101] );
		sg.addTurn( "t213", servers[13], servers[80] );
		sg.addTurn( "t430", servers[43], servers[104] );
		sg.addTurn( "t379", servers[78], servers[6] );
		sg.addTurn( "t247", servers[102], servers[1] );
		sg.addTurn( "t314", servers[31], servers[67] );
		sg.addTurn( "t105", servers[54], servers[100] );
		sg.addTurn( "t79", servers[3], servers[11] );
		sg.addTurn( "t166", servers[61], servers[7] );
		sg.addTurn( "t120", servers[97], servers[38] );
		sg.addTurn( "t291", servers[0], servers[99] );
		sg.addTurn( "t447", servers[113], servers[58] );
		sg.addTurn( "t101", servers[103], servers[1] );
		sg.addTurn( "t127", servers[79], servers[47] );
		sg.addTurn( "t45", servers[37], servers[46] );
		sg.addTurn( "t66", servers[19], servers[109] );
		sg.addTurn( "t334", servers[23], servers[69] );
		sg.addTurn( "t31", servers[59], servers[73] );
		sg.addTurn( "t353", servers[18], servers[89] );
		sg.addTurn( "t321", servers[16], servers[73] );
		sg.addTurn( "t142", servers[39], servers[91] );
		sg.addTurn( "t246", servers[102], servers[113] );
		sg.addTurn( "t63", servers[19], servers[83] );
		sg.addTurn( "t126", servers[79], servers[65] );
		sg.addTurn( "t200", servers[117], servers[15] );
		sg.addTurn( "t406", servers[56], servers[106] );
		sg.addTurn( "t204", servers[72], servers[49] );
		sg.addTurn( "t408", servers[56], servers[81] );
		sg.addTurn( "t185", servers[76], servers[49] );
		sg.addTurn( "t194", servers[117], servers[110] );
		sg.addTurn( "t272", servers[32], servers[61] );
		sg.addTurn( "t426", servers[96], servers[18] );
		sg.addTurn( "t38", servers[37], servers[49] );
		sg.addTurn( "t315", servers[31], servers[112] );
		sg.addTurn( "t123", servers[97], servers[101] );
		sg.addTurn( "t98", servers[103], servers[0] );
		sg.addTurn( "t364", servers[11], servers[102] );
		sg.addTurn( "t255", servers[14], servers[77] );
		sg.addTurn( "t173", servers[24], servers[77] );
		sg.addTurn( "t345", servers[42], servers[15] );
		sg.addTurn( "t397", servers[101], servers[28] );
		sg.addTurn( "t311", servers[31], servers[12] );
		sg.addTurn( "t464", servers[45], servers[83] );
		sg.addTurn( "t277", servers[104], servers[66] );
		sg.addTurn( "t192", servers[76], servers[46] );
		sg.addTurn( "t35", servers[59], servers[55] );
		sg.addTurn( "t216", servers[84], servers[22] );
		sg.addTurn( "t442", servers[86], servers[27] );
		sg.addTurn( "t54", servers[64], servers[32] );
		sg.addTurn( "t381", servers[78], servers[74] );
		sg.addTurn( "t335", servers[23], servers[88] );
		sg.addTurn( "t0", servers[12], servers[54] );
		sg.addTurn( "t258", servers[14], servers[106] );
		sg.addTurn( "t420", servers[40], servers[13] );
		sg.addTurn( "t451", servers[21], servers[49] );
		sg.addTurn( "t435", servers[25], servers[111] );
		sg.addTurn( "t198", servers[117], servers[73] );
		sg.addTurn( "t354", servers[80], servers[9] );
		sg.addTurn( "t18", servers[44], servers[74] );
		sg.addTurn( "t116", servers[51], servers[4] );
		sg.addTurn( "t109", servers[50], servers[88] );
		sg.addTurn( "t405", servers[56], servers[104] );
		sg.addTurn( "t273", servers[32], servers[34] );
		sg.addTurn( "t399", servers[101], servers[73] );
		sg.addTurn( "t344", servers[42], servers[74] );
		sg.addTurn( "t40", servers[37], servers[108] );
		sg.addTurn( "t474", servers[105], servers[87] );
		sg.addTurn( "t217", servers[84], servers[104] );
		sg.addTurn( "t415", servers[53], servers[101] );
		sg.addTurn( "t68", servers[19], servers[46] );
		sg.addTurn( "t239", servers[8], servers[101] );
		sg.addTurn( "t233", servers[34], servers[55] );
		sg.addTurn( "t349", servers[18], servers[12] );
		sg.addTurn( "t386", servers[35], servers[63] );
		sg.addTurn( "t210", servers[72], servers[1] );
		sg.addTurn( "t235", servers[8], servers[38] );
		sg.addTurn( "t432", servers[43], servers[13] );
		sg.addTurn( "t361", servers[60], servers[63] );
		sg.addTurn( "t342", servers[42], servers[6] );
		sg.addTurn( "t215", servers[84], servers[23] );
		sg.addTurn( "t20", servers[44], servers[114] );
		sg.addTurn( "t188", servers[76], servers[0] );
		sg.addTurn( "t409", servers[56], servers[107] );
		sg.addTurn( "t113", servers[51], servers[66] );
		sg.addTurn( "t322", servers[16], servers[74] );
		sg.addTurn( "t372", servers[15], servers[47] );
		sg.addTurn( "t52", servers[10], servers[17] );
		sg.addTurn( "t365", servers[11], servers[14] );
		sg.addTurn( "t46", servers[98], servers[33] );
		sg.addTurn( "t369", servers[11], servers[101] );
		sg.addTurn( "t244", servers[102], servers[0] );
		sg.addTurn( "t463", servers[45], servers[20] );
		sg.addTurn( "t374", servers[15], servers[88] );
		sg.addTurn( "t351", servers[18], servers[87] );
		sg.addTurn( "t27", servers[59], servers[26] );
		sg.addTurn( "t477", servers[105], servers[89] );
		sg.addTurn( "t367", servers[11], servers[95] );
		sg.addTurn( "t26", servers[62], servers[34] );
		sg.addTurn( "t121", servers[97], servers[68] );
		sg.addTurn( "t92", servers[49], servers[112] );
		sg.addTurn( "t176", servers[24], servers[104] );
		sg.addTurn( "t16", servers[44], servers[6] );
		sg.addTurn( "t141", servers[39], servers[21] );
		sg.addTurn( "t410", servers[53], servers[102] );
		sg.addTurn( "t414", servers[53], servers[71] );
		sg.addTurn( "t252", servers[22], servers[95] );
		sg.addTurn( "t443", servers[86], servers[87] );
		sg.addTurn( "t95", servers[103], servers[49] );
		sg.addTurn( "t310", servers[89], servers[91] );
		sg.addTurn( "t307", servers[89], servers[25] );
		sg.addTurn( "t305", servers[41], servers[31] );
		sg.addTurn( "t6", servers[47], servers[87] );
		sg.addTurn( "t222", servers[73], servers[93] );
		sg.addTurn( "t402", servers[101], servers[55] );
		sg.addTurn( "t73", servers[70], servers[73] );
		sg.addTurn( "t299", servers[66], servers[113] );
		sg.addTurn( "t261", servers[14], servers[107] );
		sg.addTurn( "t250", servers[22], servers[38] );
		sg.addTurn( "t59", servers[75], servers[34] );
		sg.addTurn( "t317", servers[16], servers[26] );
		sg.addTurn( "t333", servers[23], servers[47] );
		sg.addTurn( "t396", servers[101], servers[92] );
		sg.addTurn( "t94", servers[103], servers[8] );
		sg.addTurn( "t87", servers[87], servers[1] );
		sg.addTurn( "t8", servers[47], servers[112] );
		sg.addTurn( "t50", servers[90], servers[116] );
		sg.addTurn( "t25", servers[62], servers[61] );
		sg.addTurn( "t29", servers[59], servers[28] );
		sg.addTurn( "t178", servers[24], servers[13] );
		sg.addTurn( "t481", servers[48], servers[111] );
		sg.addTurn( "t286", servers[85], servers[81] );
		sg.addTurn( "t23", servers[62], servers[30] );
		sg.addTurn( "t264", servers[100], servers[66] );
		sg.addTurn( "t444", servers[86], servers[112] );
		sg.addTurn( "t359", servers[60], servers[44] );
		sg.addTurn( "t259", servers[14], servers[13] );
		sg.addTurn( "t385", servers[35], servers[44] );
		sg.addTurn( "t161", servers[94], servers[6] );
		sg.addTurn( "t298", servers[66], servers[109] );
		sg.addTurn( "t306", servers[91], servers[52] );
		sg.addTurn( "t179", servers[24], servers[107] );
		sg.addTurn( "t363", servers[68], servers[17] );
		sg.addTurn( "t96", servers[103], servers[20] );
		sg.addTurn( "t268", servers[4], servers[105] );
		sg.addTurn( "t297", servers[66], servers[108] );
		sg.addTurn( "t376", servers[78], servers[26] );
		sg.addTurn( "t392", servers[114], servers[95] );
		sg.addTurn( "t97", servers[103], servers[83] );
		sg.addTurn( "t340", servers[42], servers[92] );
		sg.addTurn( "t320", servers[16], servers[6] );
		sg.addTurn( "t170", servers[111], servers[93] );
		sg.addTurn( "t336", servers[23], servers[78] );
		sg.addTurn( "t413", servers[53], servers[95] );
		sg.addTurn( "t57", servers[75], servers[93] );
		sg.addTurn( "t296", servers[66], servers[83] );
		sg.addTurn( "t251", servers[22], servers[68] );
		sg.addTurn( "t58", servers[75], servers[61] );
		sg.addTurn( "t61", servers[19], servers[49] );
		sg.addTurn( "t82", servers[87], servers[83] );
		sg.addTurn( "t448", servers[113], servers[91] );
		sg.addTurn( "t41", servers[37], servers[0] );
		sg.addTurn( "t197", servers[117], servers[6] );
		sg.addTurn( "t230", servers[34], servers[74] );
		sg.addTurn( "t196", servers[117], servers[92] );
		sg.addTurn( "t122", servers[97], servers[71] );
		sg.addTurn( "t456", servers[21], servers[109] );
		sg.addTurn( "t276", servers[104], servers[2] );
		sg.addTurn( "t102", servers[103], servers[46] );
		sg.addTurn( "t312", servers[31], servers[27] );
		sg.addTurn( "t338", servers[115], servers[41] );
		sg.addTurn( "t156", servers[74], servers[80] );
		sg.addTurn( "t143", servers[39], servers[31] );
		sg.addTurn( "t110", servers[50], servers[78] );
		sg.addTurn( "t74", servers[70], servers[74] );
		sg.addTurn( "t81", servers[87], servers[20] );
		sg.addTurn( "t148", servers[71], servers[4] );
		sg.addTurn( "t201", servers[117], servers[114] );
		sg.addTurn( "t313", servers[31], servers[87] );
		sg.addTurn( "t403", servers[56], servers[23] );
		sg.addTurn( "t32", servers[59], servers[74] );
		sg.addTurn( "t325", servers[65], servers[77] );
		sg.addTurn( "t145", servers[71], servers[85] );
		sg.addTurn( "t400", servers[101], servers[74] );
		sg.addTurn( "t388", servers[114], servers[102] );
		sg.addTurn( "t70", servers[70], servers[26] );
		sg.addTurn( "t129", servers[79], servers[78] );
		sg.addTurn( "t424", servers[106], servers[105] );
		sg.addTurn( "t471", servers[27], servers[40] );
		sg.addTurn( "t218", servers[84], servers[106] );
		sg.addTurn( "t83", servers[87], servers[108] );
		sg.addTurn( "t114", servers[51], servers[57] );
		sg.addTurn( "t278", servers[104], servers[57] );
		sg.addTurn( "t254", servers[22], servers[101] );
		sg.addTurn( "t214", servers[84], servers[77] );
		sg.addTurn( "t440", servers[7], servers[31] );
		sg.addTurn( "t360", servers[60], servers[36] );
		sg.addTurn( "t90", servers[49], servers[27] );
		sg.addTurn( "t446", servers[113], servers[25] );
		sg.addTurn( "t425", servers[106], servers[100] );
		sg.addTurn( "t465", servers[45], servers[108] );
		sg.addTurn( "t348", servers[112], servers[5] );
		sg.addTurn( "t445", servers[86], servers[89] );
		sg.addTurn( "t356", servers[80], servers[36] );
		sg.addTurn( "t108", servers[50], servers[69] );
		sg.addTurn( "t366", servers[11], servers[38] );
		sg.addTurn( "t283", servers[85], servers[22] );
		sg.addTurn( "t438", servers[7], servers[21] );
		sg.addTurn( "t223", servers[73], servers[82] );
		sg.addTurn( "t226", servers[34], servers[26] );
		sg.addTurn( "t15", servers[44], servers[28] );
		sg.addTurn( "t14", servers[44], servers[26] );
		sg.addTurn( "t467", servers[45], servers[109] );
		sg.addTurn( "t175", servers[24], servers[22] );
		sg.addTurn( "t453", servers[21], servers[83] );
		sg.addTurn( "t304", servers[41], servers[21] );
		sg.addTurn( "t107", servers[50], servers[47] );
		sg.addTurn( "t270", servers[32], servers[93] );
		sg.addTurn( "t93", servers[49], servers[89] );
		sg.addTurn( "t370", servers[15], servers[54] );
		sg.addTurn( "t457", servers[21], servers[1] );
		sg.addTurn( "t394", servers[101], servers[110] );
		sg.addTurn( "t28", servers[59], servers[92] );
		sg.addTurn( "t139", servers[57], servers[78] );
		sg.addTurn( "t71", servers[70], servers[92] );
	}

	public void createFlows1( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f55", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f323", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f450", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[99] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f228", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f64", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f355", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f202", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f107", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f91", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f122", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f295", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f296", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f143", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f261", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f66", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f342", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		sg.addFlow( "f94", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f351", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f428", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[65] );
		sg.addFlow( "f332", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f382", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[86] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f311", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f226", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f96", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f423", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f275", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f62", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f319", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f274", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f74", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f401", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f416", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f249", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f464", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[117] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f170", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f168", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f51", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		sg.addFlow( "f241", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f109", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f203", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f361", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f307", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f432", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f288", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f470", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f213", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f197", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		sg.addFlow( "f336", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f215", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f189", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f309", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[106] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f316", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f304", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f412", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f326", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f364", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f113", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		sg.addFlow( "f72", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f397", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f415", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f398", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f231", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f186", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f298", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f413", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f370", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f266", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f390", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f233", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f376", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[71] );
		sg.addFlow( "f120", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f425", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f293", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f448", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f244", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows2( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[74] );
		servers_on_path_s.add( servers[80] );
		sg.addFlow( "f82", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f77", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f165", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f105", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f422", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f277", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f161", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f443", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f365", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f218", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f54", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[97] );
		sg.addFlow( "f353", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f442", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f59", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f408", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f290", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f134", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f378", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f337", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f297", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f204", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f177", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f335", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f360", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f312", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[106] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f172", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f217", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f90", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f79", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f345", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f445", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f300", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f453", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f420", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f75", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f87", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f417", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f331", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f405", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f347", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[74] );
		servers_on_path_s.add( servers[80] );
		sg.addFlow( "f299", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f101", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		sg.addFlow( "f160", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f403", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f182", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f328", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f366", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		sg.addFlow( "f289", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f396", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f191", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f438", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f209", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f268", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f404", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f142", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f237", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f270", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f116", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f343", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		sg.addFlow( "f433", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f242", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f377", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f154", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f92", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f60", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f117", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f58", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f188", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f246", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f349", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f394", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f93", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[71] );
		sg.addFlow( "f229", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f176", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[117] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f184", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f265", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f400", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f99", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows3( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f459", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f435", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f393", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f174", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f78", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[97] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f207", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[97] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f320", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		sg.addFlow( "f421", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f193", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f210", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f253", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f341", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f63", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f418", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f187", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f102", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f47", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f98", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f264", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f256", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f70", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f224", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f284", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f292", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[106] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f272", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[99] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f200", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f139", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f239", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f149", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[74] );
		servers_on_path_s.add( servers[80] );
		sg.addFlow( "f130", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f48", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f314", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f385", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f469", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f454", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f468", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f110", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f104", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f381", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f115", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		sg.addFlow( "f108", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f85", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f121", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f367", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f205", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		sg.addFlow( "f194", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[97] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f222", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f374", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		sg.addFlow( "f89", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f235", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f461", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f371", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f379", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f173", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f133", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f322", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f273", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f457", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[86] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f348", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f147", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f437", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f276", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f140", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[79] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f383", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f131", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f439", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f352", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f402", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f392", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f223", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f460", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f369", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f80", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f144", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f175", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f95", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f356", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows4( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f150", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f252", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f354", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f146", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f56", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f282", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f285", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f103", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f192", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f220", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f333", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f208", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f61", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f221", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f279", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f409", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f446", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f211", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f358", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f73", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f247", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f180", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[79] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f458", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f135", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f199", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f436", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f50", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f280", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f427", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f254", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f269", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f86", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[79] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f456", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f137", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f83", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f225", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f159", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f206", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f248", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[86] );
		sg.addFlow( "f313", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f81", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f338", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f386", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		sg.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f357", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f318", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f419", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f181", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f414", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f52", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f68", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		sg.addFlow( "f57", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f325", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f212", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f291", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f227", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[112] );
		sg.addFlow( "f219", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[97] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f53", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[106] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f373", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f375", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[86] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f308", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f362", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f372", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f258", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f106", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f255", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f430", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f127", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f424", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f88", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[117] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f440", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f178", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f281", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f156", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[71] );
		sg.addFlow( "f429", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f151", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f389", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f195", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows5( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f167", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f230", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f123", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f287", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f84", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f236", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f136", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f190", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f155", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f71", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f344", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[95] );
		sg.addFlow( "f330", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f321", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f157", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		sg.addFlow( "f251", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f462", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[97] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f245", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f410", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f171", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f214", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f434", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f387", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f391", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f411", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f455", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f196", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f185", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f467", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f317", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f426", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[80] );
		sg.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f399", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f128", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f111", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f306", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f350", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f138", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f158", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[99] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f310", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[106] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f463", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f329", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f243", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f305", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[117] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f315", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f112", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f465", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[97] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f126", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f114", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f129", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f471", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f145", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f118", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f449", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f346", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[96] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f67", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f384", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f240", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f259", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f294", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f444", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[106] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[71] );
		sg.addFlow( "f97", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f334", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f363", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f163", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f153", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		sg.addFlow( "f238", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[117] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f431", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		sg.addFlow( "f162", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f263", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[88] );
		sg.addFlow( "f283", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[71] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f271", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[86] );
		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f100", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f466", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[81] );
		sg.addFlow( "f286", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows6( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		sg.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[106] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f441", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f164", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f141", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f65", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f125", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f152", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f257", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f76", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f303", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f278", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f452", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f169", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f339", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f447", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f451", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f267", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f232", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f250", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f166", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f132", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f301", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[82] );
		sg.addFlow( "f324", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f179", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[98] );
		sg.addFlow( "f406", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f124", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f234", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f327", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f69", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f407", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f49", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f302", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f148", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[80] );
		sg.addFlow( "f198", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[86] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f183", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[71] );
		sg.addFlow( "f260", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f119", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f216", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[97] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f368", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[110] );
		sg.addFlow( "f359", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[86] );
		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f262", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[78] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f395", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f380", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[80] );
		sg.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[109] );
		sg.addFlow( "f388", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f201", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[99] );
		sg.addFlow( "f340", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public GLP40_u_90.0() {
		sg = createServerGraph();
	}

	public ServerGraph createServerGraph() {
		Server[] servers = new Server[118];
		sg = new ServerGraph();
		try{
			createServers1( sg, servers );
			createTurns1( sg, servers );
			createFlows1( sg, servers );
			createFlows2( sg, servers );
			createFlows3( sg, servers );
			createFlows4( sg, servers );
			createFlows5( sg, servers );
			createFlows6( sg, servers );
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
