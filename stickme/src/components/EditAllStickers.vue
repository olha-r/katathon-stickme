<script>
export default {
    data() {
        return {
            id: '',
            stickersList: [],
            index: ''

        }
    },
    methods: {
        async loadStickers() {
            const response = await fetch("http://localhost:8080/stickers/edit-all");
            const stickers = await response.json();
            this.stickersList = stickers;
        }
        ,
        async deleteSticker(id, index) {
            await fetch(`http://localhost:8080/stickers/${id}`, {
                method: "DELETE",
                headers: {
                    'Content-Type': 'application/json'
                }
            }),
                //remove sticker from stickers list
                this.stickersList.splice(index, 1);
        }
    },
    mounted() {
        this.loadStickers();
    }
}
</script>
<template>

    <div class="countainer mx-2">
        <div class="row justify-content-center">
            <div class="col-12 col-md-6">
                <h1 class="mt-3">Edit Stickers</h1>
                <table class="table table-sm table-hover">
                    <thead>
                        <tr>
                            <th scoped="col">The image</th>
                            <th scoped="col">Name</th>
                            <th scoped="col">Date added</th>
                            <th scoped="col">Modify</th>
                            <th scoped="col">Delete</th>
                        </tr>
                    </thead>
                    <tbody class="table-group-divider">

                        <tr v-for="(element, index) in stickersList">
                            <td>
                                <img :src="element.imageUrl" class="img-thumbnail" width="70" alt="Sticker image">
                            </td>
                            <td class="pe-1"><router-link :to="`/sticker/${element.id}`"
                                    class="text-decoration-none text-dark">{{
                                        element.name
                                    }}</router-link></td>
                            <td>{{ element.createdAt }}</td>
                            <td>
                                <router-link :to="`/sticker/update/${element.id}`"
                                    class="text-decoration-none text-dark">
                                    <i class="bi bi-pencil-square"></i>
                                </router-link>

                            </td>
                            <td>
                                <i class="bi bi-trash3-fill" @click="deleteSticker(element.id, index)"></i>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</template>