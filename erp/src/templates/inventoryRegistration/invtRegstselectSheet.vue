<template>
 <el-dialog id="invtRegstselectSheet" :before-close="close" width="63%" title="查询入库详细" style="text-align: center;" :visible.sync="invtRegstreviewSheet_gascheduling_dialog_visible">
          
	<div id="box">					
		<el-form :inline="true" :model="registration" class="demo-form-inline" :label-position="labelPosition" label-width="100px">
			<el-form-item  label="入库单编号:" style="padding-right: 170px;margin-top: 17px;" prop="gatherId">
			  <span style="color: crimson;"><el-input  class="input" v-model="registration.gatherId"></el-input></span>			  
			</el-form-item>
			<el-form-item label=".......">
			   <el-input  class="input"></el-input>
			</el-form-item>		
			<el-form-item  label="入库理由:" style="padding-right: 180px;" prop="reasonexact">
			   <el-input  class="MyClass" v-model="registration.reasonexact"></el-input>
			</el-form-item>	
			<el-form-item  label="入库详细理由:" >
			    <el-input  class="input"></el-input> 
			</el-form-item>
			<el-table :data="registration.gatherDetails" size="small" :header-cell-style="{background:'whitesmoke'}"  border style="width: 96%;margin-left: 19px;">
			    	
			    <el-table-column prop="storeName" label="产品编号"  width="180px">
					<template slot-scope="scope">
						    <span>{{scope.row.productId}}</span>
					</template>					
			    </el-table-column>
				<el-table-column prop="storeAddress" label="产品名称" width="145px">		
				    <template slot-scope="scope">
						<span>{{scope.row.productName}}</span>
				    </template>
				</el-table-column>	
				<el-table-column prop="amountSum" label="库房名称"  width="99px">
					<template slot-scope="scope">	
							<span>{{scope.row.storeName}}</span>
					</template>										
				</el-table-column>		
				<el-table-column prop="amountSum" label="存放地址"  width="225px">
					<template slot-scope="scope">	
						<span>{{scope.row.storeAddress}}</span>
					</template>										
				</el-table-column>
				<el-table-column prop="amountSum" label="应入库数量"  width="90px">
					<template slot-scope="scope">	
							<span>{{scope.row.paidAmount}}</span>
					</template>										
				</el-table-column>						
				<el-table-column prop="qwe"  label="本次入库数量"  width="110px">
					<template slot-scope="scope">	
					  <span style="color:brown;">{{scope.row.paidAmount}}</span>
					</template>										
				</el-table-column>
				
			  </el-table>
			  <br />
			   <el-form-item label="应入库总件数" style="padding-right: 170px;">
				   <el-input class="input" v-model="registration.gatheredAmountSum"></el-input>
			   </el-form-item>			  
			   <el-form-item label="已入库总件数:"  prop="nums">
			   	   <el-input class="input" v-model="registration.amountSum"></el-input>
			   </el-form-item>			
			  <el-form-item label="应入库总成本:" prop="registertime" style="padding-right: 170px;">
			        <el-input class="input" v-model="registration.costPriceSum"></el-input>	 
			  </el-form-item>						
			   <el-form-item label="已入库总成本:" prop="moneys">		  	     						 
			        <el-input class="input" v-model="registration.costPriceSum"></el-input>
			   </el-form-item>			   										   	
			<el-form-item label="审核人:" style="padding-right: 230px;" prop="activeUser">
			   <span>{{activeUser}}</span>
			</el-form-item>	
			<el-form-item label="登记时间:" prop="registertime">						
				<el-input class="input" v-model="registration.registerTime"></el-input>
			</el-form-item>										    		   			  					
		</el-form>
	</div>
	<div slot="footer" class="dialog-footer">		
		<el-button type="primary" size="mini" round @click="close()">返回</el-button>
	</div>
	</el-dialog>
</template>

<script>
	export default {
		name:'invtRegstselectSheet',
		data() {			
	     	return {
				shul:0,
				id:'',
				dataPicke: new Date,
				custom: 'custom',							
				amount:'',
				nums:0,
				moneys:0.0,
				checkTime:'',
				paidAmount:'',
				labelPosition: 'right',				       
				invtRegstreviewSheet_gascheduling_dialog_visible: false,			   								
				registration:{},								
				isadmin: 3,	
				radio:'2'
		}
		},
		
		created(){			
			let gatherId=this.$route.params[Object.keys(this.$route.params)[0]];
			this.gatherId=gatherId;			
			console.log(this.$route);
			this.invtRegstreviewSheet_gascheduling_dialog_visible = true;						
			this.getAllregistrationById();
			// this.qwe();
		},
		methods: {			
			close() {
				this.invtRegstreviewSheet_gascheduling_dialog_visible = false;
				this.$router.go(-1)
			},
			getAllregistrationById(){						
				this.$axios.get('api/gather/byIdAll/'+this.gatherId).then(response=>{
					    // this.registration[0].paidAmount=0;
						this.registration=response.data;
					})
			},			
		},
	  
		
		computed: {
			activeUser() {
						return this.$store.getters.getActiveUser.user.uname;
				},
			routerNames() {
						return this.$store.getters.getRouterNames;
			}			
		}
				
	}
</script>

<style scoped="scoped">
	#box{
		width: 885px;
		height: 480px;
		border:1px solid gray;
	}
	.MyClass input.el-input__inner{
		width: 160px;
		border-top-width: 0px;
		border-left-width: 0px;
		border-right-width: 0px;
		border-bottom-width: 1px;
		/*outline: medium;*/
	}
	.input input.el-input__inner{
		width: 160px;
		border-top-width: 0px;
		border-left-width: 0px;
		border-right-width: 0px;
		border-bottom-width: 0px;
	}
    .MyClasssum input.el-input__inner{
    	width:80px;
    	border-top-width: 0px;
    	border-left-width: 0px;
    	border-right-width: 0px;
    	border-bottom-width: 0px;
    	/*outline: medium;*/
    }		
</style>
