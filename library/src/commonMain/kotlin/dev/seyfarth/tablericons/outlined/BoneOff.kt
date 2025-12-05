package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BoneOff: ImageVector
    get() {
        if (_BoneOff != null) {
            return _BoneOff!!
        }
        _BoneOff = ImageVector.Builder(
            name = "Filled.BoneOff",
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
                moveTo(12.5f, 8.502f)
                lineToRelative(0.38f, -0.38f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.12f, -2.122f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.12f, 5.122f)
                lineToRelative(-0.372f, 0.372f)
                moveToRelative(-2.008f, 2.008f)
                lineToRelative(-2.378f, 2.378f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.117f, 2.297f)
                lineToRelative(0f, -0.177f)
                lineToRelative(-0.176f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.298f, -5.115f)
                lineToRelative(2.378f, -2.378f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()

        return _BoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _BoneOff: ImageVector? = null
