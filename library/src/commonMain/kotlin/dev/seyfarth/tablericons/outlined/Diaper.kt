package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Diaper: ImageVector
    get() {
        if (_Diaper != null) {
            return _Diaper!!
        }
        _Diaper = ImageVector.Builder(
            name = "Filled.Diaper",
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
                moveTo(3f, 8.323f)
                curveToRelative(0f, -0.579f, 0f, -0.868f, 0.044f, -1.11f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.17f, -2.169f)
                curveToRelative(0.239f, -0.044f, 0.529f, -0.044f, 1.109f, -0.044f)
                horizontalLineToRelative(11.353f)
                curveToRelative(0.579f, 0f, 0.868f, 0f, 1.11f, 0.044f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.169f, 2.17f)
                curveToRelative(0.044f, 0.24f, 0.044f, 0.53f, 0.044f, 1.11f)
                verticalLineToRelative(2.676f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.25f, 19.7f)
                verticalLineToRelative(-1.4f)
                arcToRelative(6.3f, 6.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.3f, -6.3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.75f, 19.7f)
                verticalLineToRelative(-1.4f)
                arcToRelative(6.3f, 6.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.3f, -6.3f)
            }
        }.build()

        return _Diaper!!
    }

@Suppress("ObjectPropertyName")
private var _Diaper: ImageVector? = null
