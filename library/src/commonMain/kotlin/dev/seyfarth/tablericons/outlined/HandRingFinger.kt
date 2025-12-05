package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.HandRingFinger: ImageVector
    get() {
        if (_HandRingFinger != null) {
            return _HandRingFinger!!
        }
        _HandRingFinger = ImageVector.Builder(
            name = "Filled.HandRingFinger",
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
                moveTo(8f, 13f)
                verticalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                verticalLineToRelative(1.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                verticalLineToRelative(4.5f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 6f)
                horizontalLineToRelative(-2f)
                horizontalLineToRelative(0.208f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.012f, -2.7f)
                arcToRelative(69.74f, 69.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.196f, -0.3f)
                curveToRelative(-0.312f, -0.479f, -1.407f, -2.388f, -3.286f, -5.728f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.536f, -2.022f)
                arcToRelative(1.867f, 1.867f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.28f, 0.28f)
                lineToRelative(1.47f, 1.47f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 11.5f)
                verticalLineToRelative(-2f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                verticalLineToRelative(2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                verticalLineToRelative(-6.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                verticalLineToRelative(6.5f)
            }
        }.build()

        return _HandRingFinger!!
    }

@Suppress("ObjectPropertyName")
private var _HandRingFinger: ImageVector? = null
