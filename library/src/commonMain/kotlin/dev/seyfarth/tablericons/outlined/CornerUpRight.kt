package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CornerUpRight: ImageVector
    get() {
        if (_CornerUpRight != null) {
            return _CornerUpRight!!
        }
        _CornerUpRight = ImageVector.Builder(
            name = "Filled.CornerUpRight",
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
                moveTo(6f, 18f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(10f)
                lineToRelative(-4f, -4f)
                moveToRelative(0f, 8f)
                lineToRelative(4f, -4f)
            }
        }.build()

        return _CornerUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _CornerUpRight: ImageVector? = null
