<template>
	<div id="dispatching">
		<insert-dispatching v-model="insert_dispatching_dialog_visible"
		:product="product" @update="renewSearch"></insert-dispatching>
		<!-- <router-view @update="renewSearch"></router-view> -->
		<el-tabs  type="border-card" v-model="typeName"  :tab-position="tabPosition" >
			<el-tab-pane label="按产品划分" name="product_divide">
				按产品划分
				<template v-if="typeName==='product_divide'">
					<product-divide ref="product_divide" @make_dispatching="makeDispatching"></product-divide>
				</template>
			</el-tab-pane>
			<el-tab-pane label="按生成产品单划分" name="production_divide">按生成产品单划分
				<template v-if="typeName==='production_divide'">
					<production-divide ref="production_divide" @make_dispatching="makeDispatching"></production-divide>
				</template>
			</el-tab-pane>
		</el-tabs>
		
	</div>
</template>
<script>
	import insert_dispatching from '@/components/dispatching/insert_dispatching.vue'
	//按产品进行派工
	import product_divide from '@/components/dispatching/product_divide.vue'
	//按生产单进行派工
	import production_divide from '@/components/dispatching/production_divide.vue'
	export default {
		name: 'dispatching',
		data() {
			return {
				tabPosition: 'top',
				insert_dispatching_dialog_visible:false,
				product:null,
				typeName:'product_divide'
			}
		},
		methods: {
			makeDispatching(product){
				this.insert_dispatching_dialog_visible=true
				this.product=product
			},
			makeDispatching1(id,data){
				let params={product_id:id,productionPlanDetailIds:data}
				params=JSON.stringify(params)
				let fullPath=this.$route.fullPath
				this.$router.push({path:`${fullPath}/insert/${params}`})
			},renewSearch(){
				if(this.typeName=="product_divide"){
					this.$refs.product_divide.getMeetDispatchingProducts();
				}else if(this.typeName=="production_divide"){
					this.$refs.production_divide.getMeetDispatchingProductions()
				}
			}
		},components:{
			'product-divide':product_divide,
			'insert-dispatching':insert_dispatching,
			'production-divide':production_divide
		}
	}
</script>
