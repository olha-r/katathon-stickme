<script>
export default {
    data() {
        return {
            id: '',
            sticker: {}
            // datas: {
            //     name: '',
            //     imageUrl: '',
            //     description: '',
            //     sizeId: '',
            //     aspectId: '',
            //     price: ''
            // }
        }
    },
    methods: {
        async loadStickers() {
            const response = await fetch(`http://localhost:8080/stickers/${this.id}`);
            const elements = await response.json();
            this.sticker = elements;
            console.log(elements);
        }
    },
    mounted() {
        this.id = this.$route.params.id;
        this.loadStickers();
    }
}
</script>
<template>
    <div class="countainer mx-2">
        <div class="row justify-content-center">
            <div class="col-12 col-md-9">
                <h1 class="mt-3 fw-bold">{{ sticker.name }}</h1>
                <div class="row my-4">
                    <div class="col-12 col-md-5">
                        <img :src="sticker.imageUrl" alt="sticker image" class="img-fluid">
                    </div>

                    <div class="col-12 col-md-7">
                        <p class="fs-3 fw-bold ">{{ sticker.price }} €</p>
                        <!-- <div class="row">
                            <div class="col">

                                <p>Size: {{ sticker.size.name }}</p>
                            </div>
                            <div class="col">
                                <p>Aspect: {{ sticker.aspect.name }}</p>
                            </div>
                        </div> -->
                        <p>{{ sticker.description }}</p>


                    </div>

                </div>
            </div>
        </div>
    </div>


</template>