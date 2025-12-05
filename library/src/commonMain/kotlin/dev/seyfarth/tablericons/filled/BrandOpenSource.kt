package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BrandOpenSource: ImageVector
    get() {
        if (_BrandOpenSource != null) {
            return _BrandOpenSource!!
        }
        _BrandOpenSource = ImageVector.Builder(
            name = "Filled.BrandOpenSource",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.283f, 2.004f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.736f, 19.155f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.332f, -0.551f)
                lineToRelative(-2.193f, -5.602f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.456f, -1.245f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.9f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.457f, 1.244f)
                lineToRelative(-2.193f, 5.603f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.332f, 0.552f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.018f, -19.16f)
                close()
            }
        }.build()

        return _BrandOpenSource!!
    }

@Suppress("ObjectPropertyName")
private var _BrandOpenSource: ImageVector? = null
