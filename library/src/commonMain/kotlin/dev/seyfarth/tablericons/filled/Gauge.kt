package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Gauge: ImageVector
    get() {
        if (_Gauge != null) {
            return _Gauge!!
        }
        _Gauge = ImageVector.Builder(
            name = "Filled.Gauge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.995f, -8.336f)
                close()
                moveTo(16.707f, 7.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0f)
                lineToRelative(-2.59f, 2.59f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-0.068f, 0.1f)
                arcToRelative(2.001f, 2.001f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.547f, 1.774f)
                lineToRelative(-0.005f, 0.149f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.917f, -0.701f)
                arcToRelative(0.968f, 0.968f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.195f, -0.152f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.083f, -1.32f)
                close()
                moveTo(12f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.build()

        return _Gauge!!
    }

@Suppress("ObjectPropertyName")
private var _Gauge: ImageVector? = null
