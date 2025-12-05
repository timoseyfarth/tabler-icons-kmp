package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BallFootball: ImageVector
    get() {
        if (_BallFootball != null) {
            return _BallFootball!!
        }
        _BallFootball = ImageVector.Builder(
            name = "Filled.BallFootball",
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
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                lineToRelative(4.76f, 3.45f)
                lineToRelative(-1.76f, 5.55f)
                horizontalLineToRelative(-6f)
                lineToRelative(-1.76f, -5.55f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                verticalLineToRelative(-4f)
                moveToRelative(3f, 13f)
                lineToRelative(2.5f, 3f)
                moveToRelative(-0.74f, -8.55f)
                lineToRelative(3.74f, -1.45f)
                moveToRelative(-11.44f, 7.05f)
                lineToRelative(-2.56f, 2.95f)
                moveToRelative(0.74f, -8.55f)
                lineToRelative(-3.74f, -1.45f)
            }
        }.build()

        return _BallFootball!!
    }

@Suppress("ObjectPropertyName")
private var _BallFootball: ImageVector? = null
