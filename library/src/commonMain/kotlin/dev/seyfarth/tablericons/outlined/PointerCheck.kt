package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PointerCheck: ImageVector
    get() {
        if (_PointerCheck != null) {
            return _PointerCheck!!
        }
        _PointerCheck = ImageVector.Builder(
            name = "Filled.PointerCheck",
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
                moveTo(17.487f, 14.93f)
                lineToRelative(-2.709f, -2.708f)
                lineToRelative(3.113f, -2.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.309f, -2.228f)
                lineToRelative(-13.582f, -3.904f)
                lineToRelative(3.904f, 13.563f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.228f, 0.308f)
                lineToRelative(2.09f, -3.093f)
                lineToRelative(0.785f, 0.785f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
        }.build()

        return _PointerCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PointerCheck: ImageVector? = null
