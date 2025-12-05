package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.OctagonPlus2: ImageVector
    get() {
        if (_OctagonPlus2 != null) {
            return _OctagonPlus2!!
        }
        _OctagonPlus2 = ImageVector.Builder(
            name = "Filled.OctagonPlus2",
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
                moveTo(13.023f, 21.74f)
                lineToRelative(-0.221f, 0.095f)
                curveToRelative(-0.512f, 0.22f, -1.092f, 0.22f, -1.604f, 0f)
                lineToRelative(-5.575f, -2.389f)
                arcToRelative(2.036f, 2.036f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.07f, -1.07f)
                lineToRelative(-2.388f, -5.574f)
                arcToRelative(2.036f, 2.036f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.604f)
                lineToRelative(2.389f, -5.575f)
                curveToRelative(0.206f, -0.48f, 0.589f, -0.863f, 1.07f, -1.07f)
                lineToRelative(5.574f, -2.388f)
                arcToRelative(2.036f, 2.036f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.604f, 0f)
                lineToRelative(5.575f, 2.389f)
                curveToRelative(0.48f, 0.206f, 0.863f, 0.589f, 1.07f, 1.07f)
                lineToRelative(2.388f, 5.574f)
                curveToRelative(0.22f, 0.512f, 0.22f, 1.092f, 0f, 1.604f)
                lineToRelative(-0.081f, 0.19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
        }.build()

        return _OctagonPlus2!!
    }

@Suppress("ObjectPropertyName")
private var _OctagonPlus2: ImageVector? = null
