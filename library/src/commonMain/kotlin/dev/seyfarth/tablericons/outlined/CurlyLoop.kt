package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurlyLoop: ImageVector
    get() {
        if (_CurlyLoop != null) {
            return _CurlyLoop!!
        }
        _CurlyLoop = ImageVector.Builder(
            name = "Filled.CurlyLoop",
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
                moveTo(21f, 8f)
                curveToRelative(-4f, 0f, -7f, 2f, -7f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                curveToRelative(0f, -3f, -2.5f, -5f, -8f, -5f)
                reflectiveCurveToRelative(-8f, 2f, -8f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                curveToRelative(0f, -3f, -3f, -5f, -7f, -5f)
            }
        }.build()

        return _CurlyLoop!!
    }

@Suppress("ObjectPropertyName")
private var _CurlyLoop: ImageVector? = null
