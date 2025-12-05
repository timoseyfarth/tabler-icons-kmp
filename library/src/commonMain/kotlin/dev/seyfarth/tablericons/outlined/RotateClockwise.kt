package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.RotateClockwise: ImageVector
    get() {
        if (_RotateClockwise != null) {
            return _RotateClockwise!!
        }
        _RotateClockwise = ImageVector.Builder(
            name = "Filled.RotateClockwise",
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
                moveTo(4.05f, 11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.5f, 4f)
                moveToRelative(-0.5f, 5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
            }
        }.build()

        return _RotateClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _RotateClockwise: ImageVector? = null
