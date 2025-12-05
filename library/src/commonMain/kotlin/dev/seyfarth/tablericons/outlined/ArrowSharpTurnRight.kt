package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowSharpTurnRight: ImageVector
    get() {
        if (_ArrowSharpTurnRight != null) {
            return _ArrowSharpTurnRight!!
        }
        _ArrowSharpTurnRight = ImageVector.Builder(
            name = "Filled.ArrowSharpTurnRight",
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
                moveTo(7f, 18f)
                verticalLineToRelative(-11.31f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.195f, -0.495f)
                lineToRelative(9.805f, 9.805f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
            }
        }.build()

        return _ArrowSharpTurnRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSharpTurnRight: ImageVector? = null
