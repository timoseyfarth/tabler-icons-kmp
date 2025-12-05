package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PointerX: ImageVector
    get() {
        if (_PointerX != null) {
            return _PointerX!!
        }
        _PointerX = ImageVector.Builder(
            name = "Filled.PointerX",
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
                moveTo(15.768f, 13.212f)
                lineToRelative(-0.99f, -0.99f)
                lineToRelative(3.113f, -2.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.309f, -2.228f)
                lineToRelative(-13.582f, -3.904f)
                lineToRelative(3.904f, 13.563f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.228f, 0.308f)
                lineToRelative(2.09f, -3.093f)
                lineToRelative(0.908f, 0.908f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineToRelative(-5f, -5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 22f)
                lineToRelative(5f, -5f)
            }
        }.build()

        return _PointerX!!
    }

@Suppress("ObjectPropertyName")
private var _PointerX: ImageVector? = null
