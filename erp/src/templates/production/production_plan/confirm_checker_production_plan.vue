<template>
	<el-dialog  :before-close="close" title="产品生产计划设计审核" :visible.sync="dialog_visible">
		<div id="columns" >
			<el-form label-position="left" inline class="demo-table-expand">
				<el-form-item label="生产理由: ">
					<span>{{productionPlan.production_reason}}</span>
				</el-form-item>
				<el-form-item label="设计人: ">
					<span>{{productionPlan.designer}}</span>
					<!-- <el-input v-model="productionPlan.designer" placeholder="请输入设计人"></el-input> -->
				</el-form-item>
			</el-form>
		</div>
		<br />
		<el-table style="text-align: center;width: 100%" :border="true" 
		:summary-method="getSummaries" show-summary 
		:data="productionPlan.productionPlanDetails"
		 ref="production_table" :highlight-current-row="true">
			<el-table-column label="产品编号">
				<template slot-scope="scope">
					{{scope.row.product_id}}
				</template>
			</el-table-column>
			<el-table-column label="产品名称">
				<template slot-scope="scope">
					{{scope.row.product_name}}
				</template>
			</el-table-column>
			<el-table-column label="用途类型">
				<template slot-scope="scope">
					{{scope.row.useName}}
				</template>
			</el-table-column>
			<el-table-column label="单位">
				<template slot-scope="scope">
					{{scope.row.product_unit}}
				</template>
			</el-table-column>
			<el-table-column label="单价" prop="cost_price">
				<template slot-scope="scope">
					{{scope.row.real_cost_price|formNumerical('元')}}
				</template>
			</el-table-column>
			<el-table-column label="生产数量" prop="amount">
				<template slot-scope="scope">
					{{scope.row.amount}}
					<!-- <number v-model="scope.row.amount"></number> -->
					<!-- <el-input-number size="mini" v-model="scope.row.amount"></el-input-number> -->
				</template>
			</el-table-column>
			<el-table-column label="小计" prop="total">
				<template slot-scope="scope">
					{{scope.row|total('amount','real_cost_price',2,'元')}}
				</template>
			</el-table-column>
		</el-table>
		<br />
		<el-form label-position="left" inline class="demo-table-expand">
			<el-col :span="10">
				<el-form-item label="审核人:">
					<span>{{register}}</span>
				</el-form-item>
			</el-col>
			<el-col :span="14">
				<el-form-item label="说明/备注:">
					<span>{{productionPlan.remark}}</span>
					<!-- <el-input type="textarea" autosize v-model="productionPlan.remark"></el-input> -->
				</el-form-item>
			</el-col>
		</el-form>
		<div slot="footer" class="dialog-footer">
			<el-button  @click="close">取 消</el-button>
			<el-button type="primary" @click="pass">提交</el-button>
			<el-button type="danger" @click="befor_reject">驳 回</el-button>
		</div>
	</el-dialog>
</template>

<script>
	export default{
		name:'confirm_checker_production_plan',
		data(){
			return{
				productionPlan:[],
				dialog_visible:false
			}
		},methods:{
			pass(){
				let id=this.productionPlan.id
				let productionPlan={
					id:id,
				}
				this.$axios.post('/api/productionPlan/pass',productionPlan)
					.then(response=>{
						if(response.statusCord == 200){
							this.$message.success('生产产品设计单审核通过成功!')
							this.update()
							this.close()
						}else{
							this.$message.error(response.message)
						}
					})
			},befor_reject(){
				this.$prompt('有无驳回原由', '提示', {
					confirmButtonText: '提交(有)',
					cancelButtonText: '提交(无)',
				}).then(({
					value
				}) => {
					this.reject(value==null?"":value)
				}).catch(() => {
					this.reject("")
				});
			},reject(value){
				let check_suggestion="驳回原由: "+value
				let id=this.productionPlan.id
				let productionPlan={
					id:id,
					check_suggestion:check_suggestion
				}
				this.$axios.post('/api/productionPlan/reject',productionPlan)
					.then(response=>{
						if(response.statusCord == 200){
							this.$message.success('生产产品设计单已驳回!')
							this.update()
							this.close()
						}else{
							this.$message.error(response.message)
						}
					})
			},update(){
				this.$emit('update')
			},getProductionPlanById(){
				let id=this.$route.params[Object.keys(this.$route.params)[0]]
				this.$axios.get(`/api/productionPlan/byIdAll/${id}`)
					.then(response=>{
						this.productionPlan=response.data
					})
			},
			getSummaries(param) {
				const {
					columns,
					data
				} = param;
				const sums = [];
				let length = columns.length
				columns.forEach((column, index) => {
					if (index === 0) {
						sums[index] = '合计';
						return;
					}
					const values = data.map(item => Number(item[column.property]));
					if (!values.every(value => isNaN(value))) {
						sums[index] = values.reduce((prev, curr) => {
							const value = Number(curr);
							if (!isNaN(value)) {
								return prev + curr;
							} else {
								return prev;
							}
						}, 0);
						sums[index] = sums[index].toFixed(2)
					} else {
						if (index == length - 1) {
							let total = 0;
							data.forEach((item => {
								let amount = Number(item.amount)
								let price = Number(item.real_cost_price)
								if (!isNaN(amount) && !isNaN(price)) {
									total += (amount * price);
								}
							}))
							sums[index] = '总成本:' + total.toFixed(2) + '元'
						} else {
							sums[index] = 'N/A';
						}
					}
				});
				return sums;
			},close(){
				this.dialog_visible=false
				this.$router.go(-1)
			}
		},created() {
			this.dialog_visible=true;
			this.getProductionPlanById()
		},filters:{
			total(data, price, number, fixed, suffix) {
				let price1 = parseFloat(data[price]);
				let number1 = parseInt(data[number]);
				let totalPrice = price1 * number1
				return totalPrice.toFixed(fixed) + suffix
			},formNumerical(numerical, prefix) {
				//保留两位小数
				if (prefix) {
					return parseInt(numerical).toFixed(2) + prefix;
				} else {
					return parseInt(numerical).toFixed(2);
				}
			
			}
		},computed:{
			register(){
				return this.$store.getters.getActiveUser.user.uid
			}
		}
	}
</script>
<style scoped="scoped">
	element .style {
		min-height: 50px;
		width: 300px;
	}
	
	#columns {
		font-size: 0;
	}
	
	#columns label {
		width: 90px;
		color: #99a9bf;
	}
	
	#columns .el-form-item {
		margin-right: 0;
		margin-bottom: 0;
		width: 50%;
	}
</style>
