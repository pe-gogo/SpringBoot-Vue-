<template>
  <div class="home" style="padding: 10px ">
<!--    功能-->
    <div style="margin: 10px 0">
      <el-button type="primary">新增</el-button>
      <el-button type="primary">导入</el-button>
      <el-button type="primary">导出</el-button>
    </div>
<!--    搜索-->
    <div style="margin: 10px 0">
      <el-input v-model = "search" placeholder="请输入关键字" style="width: 20%"></el-input>
      <el-button type="primary"  style="margin-left: 5px">查询</el-button>
    </div>
      <el-table :data="tableData" border stripe >
        <el-table-column prop="date" label="Date" sortable/>
        <el-table-column prop="name" label="Name" />
        <el-table-column prop="address" label="Address" />
        <el-table-column fixed="right" label="Operations" width="120">
          <template #default>
            <el-button link type="primary" size="small" @click="handleEdit"
            >编辑</el-button>
            <el-popconfirm title="Are you sure to delete this?">
              <template #reference>
                <el-button size="small" type="text">删除</el-button>
              </template>
            </el-popconfirm>
          </template>
        </el-table-column>
      </el-table>
    <el-pagination
        v-model:currentPage="currentPage"
        v-model:page-size="pageSize"
        :page-sizes="[5, 10, 20]"
        :small="small"
        :disabled="disabled"
        :background="background"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total"
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
    />
  </div>
</template>

<script>


export default {
  name: 'HomeView',
  data() {
    return {
      total: 10,
      pageSize: 10,
      search: '',
      currentPage: 1,
      tableData: [
        {
          date: '2016-05-03',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-02',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-04',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
        {
          date: '2016-05-01',
          name: 'Tom',
          address: 'No. 189, Grove St, Los Angeles',
        },
      ]
    }
  },
  methods: {
    handEdit(){},
  }
}
</script>
