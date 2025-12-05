package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PointerPause: ImageVector
    get() {
        if (_PointerPause != null) {
            return _PointerPause!!
        }
        _PointerPause = ImageVector.Builder(
            name = "Filled.PointerPause",
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
                moveTo(15.72f, 13.163f)
                lineToRelative(-0.942f, -0.941f)
                lineToRelative(3.113f, -2.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.309f, -2.228f)
                lineToRelative(-13.582f, -3.904f)
                lineToRelative(3.904f, 13.563f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.228f, 0.308f)
                lineToRelative(2.09f, -3.093f)
                lineToRelative(0.969f, 0.969f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 17f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 17f)
                verticalLineToRelative(5f)
            }
        }.build()

        return _PointerPause!!
    }

@Suppress("ObjectPropertyName")
private var _PointerPause: ImageVector? = null
