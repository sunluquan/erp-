<template>
<<<<<<< HEAD
 <el-dialog id="gaschedulingsheet" :before-close="close" width="66%" title="入库调度单" style="text-align: center;" :visible.sync="gaschedulingsheet_gascheduling_dialog_visible">
  
	<div id="box">					
		<el-form :inline="true" :model="schedulingid" class="demo-form-inline" :label-position="labelPosition" label-width="150px">
			<el-form-item  label="入库单编号:" style="padding-right: 180px;" prop="gatherId">
=======
 <el-dialog id="gaschedulingsheet" :before-close="close" width="61%" title="入库调度单" style="text-align: center;" :visible.sync="gaschedulingsheet_gascheduling_dialog_visible">
  
	<div id="box">					
		<el-form :inline="true" :model="schedulingid" class="demo-form-inline" :label-position="labelPosition" label-width="150px">
			<el-form-item  label="入库单编号:" style="padding-right: 110px;margin-top: 22px;color: crimson;" prop="gatherId">
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
			  <el-input class="input" v-model="schedulingid[0].gatherId"></el-input>
			</el-form-item>
			<el-form-item label=".......">
			   <el-input  class="input"></el-input>
			</el-form-item>
<<<<<<< HEAD
			<el-form-item  label="入库理由:" style="padding-right: 180px;" prop="reasonexact">
=======
			<el-form-item  label="入库理由:" style="padding-right: 110px;" prop="reasonexact">
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
			   <el-input  class="MyClass" v-model="schedulingid[0].reasonexact"></el-input>
			</el-form-item>	
			<el-form-item  label="入库详细理由:" >
			   <el-input  class="MyClass"></el-input>
			</el-form-item>
			
<<<<<<< HEAD
			<el-table :data="schedulingid" size="mini" :header-cell-style="{background:'whitesmoke'}"  border style="width: 93%;margin-left: 40px;">
=======
			<el-table :data="schedulingid" size="small" :header-cell-style="{background:'whitesmoke'}"  border style="width: 95%;margin-left: 24px;">
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
			    <el-table-column prop="id" label="序号"  width="80px;">
					<template slot-scope="scope">
					<span>{{scope.row.id}}</span>
					</template>
			    </el-table-column>	
<<<<<<< HEAD
			    <el-table-column prop="materielname" label="产品名称"  >
=======
			    <el-table-column prop="materielname" label="产品名称"  width="140px">
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
					<template slot-scope="scope">
						    <span>{{scope.row.productName}}</span>
					</template>					
			    </el-table-column>
<<<<<<< HEAD
				<el-table-column prop="materielid" label="产品编号" width="160px">		
=======
				<el-table-column prop="materielid" label="产品编号" width="170px">		
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
				    <template slot-scope="scope">
						<span>{{scope.row.productId}}</span>
				    </template>
				</el-table-column>
<<<<<<< HEAD
				<el-table-column prop="amount" label="应入库件数"  width="90px">
					<template slot-scope="scope">
						<span>{{scope.row.stockamount}}</span>
=======
				<el-table-column prop="mustAmount" label="应入库件数"  width="110px">
					<template slot-scope="scope">
						<span>{{scope.row.mustAmount}}</span>
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
					</template>										
				</el-table-column>
				<el-table-column prop="amount" label="已入库件数"  width="90px">
					<template slot-scope="scope">
<<<<<<< HEAD
						<span>{{scope.row.paidAmount}}</span>
					</template>										
				</el-table-column>		
				<el-table-column prop="amountSum" label="存放地址集合"  width="178px">
					<template slot-scope="scope">						
					</template>										
				</el-table-column>
				<el-table-column  label="调度"  width="90px">
					<template slot-scope="scope">	
						<el-button style="font-size: 13px;" type="text" @click="schedulingids(scope.row.id)">调度</el-button>
=======
						<span>0</span>
					</template>										
				</el-table-column>						
				<el-table-column prop="payTags" label="存放地址集合"  width="126px"> 
					<template slot-scope="scope">	
					</template>										
				</el-table-column>
				<el-table-column  label="调度"  width="95px">
					<template slot-scope="scope">	
						<el-button style="font-size: 13px;" size="mini" type="primary" @click="schedulingids(scope.row.productId)">调度</el-button>
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
					</template>										
				</el-table-column>
			  </el-table>	
			<br /> 
<<<<<<< HEAD
			<el-form-item label="应入库总件数:" style="padding-right: 280px;" prop="register">
				   <span>{{shul}}</span>
			</el-form-item>	
			<el-form-item label="已入库总件数:"  prop="register">
				   <el-input  class="input" v-model="schedulingid[0].amountSum"></el-input>
			</el-form-item>			
		    <el-form-item label="应入库总成本:" prop="registertime" style="padding-right: 280px;">		  	     						 
			       <span>0.0</span>	 
			</el-form-item>							
			<el-form-item label="已入库总成本:" prop="registertime">		  	     						 
			      	<el-input  class="input" v-model="schedulingid[0].costPriceSum"></el-input>	 
			</el-form-item>			   			  					
		</el-form>	
	</div>
	<div slot="footer" class="dialog-footer">		
		<el-button size="mini" round @click="close()">返回</el-button>
=======
			<el-form-item label="应入库总件数:" style="padding-right: 260px;" prop="register">
				   <span>{{shul}}</span>				   
			</el-form-item>							
		    <el-form-item label="应入库总成本:" prop="registertime">		  	     						 
			       <span>${{sumprice}}</span>	 
			</el-form-item>												   			  					
		</el-form>	
	</div>
	<div slot="footer" class="dialog-footer">		
		<el-button type="primary" size="mini" round @click="close()">返回</el-button>
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
	</div>
	</el-dialog>
</template>

<script>
	export default {
		name:'gaschedulingsheet',
		data() {			
	     	return {
				shul:0,
<<<<<<< HEAD
				gatherId:'',
=======
				sumprice:0.0,
				gatherId:'',
				payTags:'',
				nums:0,
				moneys:0.0,
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
				dataPicke: new Date,
				custom: 'custom',
				productId:'',
				labelPosition: 'right',				       
				gaschedulingsheet_gascheduling_dialog_visible: false,			   								
<<<<<<< HEAD
				schedulingid:[],
=======
				schedulingid:{},
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
				isadmin: 3,					
		}
		},
		
		created(){			
			let gatherId=this.$route.params[Object.keys(this.$route.params)[0]];
			this.gatherId=gatherId;
			
			console.log(this.$route);
			this.gaschedulingsheet_gascheduling_dialog_visible = true;						
			this.getAllsafetyById();           
		},
		methods: {
			close() {
				this.gaschedulingsheet_gascheduling_dialog_visible = false;
				this.$router.go(-1)
			},
			getAllsafetyById(){		
				this.$axios.get('api/gather/getSchedulingid/'+this.gatherId).then(response=>{
						this.schedulingid=response.data;
						var b=0;
<<<<<<< HEAD
						for(var a=0;this.schedulingid.length>a;a++){
							b=b+this.schedulingid[a].stockamount;
						}
						this.shul=b;
					})
			},
			schedulingids(id){
				this.$router.push({path: '/index/gascheduling.html/gaschedulingdetails/'+id})
			}
				
		}		
	}
</script>

<style>
	#box{
		width: 855px;
		height: 400px;
=======
						var s=0;
						for(var a=0;this.schedulingid.length>a;a++){
							b=b+this.schedulingid[a].mustAmount;
							s=b*this.schedulingid[a].realCostPrice;
						}
						this.shul=b;
						this.sumprice=s;					
					})
			},
			schedulingids(productId){
				
					this.$router.push({path: '/index/gascheduling.html/gaschedulingdetails/'+productId})										
			}				
		},
		computed:{
			   
			}	
	}
</script>

<style scoped="scoped">
	#box{
		width: 855px;
		height: 380px;
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
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
</style>
