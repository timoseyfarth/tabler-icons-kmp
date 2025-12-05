package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.FilterBolt: ImageVector
    get() {
        if (_FilterBolt != null) {
            return _FilterBolt!!
        }
        _FilterBolt = ImageVector.Builder(
            name = "Filled.FilterBolt",
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
                moveTo(12.991f, 19.67f)
                lineToRelative(-3.991f, 1.33f)
                verticalLineToRelative(-8.5f)
                lineToRelative(-4.48f, -4.928f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.52f, -1.345f)
                verticalLineToRelative(-2.227f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.586f, 1.414f)
                lineToRelative(-4.414f, 4.414f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                lineToRelative(-2f, 3f)
                horizontalLineToRelative(4f)
                lineToRelative(-2f, 3f)
            }
        }.build()

        return _FilterBolt!!
    }

@Suppress("ObjectPropertyName")
private var _FilterBolt: ImageVector? = null
