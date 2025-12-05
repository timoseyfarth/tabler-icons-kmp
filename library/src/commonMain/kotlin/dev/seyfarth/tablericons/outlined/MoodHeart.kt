package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.MoodHeart: ImageVector
    get() {
        if (_MoodHeart != null) {
            return _MoodHeart!!
        }
        _MoodHeart = ImageVector.Builder(
            name = "Filled.MoodHeart",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.012f, 8.946f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 10f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 15f)
                arcToRelative(3.59f, 3.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.774f, 0.99f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.994f, 21.5f)
                lineToRelative(2.518f, -2.58f)
                arcToRelative(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.004f, -2.413f)
                arcToRelative(1.627f, 1.627f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.346f, -0.005f)
                lineToRelative(-0.168f, 0.172f)
                lineToRelative(-0.168f, -0.172f)
                arcToRelative(1.627f, 1.627f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.346f, -0.004f)
                arcToRelative(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.004f, 2.412f)
                lineToRelative(2.51f, 2.59f)
                close()
            }
        }.build()

        return _MoodHeart!!
    }

@Suppress("ObjectPropertyName")
private var _MoodHeart: ImageVector? = null
