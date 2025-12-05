package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LinkPlus: ImageVector
    get() {
        if (_LinkPlus != null) {
            return _LinkPlus!!
        }
        _LinkPlus = ImageVector.Builder(
            name = "Filled.LinkPlus",
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
                moveTo(9f, 15f)
                lineToRelative(6f, -6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 6f)
                lineToRelative(0.463f, -0.536f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.072f, 0f)
                arcToRelative(4.993f, 4.993f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.001f, 7.072f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.603f, 18.534f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.127f, 0f)
                arcToRelative(4.972f, 4.972f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.071f)
                lineToRelative(0.524f, -0.463f)
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

        return _LinkPlus!!
    }

@Suppress("ObjectPropertyName")
private var _LinkPlus: ImageVector? = null
