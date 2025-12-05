package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BrandVercel: ImageVector
    get() {
        if (_BrandVercel != null) {
            return _BrandVercel!!
        }
        _BrandVercel = ImageVector.Builder(
            name = "Filled.BrandVercel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.143f, 3.486f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.714f, 0f)
                lineToRelative(9f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.857f, 1.514f)
                horizontalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.857f, -1.514f)
                close()
            }
        }.build()

        return _BrandVercel!!
    }

@Suppress("ObjectPropertyName")
private var _BrandVercel: ImageVector? = null
