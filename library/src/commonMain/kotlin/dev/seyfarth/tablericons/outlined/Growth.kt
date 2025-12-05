package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Growth: ImageVector
    get() {
        if (_Growth != null) {
            return _Growth!!
        }
        _Growth = ImageVector.Builder(
            name = "Filled.Growth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 15f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 4.5f)
                moveToRelative(4.5f, -8.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 4.5f)
                moveToRelative(4.5f, -8.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 4.5f)
                moveToRelative(-4f, 3.5f)
                curveToRelative(2.21f, 0f, 4f, 2.015f, 4f, 4.5f)
                moveToRelative(-4f, -8.5f)
                curveToRelative(2.21f, 0f, 4f, 2.015f, 4f, 4.5f)
                moveToRelative(-4f, -8.5f)
                curveToRelative(2.21f, 0f, 4f, 2.015f, 4f, 4.5f)
                moveToRelative(0f, -7.5f)
                verticalLineToRelative(6f)
            }
        }.build()

        return _Growth!!
    }

@Suppress("ObjectPropertyName")
private var _Growth: ImageVector? = null
