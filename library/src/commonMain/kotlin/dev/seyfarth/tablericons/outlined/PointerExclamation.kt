package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PointerExclamation: ImageVector
    get() {
        if (_PointerExclamation != null) {
            return _PointerExclamation!!
        }
        _PointerExclamation = ImageVector.Builder(
            name = "Filled.PointerExclamation",
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
                moveTo(15.97f, 13.414f)
                lineToRelative(-1.192f, -1.192f)
                lineToRelative(3.113f, -2.09f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.309f, -2.228f)
                lineToRelative(-13.582f, -3.904f)
                lineToRelative(3.904f, 13.563f)
                arcToRelative(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.228f, 0.308f)
                lineToRelative(2.09f, -3.093f)
                lineToRelative(2.778f, 2.778f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                verticalLineToRelative(0.01f)
            }
        }.build()

        return _PointerExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _PointerExclamation: ImageVector? = null
