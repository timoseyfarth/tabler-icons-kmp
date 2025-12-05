package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CarSuv: ImageVector
    get() {
        if (_CarSuv != null) {
            return _CarSuv!!
        }
        _CarSuv = ImageVector.Builder(
            name = "Filled.CarSuv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.995f, -2.824f)
                moveToRelative(11f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.995f, -2.824f)
                moveToRelative(-11f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(11f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(-3.562f, -12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.91f, 2.272f)
                lineToRelative(0.433f, 1.728f)
                horizontalLineToRelative(2.219f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(3.02f)
                lineToRelative(-0.01f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.286f, 0.575f)
                lineToRelative(-0.107f, 0.091f)
                lineToRelative(-0.07f, 0.049f)
                lineToRelative(-0.076f, 0.042f)
                lineToRelative(-0.106f, 0.046f)
                lineToRelative(-0.017f, 0.005f)
                lineToRelative(-0.047f, 0.016f)
                lineToRelative(-0.108f, 0.025f)
                lineToRelative(-0.118f, 0.013f)
                lineToRelative(-0.08f, 0.002f)
                lineToRelative(-0.122f, -0.012f)
                lineToRelative(-0.148f, -0.033f)
                lineToRelative(-0.063f, -0.022f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.362f, -0.24f)
                lineToRelative(-0.08f, -0.094f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.2f, -1.6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.2f, 1.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, 0.4f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, -0.4f)
                arcToRelative(3.998f, 3.998f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.402f, 0.002f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.602f, -1.198f)
                curveToRelative(0.493f, -0.66f, 1.11f, -1.2f, 1.804f, -1.602f)
                verticalLineToRelative(-2.792f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -0.35f)
                lineToRelative(0.042f, -0.1f)
                lineToRelative(2.004f, -4.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.894f, -0.553f)
                close()
                moveTo(2f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                moveToRelative(12.438f, 0f)
                horizontalLineToRelative(-3.438f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.718f)
                lineToRelative(-0.31f, -1.243f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.97f, -0.757f)
                moveToRelative(-5.438f, 0f)
                horizontalLineToRelative(-1.382f)
                lineToRelative(-1.001f, 2f)
                horizontalLineToRelative(2.383f)
                close()
            }
        }.build()

        return _CarSuv!!
    }

@Suppress("ObjectPropertyName")
private var _CarSuv: ImageVector? = null
