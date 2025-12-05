package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Cone2: ImageVector
    get() {
        if (_Cone2 != null) {
            return _Cone2!!
        }
        _Cone2 = ImageVector.Builder(
            name = "Filled.Cone2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveToRelative(5.52f, 0f, 10f, 1.494f, 10f, 4.002f)
                verticalLineToRelative(0.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.121f, 0.477f)
                lineToRelative(-8.139f, 15.006f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.489f, -0.016f)
                lineToRelative(-8.13f, -14.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.121f, -0.475f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.509f, 4.48f, -4.004f, 10f, -4.004f)
            }
        }.build()

        return _Cone2!!
    }

@Suppress("ObjectPropertyName")
private var _Cone2: ImageVector? = null
