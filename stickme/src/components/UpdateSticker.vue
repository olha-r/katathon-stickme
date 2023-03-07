<script>
import { useVuelidate } from '@vuelidate/core'
import { required, maxLength, maxValue, minValue, url } from '@vuelidate/validators'

export default {
    setup() {
        return { v$: useVuelidate() }
    },
    data() {
        return {
            id: '',
            inputs: {
                name: null,
                description: null,
                imageUrl: null,
                sizeId: 0,
                aspectId: 0,
                price: null
            },
            sizesList: [],
            aspectsList: [],
        }
    },
    validations() {
        return {
            inputs: {
                name: { required, maxLength: maxLength(100) },
                imageUrl: { required, maxLength: maxLength(300), url },
                description: { required, maxLength: maxLength(1000) },
                sizeId: { required },
                aspectId: { required },
                price: { required, minValue: minValue(0.01), maxValue: maxValue(100) }

            }
        }
    },

    methods: {
        async submit() {
            console.log(this.$route.params.id);
            console.log(this.inputs);
            const result = await this.v$.$validate()
            if (result) {
                this.sendSticker();
                const toastEl = document.getElementById('toast');
                const toast = new bootstrap.Toast(toastEl);
                toast.show();
            } else {
                console.log(result);
                console.log(this.v$.inputs.aspectId.$error);
                console.log("n'est pas validé");

            }
        },
        async loadSticker() {
            const response = await fetch(`http://localhost:8080/stickers/${this.id}`);
            const elements = await response.json();
            this.inputs = elements;
        },
        async loadSizes() {
            const response = await fetch("http://localhost:8080/sizes");
            const elements = await response.json();
            this.sizesList = elements;
            console.log(this.sizesList);
        },
        async loadAspects() {
            const response = await fetch("http://localhost:8080/aspects");
            const elements = await response.json();
            this.aspectsList = elements;
        },
        async sendSticker() {
            const postData = this.inputs
            await fetch('http://localhost:8080/stickers', {
                method: 'PATCH',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(
                    postData)
            })
        },

    },
    mounted() {
        this.id = this.$route.params.id;
        this.loadSizes();
        this.loadAspects();
        this.loadSticker();
    }
}

</script>

<template>
    <div class="countainer mx-2">
        <div class="row justify-content-center">
            <div class="col-12 col-md-6">
                <h1 class="mt-3">Update Sticker</h1>
                <form class="my-4" @submit.prevent="submit">
                    <div class="row">
                        <div class="mb-3 col-12 col-md-6">
                            <label for="name" class="form-label">Name</label>
                            <input v-model="inputs.name" name="name" type="text" class="form-control"
                                :class="{ 'is-invalid': v$.inputs.name.$error }" id="name">
                        </div>
                        <div class="mb-3 col-12 col-md-6">
                            <label for="imageUrl" class="form-label">Image URL</label>
                            <input v-model="inputs.imageUrl" name="imageUrl" type="text" class="form-control"
                                :class="{ 'is-invalid': v$.inputs.imageUrl.$error }" id="imageUrl">
                        </div>
                    </div>
                    <div class="mb-3">
                        <label for="description" class="form-label">Description</label>
                        <textarea v-model="inputs.description" name="description" class="form-control"
                            :class="{ 'is-invalid': v$.inputs.description.$error }" id="description"></textarea>
                    </div>
                    <div class="row">
                        <div class="form-group col-12 col-md-4">
                            <label for="sizeId">Size</label>
                            <select name="sizeId" id="sizeId" class="form-control"
                                :class="{ 'is-invalid': v$.inputs.sizeId.$error }">
                                <!-- <option selected value=""> {{ inputs.aspect.name }} </option> -->
                                <option v-for="element in sizesList" :value="element.id"> {{ element.name }}
                                </option>
                            </select>
                        </div>
                        <div class="form-group col-12 col-md-4">
                            <label for="aspectId">Aspect</label>

                            <select name="aspectId" id="aspectId" class="form-control"
                                :class="{ 'is-invalid': v$.inputs.aspectId.$error }">
                                <!-- <option selected value=""> {{ inputs.aspect.name }} </option> -->
                                <option v-for="element in aspectsList" :value="element.id"> {{ element.name }}
                                </option>
                            </select>
                        </div>
                        <div class="col-12 col-md-4">
                            <label for="price">Price</label>
                            <div class="input-group mb-3">
                                <input v-model="inputs.price" type="number" class="form-control"
                                    :class="{ ' is-invalid': v$.inputs.price.$error }">
                                <span class="input-group-text">€</span>
                            </div>
                        </div>
                    </div>




                    <button type="submit" class="btn btn-primary float-end col-md-3 col-12 mb-4">Update</button>




                </form>
            </div>
        </div>
    </div>
</template>