<script>
export default {
    data() {
        return {
            stickersList: [],
        }
    },

    methods: {
        async loadAllStickers() {
            const response = await fetch("http://localhost:8080/stickers");
            const elements = await response.json();
            this.stickersList = elements;
        }
    },
    mounted() {

        this.loadAllStickers();
    }
}
</script>

<template>
    <div class="countainer m-3">
        <h1>Welcome</h1>
        <div class="row row-cols-2 row-cols-md-5 g-4">
            <div v-for="element in stickersList" class="col">
                <div class="card">
                    <img :src="element.imageUrl" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">
                            {{ element.name }}</h5>
                        <p class="card-text">{{ element.price }}</p>
                    </div>
                </div>
            </div>

        </div>
    </div>
</template>