package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Beach: ImageVector
    get() {
        if (_Beach != null) {
            return _Beach!!
        }
        _Beach = ImageVector.Builder(
            name = "Filled.Beach",
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
                moveTo(17.553f, 16.75f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.606f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 3.804f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.196f, 2.196f)
                lineToRelative(10.392f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.196f, -8.196f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.732f, 10f)
                curveToRelative(1.658f, -2.87f, 2.225f, -5.644f, 1.268f, -6.196f)
                curveToRelative(-0.957f, -0.552f, -3.075f, 1.326f, -4.732f, 4.196f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                lineToRelative(-3f, 5.196f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 19.25f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -0.25f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -1f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0.25f)
            }
        }.build()

        return _Beach!!
    }

@Suppress("ObjectPropertyName")
private var _Beach: ImageVector? = null
