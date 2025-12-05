package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowsJoin2: ImageVector
    get() {
        if (_ArrowsJoin2 != null) {
            return _ArrowsJoin2!!
        }
        _ArrowsJoin2 = ImageVector.Builder(
            name = "Filled.ArrowsJoin2",
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
                moveTo(3f, 7f)
                horizontalLineToRelative(1.948f)
                curveToRelative(1.913f, 0f, 3.705f, 0.933f, 4.802f, 2.5f)
                arcToRelative(5.861f, 5.861f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.802f, 2.5f)
                horizontalLineToRelative(6.448f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                horizontalLineToRelative(1.95f)
                arcToRelative(5.854f, 5.854f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.798f, -2.5f)
                arcToRelative(5.854f, 5.854f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.798f, -2.5f)
                horizontalLineToRelative(5.454f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 15f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
        }.build()

        return _ArrowsJoin2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsJoin2: ImageVector? = null
