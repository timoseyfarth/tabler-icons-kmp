package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Melon: ImageVector
    get() {
        if (_Melon != null) {
            return _Melon!!
        }
        _Melon = ImageVector.Builder(
            name = "Filled.Melon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.77f, 2.62f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.436f, 0.055f)
                arcToRelative(10.96f, 10.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.794f, 7.326f)
                curveToRelative(0f, 6.074f, -4.925f, 10.999f, -10.999f, 10.999f)
                arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.684f, -3.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.008f, -1.438f)
                lineToRelative(4.343f, -4.153f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.352f, -0.027f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.32f, -4.133f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.088f, -1.35f)
                close()
            }
        }.build()

        return _Melon!!
    }

@Suppress("ObjectPropertyName")
private var _Melon: ImageVector? = null
